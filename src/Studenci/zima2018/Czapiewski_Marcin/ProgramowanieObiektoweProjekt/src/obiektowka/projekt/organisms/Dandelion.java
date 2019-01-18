package obiektowka.projekt.organisms;

import obiektowka.projekt.Position;
import obiektowka.projekt.World;

public class Dandelion extends Plant {
    Dandelion(Plant plant) {
        super(plant);
        initParams();
    }

    public Dandelion(Position position, World world) {
        super(position, world);
        initParams();
    }

    @Override
    public void initParams() {
        power = 0;
        initiative = 0;
        liveLength = 6;
        powerToReproduce = 2;
        sign = "D";
    }

    @Override
    public Organism clone() {
        return new Dandelion(this);
    }
}
