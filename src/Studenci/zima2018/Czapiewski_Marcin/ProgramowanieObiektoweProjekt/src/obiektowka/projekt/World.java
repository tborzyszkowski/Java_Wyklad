package obiektowka.projekt;

import obiektowka.projekt.organisms.Animal;
import obiektowka.projekt.organisms.Organism;
import obiektowka.projekt.organisms.Wolf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class World {
    private int worldX;
    private int worldY;
    private int turn;
    private ArrayList<Organism> organisms;
    private ArrayList<Organism> newOrganisms;
    private String separator;

    public World(int worldX, int worldY) {
        this.worldX = worldX;
        this.worldY = worldY;
        turn = 0;
        organisms = new ArrayList<>();
        newOrganisms = new ArrayList<>();
        separator = " ";
    }

    public void makeTurn() {
        for (var org : organisms) {
            if (positionOnBoard(org.getPosition())) {
                var actions = org.move();
                for (var a : actions) {
                    makeMove(a);
                }

                if (positionOnBoard(org.getPosition())) {
                    actions = org.action();
                    for(var a : actions) {
                        makeMove(a);
                    }
                }
            }
        }

        organisms.removeIf(o -> !positionOnBoard(o.getPosition()));

        for (var org : organisms) {
            org.setLiveLength(org.getLiveLength() - 1);
            org.setPower(org.getPower() + 1);

            if (org.getLiveLength() < 1) {
                System.out.println(org. getClass().getSimpleName() + ": died of old age at: " + org.getPosition().toString());
            }
        }

        organisms.removeIf(o -> o.getLiveLength() <= 0);

        newOrganisms.removeIf(n -> !positionOnBoard(n.getPosition()));

        organisms.addAll(newOrganisms);
        organisms.sort(Comparator.comparing(Organism::getInitiative).reversed());

        newOrganisms.clear();

        turn++;
    }

    public boolean addOrganism(Organism newOrganism) {
        if (positionOnBoard(newOrganism.getPosition())) {
            organisms.add(newOrganism);
            organisms.sort(Comparator.comparing(Organism::getInitiative).reversed());

            return true;
        }

        return false;
    }

    public Organism getOrganismOnPosition(Position position) {
        Organism organism = null;

        for (var org : organisms) {
            if (org.getPosition().equals(position)) {
                organism = org;
            }
        }

        if (organism == null) {
            for (var org : newOrganisms) {
                if (org.getPosition().equals(position)) {
                    organism = org;
                }
            }
        }

        return organism;
    }

    public List<Position> getNeighbouringPositions(Position position) {
        var neighbouringPositions = new ArrayList<Position>();
        for (int y = -1; y < 2; y++) {
            for (int x = -1; x < 2; x++) {
                var neighbouringPosition = new Position(position.getX() + x, position.getY() + y);
                if (positionOnBoard(neighbouringPosition) && !(neighbouringPosition.getX() == 0 && neighbouringPosition.getY() == 0)) {
                    neighbouringPositions.add(neighbouringPosition);
                }
            }
        }

        return neighbouringPositions;
    }

    public List<Position> filterFreePositions(Iterable<Position> positions) {
        var freePositions = new ArrayList<Position>();

        for (var pos : positions) {
            if(getOrganismOnPosition(pos) == null) {
                freePositions.add(pos);
            }
        }

        return freePositions;
    }

    public List<Position> filterPositionsWithoutAnimals(Iterable<Position> positions) {
        var freePositions = new ArrayList<Position>();

        for (var pos : positions) {
            var orgFromPos = getOrganismOnPosition(pos);
            if (orgFromPos == null || !(orgFromPos instanceof Animal)) {
                freePositions.add(pos);
            }
        }

        return freePositions;
    }

    public List<Position> filterPositionsWithOtherSpecies(Iterable<Position> positions) {
        var fields = new ArrayList<Position>();

        for (var pos : positions) {
            var orgFromPos = getOrganismOnPosition(pos);
            if (orgFromPos != null && !(orgFromPos instanceof Wolf)) {
                fields.add(pos);
            }
        }

        return fields;
    }

    private void makeMove(Action action) {
        System.out.println(action.toString());

        var actionType = action.getActionType();

        if (actionType == ActionEnum.A_ADD) {
            newOrganisms.add(action.getOrganism());
        }
        else if (actionType == ActionEnum.A_INCREASEPOWER) {
            var currentPower = action.getOrganism().getPower();
            action.getOrganism().setPower(currentPower + action.getValue());
        }
        else if (actionType == ActionEnum.A_MOVE) {
            action.getOrganism().setPosition(action.getPosition());
        }
        else if (actionType == ActionEnum.A_REMOVE) {
            action.getOrganism().setPosition(new Position(-1, -1));
        }
    }

    private boolean positionOnBoard(Position position) {
        return position.getX() >= 0 && position.getY() >= 0 && position.getX() < worldX && position.getY() < worldY;
    }

    @Override
    public String toString() {
        var result = "\nturn: " + turn + "\n";
        for(int y = 0; y < worldY; y++) {
            for (int x = 0; x < worldX; x++) {
                var org = getOrganismOnPosition(new Position(x, y));
                if (org != null) {
                    result += org.getSign();
                }
                else {
                    result += separator;
                }
            }

            result += '\n';
        }

        return result;
    }
}
