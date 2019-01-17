package obiektowka.projekt.organisms;

import obiektowka.projekt.Action;
import obiektowka.projekt.Position;
import obiektowka.projekt.World;
import obiektowka.projekt.enums.ActionEnum;

import java.util.ArrayList;
import java.util.List;

public class Sheep extends Animal {
    Sheep(Animal animal) {
        super(animal);
        initParams();
    }

    public Sheep(Position position, World world) {
        super(position, world);
        initParams();
    }

    @Override
    public void initParams() {
        power = 4;
        initiative = 3;
        liveLength = 5;
        powerToReproduce = 5;
        sign = "S";
    }

    @Override
    public Organism clone() {
        return new Sheep(this);
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
        }
        else {
            consequences.add(new Action(ActionEnum.A_REMOVE, new Position(-1, -1), 0, this));
            if (attackingOrganism instanceof Wolf || attackingOrganism instanceof Bear) {
                attackingOrganism.power++;
            }
        }

        return consequences;
    }
}
