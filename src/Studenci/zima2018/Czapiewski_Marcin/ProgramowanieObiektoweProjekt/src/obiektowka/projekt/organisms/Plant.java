package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;
import obiektowka.projekt.enums.ActionEnum;

import java.util.ArrayList;
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

    @Override
    public Iterable<Action> getConsequences(Organism attackingOrganism) {
        var consequences = new ArrayList<Action>();

        if (power > attackingOrganism.power) {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, attackingOrganism));
        }
        else {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, this));
            if (attackingOrganism instanceof Sheep) {
                attackingOrganism.power += 4;
            }
        }

        return consequences;
    }
}
