package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.ActionEnum;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Organism {
    protected int power;
    protected int initiative;
    protected Position position;
    protected int liveLength;
    protected int powerToReproduce;
    protected String sign;
    protected World world;

    Organism(Organism organism) {
        power = organism.power;
        initiative = organism.initiative;
        position = organism.position;
        liveLength = organism.liveLength;
        powerToReproduce = organism.powerToReproduce;
        sign = organism.sign;
        world = organism.world;
    }

    Organism(Position position, World world) {
        this.position = position;
        this.world = world;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getInitiative() {
        return initiative;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getLiveLength() {
        return liveLength;
    }

    public void setLiveLength(int liveLength) {
        this.liveLength = liveLength;
    }

    public String getSign() {
        return sign;
    }

    public abstract Iterable<Action> move();

    public abstract void initParams();

    public abstract Organism clone();

    public Iterable<Action> action() {
        var result = new ArrayList<Action>();
        var birthPositions = getFreeNeighbouringPositions();

        if (ifReproduce() && !birthPositions.isEmpty()) {
            Random generator = new Random();

            var newOrganismPosition = birthPositions.get(generator.nextInt(birthPositions.size()));
            var newOrganism = clone();
            newOrganism.position = newOrganismPosition;

            power = power / 2;
            result.add(new Action(ActionEnum.A_ADD, newOrganismPosition, 0, newOrganism));
        }

        return result;
    }

    public Iterable<Action> getConsequences(Organism attackingOrganism) {
        var consequences = new ArrayList<Action>();

        if (power > attackingOrganism.power) {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, attackingOrganism));
        } else {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, this));
        }

        return consequences;
    }

    public boolean ifReproduce() {
        return power >= powerToReproduce;

    }

    protected List<Position> getFreeNeighbouringPositions() {
        return world.filterFreePositions(world.getNeighbouringPositions(position));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " +
                "power=" + power +
                ", initiative=" + initiative +
                ", position=" + position +
                ", liveLength=" + liveLength +
                '}';
    }
}
