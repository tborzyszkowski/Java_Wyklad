package Animal;

import Position.Position;
import World.World;

import java.util.List;

public class Sheep extends Animal
{
    public Sheep(Sheep sheep, Position position, World world)
    {
        super(sheep, position, world);
    }

    @Override
    public Sheep clone()
    {
        return new Sheep(this, null, null);
    }

    public void initParams(){
        this.setPower(3);
        this.setInitiative(3);
        this.setLiveLength(15);
        this.setPowerToReproduce(10);
        this.setFoodChain(2);
        this.setSign("S");
    }

    @Override
    protected List<Position> getNeighboringPosition()
    {
        return this.getWorld().filterPositionsWithoutAnimals(this.getWorld().getNeighboringPositions(this.getPosition()));
    }
}
