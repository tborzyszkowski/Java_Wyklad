package Animal;

import Position.*;
import World.*;

public class Grass extends Plant
{
    public Grass(Grass grass, Position position, World world)
    {
        super(grass, position, world);
    }

    @Override
    public Grass clone()
    {
        return new Grass(this, null, null);
    }

    public void initParams()
    {
        this.setPower(0);
        this.setInitiative(0);
        this.setLiveLength(10);
        this.setPowerToReproduce(5);
        this.setFoodChain(1);
        this.setSign("I");
    }

}
