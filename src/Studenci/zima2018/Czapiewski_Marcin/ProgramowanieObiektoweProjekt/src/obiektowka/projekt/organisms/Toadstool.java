package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.Enums.ActionEnum;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;

import java.util.ArrayList;

public class Toadstool extends Plant {
    Toadstool(Plant plant) {
        super(plant);
        initParams();
    }

    public Toadstool(Position position, World world) {
        super(position, world);
        initParams();
    }

    @Override
    public void initParams() {
        power = 0;
        initiative = 0;
        liveLength = 10;
        powerToReproduce = 5;
        sign = "T";
    }

    @Override
    public Organism clone() {
        return new Toadstool(this);
    }

    @Override
    public Iterable<Action> getConsequences(Organism attackingOrganism) {
        var consequences = new ArrayList<Action>();

        if (power > attackingOrganism.power) {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, attackingOrganism));
        }
        else {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, this));
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, attackingOrganism));
        }

        return consequences;
    }
}
