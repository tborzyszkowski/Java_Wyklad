package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.ActionEnum;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class Plant extends Organism {
    Plant(Plant plant) {
        super(plant);
    }

    Plant(Position position, World world) {
        super(position, world);
    }

    @Override
    public Iterable<Action> move() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Iterable<Action> action() {
        var result = new ArrayList<Action>();

        if (ifReproduce()) {
            var pomPositions = getFreeNeighbouringPositions(super.position);

            if (!pomPositions.isEmpty()) {
                Random generator = new Random();

                var newPosition = pomPositions.get(generator.nextInt(pomPositions.size()));
                var newPlant = clone();
                newPlant.position = newPosition;
                power = power / 2;
                result.add(new Action(ActionEnum.A_ADD, newPosition, 0,newPlant));
            }
        }

        return result;
    }

    public List<Position> getFreeNeighbouringPositions(Position position) {
        return world.filterFreePositions(world.getNeighbouringPositions(position));
    }
}
