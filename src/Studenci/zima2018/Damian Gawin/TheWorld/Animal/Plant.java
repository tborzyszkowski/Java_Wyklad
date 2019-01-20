package Animal;

import Action.*;
import Position.*;
import World.World;

import java.util.*;

public abstract class Plant extends Organism
{
    Plant(Plant plant, Position position, World world)
    {
        super(plant, position, world);
    }

    public List<Action> move()
    {
        return new ArrayList<Action>();
    }

    public List<Action> action()
    {
        List<Action> results = new ArrayList<>();
        Organism newPlant;
        Position newPosition;

        if (this.ifReproduce())
        {
            List<Position> pomPositions = this.getFreeNeighboringPosition(this.getPosition());

            if (pomPositions != null && !(pomPositions.isEmpty()))
            {
                Random randomPosition = new Random();
                int index = randomPosition.nextInt(pomPositions.size());
                newPosition = pomPositions.get(index);

                newPlant = this.clone();
                newPlant.initParams();
                newPlant.setPosition(newPosition);

                pomPositions.remove(newPosition);

                this.setPower(this.getPower() / 2);
                results.add(new Action(ActionEnum.getAction(ActionEnum.A_ADD), newPosition, 0, newPlant));
            }

        }
        return results;
    }

    private List<Position> getFreeNeighboringPosition(Position position)
    {
        return this.getWorld().filterFreePositions(this.getWorld().getNeighboringPositions(position));
    }
}
