package obiektowka.projekt.organisms;

import obiektowka.projekt.Position;
import obiektowka.projekt.World;

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
        power = 10;
        initiative = 5;
        liveLength = 12;
        powerToReproduce = 14;
        sign = "W";
    }

    @Override
    public Organism clone() {
        return new Wolf(this);
    }
}
