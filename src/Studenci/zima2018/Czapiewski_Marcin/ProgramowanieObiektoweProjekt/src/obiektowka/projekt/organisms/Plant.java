package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;

import java.util.Collections;

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
}
