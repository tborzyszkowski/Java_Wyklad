package Animal;

import Action.*;
import Position.*;
import World.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class Animal extends Organism
{
    private Position lastPosition;

    Animal(Animal animal, Position position, World world)
    {
        super(animal, position, world);
        this.lastPosition = position;
    }

    public Position getLastPosition()
    {
        return lastPosition;
    }

    private void setLastPosition(Position lastPosition)
    {
        this.lastPosition = lastPosition;
    }

    public List<Action> move()
    {
        List<Action> results = new ArrayList<>();
        List<Position> pomPositions = this.getNeighboringPosition();
        Position newPosition;

        if (pomPositions != null && !(pomPositions.isEmpty()))
        {
            Random randomPosition = new Random();
            int index = randomPosition.nextInt(pomPositions.size());
            newPosition = pomPositions.get(index);
            results.add(new Action(ActionEnum.getAction(ActionEnum.A_MOVE), newPosition, 0, this));
            this.setLastPosition(this.getPosition());

            Organism metOrganism = this.getWorld().getOrganismFromPosition(newPosition);
            if (metOrganism != null)
                results.addAll(metOrganism.consequences(this));
        }
        return results;
    }

    public List<Action> action()
    {
        List<Action> results = new ArrayList<>();
        Organism newAnimal;
        List<Position> birthPositions = this.getNeighboringBirthPosition();

        if (birthPositions != null && this.ifReproduce() && !birthPositions.isEmpty())
        {
            Random randomPosition = new Random();
            int index = randomPosition.nextInt(birthPositions.size());
            Position newAnimalPosition = birthPositions.get(index);
            newAnimal = this.clone();
            newAnimal.initParams();
            newAnimal.setPosition(newAnimalPosition);
            this.setPower(this.getPower() / 2);
            results.add(new Action(ActionEnum.getAction(ActionEnum.A_ADD), newAnimalPosition, 0, newAnimal));
        }
        return results;
    }

    protected List<Position> getNeighboringPosition()
    {
        return this.getWorld().getNeighboringPositions(this.getPosition());
    }

    private List<Position> getNeighboringBirthPosition()
    {
         return this.getWorld().filterFreePositions(this.getWorld().getNeighboringPositions(this.getPosition()));
    }


}
