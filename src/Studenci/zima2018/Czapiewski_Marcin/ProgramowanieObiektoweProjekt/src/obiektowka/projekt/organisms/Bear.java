package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;
import obiektowka.projekt.enums.ActionEnum;

import java.util.ArrayList;

public class Bear extends Animal {
    Bear(Animal animal) {
        super(animal);
        initParams();
    }

    public Bear(Position position, World world) {
        super(position, world);
        initParams();
    }

    @Override
    public void initParams() {
        power = 27;
        initiative = 4;
        liveLength = 12;
        powerToReproduce = 8;
        sign = "T";
    }

    @Override
    public Organism clone() {
        return new Bear(this);
    }

    @Override
    public Iterable<Action> getConsequences(Organism attackingOrganism) {
        var consequences = new ArrayList<Action>();

        if (power > attackingOrganism.power) {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, attackingOrganism));
            power += 2;
        }
        else {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, this));
            if (attackingOrganism instanceof Wolf) {
                attackingOrganism.power += 3;
            }
        }

        return consequences;
    }
}
