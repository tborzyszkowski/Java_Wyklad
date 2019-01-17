package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;
import obiektowka.projekt.enums.ActionEnum;

import java.util.ArrayList;

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
        power = 11;
        initiative = 6;
        liveLength = 9;
        powerToReproduce = 13;
        sign = "W";
    }

    @Override
    public Iterable<Action> getConsequences(Organism attackingOrganism) {
        var consequences = new ArrayList<Action>();

        if (power > attackingOrganism.power) {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, attackingOrganism));
        } else {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, this));
            if (attackingOrganism instanceof Bear) {
                attackingOrganism.power++;
            }
        }

        return consequences;
    }

    @Override
    public Organism clone() {
        return new Wolf(this);
    }
}
