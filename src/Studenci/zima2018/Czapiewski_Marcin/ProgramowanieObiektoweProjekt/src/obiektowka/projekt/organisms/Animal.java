package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.enums.ActionEnum;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Animal extends Organism {
    protected Position lastPosition;

    Animal(Animal animal) {
        super(animal);
    }

    Animal(Position position, World world) {
        super(position, world);
    }

    @Override
    public Iterable<Action> move() {
        var result = new ArrayList<Action>();
        var pomPositions = getNeighbouringPositions();

        if (!pomPositions.isEmpty()) {
            Random generator = new Random();

            var newPosition = pomPositions.get(generator.nextInt(pomPositions.size()));
            result.add(new Action(ActionEnum.A_MOVE, newPosition, 0, this));
            lastPosition = position;
            var metOrganism = world.getOrganismOnPosition(newPosition);
            if (metOrganism != null) {
                result.addAll((ArrayList<Action>) metOrganism.getConsequences(this));
            }
        }

        return result;
    }

    public List<Position> getNeighbouringPositions() {
        return world.getNeighbouringPositions(position);
    }
}
