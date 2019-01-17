package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;
import obiektowka.projekt.enums.ActionEnum;

import java.util.ArrayList;
import java.util.Collections;

public class Hive extends Animal {
    Hive(Animal animal) {
        super(animal);
        initParams();
    }

    public Hive(Position position, World world) {
        super(position, world);
        initParams();
    }

    @Override
    public Iterable<Action> move() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public void initParams() {
        power = 6;
        initiative = 0;
        liveLength = 50;
        powerToReproduce = 40;
        sign = "H";
    }

    @Override
    public Organism clone() {
        return new Hive(this);
    }

    @Override
    public Iterable<Action> getConsequences(Organism attackingOrganism) {
        var consequences = new ArrayList<Action>();

        if (attackingOrganism instanceof Bear) {
            attackingOrganism.power += 3;
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, this));
        }
        else if (power > attackingOrganism.power) {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, attackingOrganism));
        }
        else if (attackingOrganism instanceof Bear) {
            attackingOrganism.power += 3;
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, this));
        }
        else {
            var neighbouringPositions = world.getNeighbouringPositions(position);
            for (var pos : neighbouringPositions) {
                if (world.getOrganismOnPosition(pos) == null) {
                    consequences.add(new Action(ActionEnum.A_MOVE, pos, 0, this));
                    attackingOrganism.power /= 2;
                    return consequences;
                }
            }

            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, this));
            attackingOrganism.power /= 2;
        }

        return consequences;
    }
}
