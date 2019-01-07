package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.ActionEnum;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;

import java.util.ArrayList;

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

    public void setInitiative(int initiative) {
        this.initiative = initiative;
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

    public int getPowerToReproduce() {
        return powerToReproduce;
    }

    public void setPowerToReproduce(int powerToReproduce) {
        this.powerToReproduce = powerToReproduce;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public abstract Iterable<Action> move();
    public abstract Iterable<Action> action();
    public abstract void initParams();
    public abstract Organism clone();

    public Iterable<Action> getConsequences(Organism attackingOrganism) {
        var consequences = new ArrayList<Action>();

        if (power > attackingOrganism.power) {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1),0, attackingOrganism));
        }
        else {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, this));
        }

        return consequences;
    }

    public boolean ifReproduce() {
        if (power >= powerToReproduce)
                return true;

        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": " +
                "power=" + power +
                ", initiative=" + initiative +
                ", position=" + position +
                ", liveLength=" + liveLength +
                '}';
    }
}
