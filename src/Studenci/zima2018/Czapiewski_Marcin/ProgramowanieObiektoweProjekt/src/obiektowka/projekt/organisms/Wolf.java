package obiektowka.projekt.organisms;

import obiektowka.projekt.Position;
import obiektowka.projekt.World;

import java.util.List;

public class Wolf extends Animal {
    Wolf(Animal animal) {
        super(animal);
        initParams();
    }

    public Wolf(Position position, World world) {
        super(position, world);
        initParams();
    }

    @Override
    public void initParams() {
        power = 6;
        initiative = 5;
        liveLength = 15;
        powerToReproduce = 12;
        sign = "W";
    }

    @Override
    public Organism clone() {
        return new Wolf(this);
    }

    @Override
    public List<Position> getNeighbouringPositions() {
        return world.filterPositionsWithOtherSpecies(world.getNeighbouringPositions(position));
    }
}
