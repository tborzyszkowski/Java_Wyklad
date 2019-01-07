package obiektowka.projekt.organisms;

import obiektowka.projekt.Position;
import obiektowka.projekt.World;

import java.util.List;

public class Sheep extends Animal {
    Sheep(Animal animal) {
        super(animal);
        initParams();
    }

    public Sheep(Position position, World world) {
        super(position, world);
        initParams();
    }

    @Override
    public void initParams() {
        power = 3;
        initiative = 3;
        liveLength = 10;
        powerToReproduce = 6;
        sign = "S";
    }

    @Override
    public Organism clone() {
        return new Sheep(this);
    }

    public List<Position> getNeighbouringPositions() {
        return world.filterPositionsWithoutAnimals(world.getNeighbouringPositions(position));
    }
}
