package Animal;
import Position.*;
import World.*;

import java.util.List;

public class Wolf extends  Animal
{
    public Wolf(Wolf wolf, Position position, World world)
    {
        super(wolf, position, world);
    }

    public void initParams()
    {
        this.setPower(6);
        this.setInitiative(5);
        this.setLiveLength(15);
        this.setPowerToReproduce(14);
        this.setFoodChain(3);
        this.setSign("W");
    }

    @Override
    public Wolf clone(){
        return new Wolf(this, null, null);
    }

    @Override
    protected List<Position> getNeighboringPosition()
    {
        return this.getWorld().filterPositionsWithOtherSpecies(this.getWorld().getNeighboringPositions(this.getPosition()));
    }
}
