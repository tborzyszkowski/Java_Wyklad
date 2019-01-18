package obiektowka.projekt.organisms;

import obiektowka.projekt.Position;
import obiektowka.projekt.World;

public class Grass extends Plant {
    public Grass(Plant plant) {
        super(plant);
        initParams();
    }

    public Grass(Position position, World world) {
        super(position, world);
        initParams();
    }

    @Override
    public void initParams() {
        power = 0;
        initiative = 0;
        liveLength = 6;
        powerToReproduce = 3;
        sign = "G";
    }

    @Override
    public Organism clone() {
        return new Grass(this);
    }
}
