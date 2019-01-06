package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;

import java.util.ArrayList;
import java.util.Collections;

public class Plant extends Organism {
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
        //TODO
        }

        return result;
    }

    public Iterable<Position> getFreeNeighbouringPositions() {
        return  null;
    }

    @Override
    public void initParams() {

    }

    @Override
    public Organism clone() {
        return null;
    }
}
