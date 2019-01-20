import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@SuppressWarnings("WeakerAccess")
public class World {
    protected Coordinates size;
    protected MyFrame myFrame;
    protected ArrayList<Organism> organismArray = new ArrayList<>();
    protected ArrayList<String> organismList = new ArrayList<>();
    protected String[] animalsArr = {"Sheep", "Wolf", "Bear"};
    protected String[] plantsArr = {"Grass", "Muschroom"};
    protected ArrayList<NewOrganism> queueSpawnOrganism = new ArrayList<>();
    protected int minOrganismQty = 60;
    protected WorldBoard worldBoard;

    public World(int x, int y) {
        this.size = new Coordinates(x, y);

        organismList.addAll(Arrays.asList(animalsArr));
        organismList.addAll(Arrays.asList(plantsArr));
    }

    public void addOrganism(String name, Coordinates coordinates) {
        Organism newOrganism;

        switch (name) {
            case "Grass":
                newOrganism = new Grass(coordinates, this);
                break;

            case "Sheep":
                newOrganism = new Sheep(coordinates, this);
                break;

            case "Wolf":
                newOrganism = new Wolf(coordinates, this);
                break;

            case "Muschroom":
                newOrganism = new Muschroom(coordinates, this);
                break;

            case "Bear":
                newOrganism = new Bear(coordinates, this);
                break;

                default:
                    newOrganism = null;
        }

        organismArray.add(newOrganism);
    }

    public void addToQueueOrganism(String name, Coordinates coordinates) {
        queueSpawnOrganism.add(new NewOrganism(name, coordinates.x, coordinates.y, worldBoard));
    }

    public void spawnOrganism() {
        for (NewOrganism newOrganism : queueSpawnOrganism) {
            addOrganism(newOrganism.getName(), new Coordinates(newOrganism.getX(), newOrganism.getY()));
        }

        queueSpawnOrganism.clear();
    }

    public void drawWorld() {
        myFrame.clearSpecifiedField();
        organismArray.forEach((organism) -> {
            if (!organism.isDestroyed()) {
                myFrame.setLabelOnArea(organism.getShort_name(), organism.getCoordinates().x, organism.getCoordinates().y);
            }
        });

        this.spawnOrganism();
    }

    public boolean onArea(Coordinates coordinates) {
        return coordinates.x >= 0 && coordinates.x < size.x && coordinates.y >= 0 && coordinates.y < size.y;
    }

    public boolean freeArea(Coordinates coordinates, boolean spawn) {
        for (Organism organism : organismArray) {
            if (!organism.isDestroyed() && spawn) {
                if (coordinates.equals(organism.getCoordinates())) return false;
            }
        }

        return true;
    }

    public int countOrganism(String name) {
        int count = 0;
        for (Organism organism : organismArray) {
            if (organism.getName().equals(name) && !organism.isDestroyed()) {
                count++;
            }
        }

        return count;
    }

    public void removeOrganism(Organism organism) {
        organism.setDestroyed(true);
    }

    public Organism getNearestOrganism(Coordinates coordinates) {
        Organism nerest_organism = null;

        for (Organism organism : organismArray) {
            if (organism.getName().equals("Sheep") && !organism.isDestroyed()) {
                if (nerest_organism == null) nerest_organism = organism;

                if ((Math.abs(coordinates.x - organism.getCoordinates().x)
                        <= Math.abs(coordinates.x - nerest_organism.getCoordinates().x))
                        && (Math.abs(coordinates.x - organism.getCoordinates().x)
                        <= Math.abs(coordinates.x - nerest_organism.getCoordinates().x))) {
                    nerest_organism = organism;
                }
            }
        }

        return nerest_organism;
    }

    public Coordinates randomCoordinates(Coordinates basicCoordinates, int movement, boolean spawn) {
        Random rand = new Random();
        Coordinates coordinates = new Coordinates(basicCoordinates.x, basicCoordinates.y);

        int moveRemaining = movement;
        while (moveRemaining > 0) {
            int try_count = 10;  // block for infinity loop
            do {
                for (int i = 0; i < 5; i++) {
                    coordinates = new Coordinates(coordinates.x + (rand.nextInt(3) - 1),
                            coordinates.y + (rand.nextInt(3) - 1));

                    if (freeArea(coordinates, spawn)) break;
                }

                if (try_count-- == 0) {
                    coordinates = basicCoordinates;
                    break;
                }
            } while (!onArea(coordinates));
            moveRemaining--;
        }

        return coordinates;
    }

    public void checkCollision(Organism organism) {
        for (Organism org : organismArray) {
            if (organism.getCoordinates().equals(org.getCoordinates())
                    && !organism.equals(org) && !organism.isDestroyed()) {
                organism.collision(org);
                break;
            }
        }
    }
}
