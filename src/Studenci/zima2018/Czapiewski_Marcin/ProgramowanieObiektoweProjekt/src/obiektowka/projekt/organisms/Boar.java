package obiektowka.projekt.organisms;

import obiektowka.projekt.Position;
import obiektowka.projekt.World;

import java.util.List;

public class Boar extends Animal {
    Boar(Animal animal) {
        super(animal);
        initParams();
    }

    public Boar(Position position, World world) {
        super(position, world);
        initParams();
    }

    @Override
    public void initParams() {
        power = 7;
        initiative = 4;
        liveLength = 11;
        powerToReproduce = 12;
        sign = "B";
    }

    @Override
    public Organism clone() {
        return new Boar(this);
    }

    @Override
    public List<Position> getNeighbouringPositions() {
        return world.filterPositionsWithoutAnimals(world.getNeighbouringPositions(position));
    }
}
