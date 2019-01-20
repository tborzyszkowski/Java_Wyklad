package Animal;

import Action.*;
import Position.*;
import World.*;

import java.util.*;
import java.util.List;

public abstract class Organism
{
    private Integer power;
    private Integer liveLength;
    private Integer powerToReproduce;
    private Position position;
    private World world;
    private Integer initiative;
    private Integer foodChain;
    private String sign;

    Organism(Organism organism, Position position, World world)
    {
        this.power = null;
        this.liveLength = null;
        this.powerToReproduce = null;
        this.position = null;
        this.world = null;
        this.initiative = null;
        this.foodChain = null;
        this.sign = null;

        if(organism != null)
        {
            this.power = organism.power;
            this.liveLength = organism.liveLength;
            this.powerToReproduce = organism.powerToReproduce;
            this.position = organism.position;
            this.world = organism.world;
            this.initiative = organism.initiative;
            this.foodChain = organism.foodChain;
            this.sign = organism.sign;
        }
        else
        {
            if (position != null)
                this.position = position;
            if(world != null)
                this.world = world;
            this.initParams();
        }
    }

    public Integer getPower()
    {
        return power;
    }

    public void setPower(Integer power)
    {
        this.power = power;
    }

    public Integer getLiveLength()
    {
        return liveLength;
    }

    public void setLiveLength(Integer liveLength)
    {
        this.liveLength = liveLength;
    }

    private Integer getPowerToReproduce()
    {
        return powerToReproduce;
    }

    void setPowerToReproduce(Integer powerToReproduce)
    {
        this.powerToReproduce = powerToReproduce;
    }

    public Position getPosition()
    {
        return position;
    }

    public void setPosition(Position position)
    {
        this.position = position;
    }

    World getWorld()
    {
        return world;
    }

    void setWorld(World world)
    {
        this.world = world;
    }

    public Integer getInitiative()
    {
        return initiative;
    }

    void setInitiative(Integer initiative)
    {
        this.initiative = initiative;
    }

    private Integer getFoodChain()
    {
        return foodChain;
    }

    void setFoodChain(Integer foodChain)
    {
        this.foodChain = foodChain;
    }

    public String getSign()
    {
        return sign;
    }

    void setSign(String sign)
    {
        this.sign = sign;
    }

    List<Action> consequences(Organism attackedOrganism)
    {
        List<Action> result = new ArrayList<>();
        if (this.getFoodChain() > attackedOrganism.getFoodChain())
        {
            result.add(new Action(ActionEnum.getAction(ActionEnum.A_REMOVE), new Position(-1, -1), 0, attackedOrganism));
                this.setPower(this.getPower() + 2);
        } else if (this.getFoodChain() < attackedOrganism.getFoodChain())
        {
            result.add(new Action(ActionEnum.getAction(ActionEnum.A_REMOVE), new Position(-1, -1), 0, this));
            attackedOrganism.setPower(attackedOrganism.getPower() + 2);
        }
        return result;
    }

    boolean ifReproduce()
    {
        return this.getPower() >= this.getPowerToReproduce();
    }

    public abstract List<Action> move();

    public abstract List<Action> action();

    public abstract Organism clone();

    public abstract void initParams();

}
