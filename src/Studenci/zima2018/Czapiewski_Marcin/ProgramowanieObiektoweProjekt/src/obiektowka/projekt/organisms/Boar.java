package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;
import obiektowka.projekt.enums.ActionEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Boar extends Animal {
    Boar(Animal animal) {
        super(animal);
        initParams();
    }

    public Boar(Position position, World world) {
        super(position, world);
        initParams();
    }

    @Override
    public void initParams() {
        power = 6;
        initiative = 4;
        liveLength = 11;
        powerToReproduce = 8;
        sign = "B";
    }

    @Override
    public Organism clone() {
        return new Boar(this);
    }

    @Override
    public List<Position> getNeighbouringPositions() {
        return world.filterPositionsWithoutAnimals(world.getNeighbouringPositions(position));
    }

    @Override
    public Iterable<Action> getConsequences(Organism attackingOrganism) {
        var consequences = new ArrayList<Action>();

        if (power > attackingOrganism.power) {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, attackingOrganism));
        } else {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, this));
            if (attackingOrganism instanceof Bear || attackingOrganism instanceof Wolf) {
                var rnd = new Random();
                if(rnd.nextInt() % 10 == 0) {
                    consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, attackingOrganism));
                }
                else {
                    attackingOrganism.power++;
                }
            }
        }

        return consequences;
    }
}
