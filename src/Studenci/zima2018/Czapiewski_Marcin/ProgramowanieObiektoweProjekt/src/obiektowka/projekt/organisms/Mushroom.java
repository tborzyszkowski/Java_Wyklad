package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.enums.ActionEnum;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;

import java.util.ArrayList;

public class Mushroom extends Plant {
    Mushroom(Plant plant) {
        super(plant);
        initParams();
    }

    public Mushroom(Position position, World world) {
        super(position, world);
        initParams();
    }

    @Override
    public void initParams() {
        power = 0;
        initiative = 0;
        liveLength = 6;
        powerToReproduce = 4;
        sign = "M";
    }

    @Override
    public Organism clone() {
        return new Mushroom(this);
    }

    @Override
    public Iterable<Action> getConsequences(Organism attackingOrganism) {
        var consequences = new ArrayList<Action>();

        if (power > attackingOrganism.power) {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, attackingOrganism));
        }
        else if (attackingOrganism instanceof Boar) {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, this));
            attackingOrganism.power+=3;
        }
        else {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, this));
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, attackingOrganism));
        }

        return consequences;
    }
}
