package Action;

import Organism.Organism;
import Position.Position;

import java.util.HashMap;
import java.util.Map;

public class Action{
    private Integer action;
    private Position position;
    private Integer value;
    private Organism organism;


    public Action(Integer action, Position position, Integer value, Organism organism) {
        this.action = action;
        this.position = position;
        this.value = value;
        this.organism = organism;
    }

    public Integer getAction() {
        return action;
    }

    public Position getPosition() {
        return position;
    }

    public Integer getValue() {
        return value;
    }

    public Organism getOrganism() {
        return organism;
    }

    @Override
    public String toString() {
        String className = this.organism.getClass().getSimpleName();
        Map<Integer, String> choice = new HashMap<Integer, String>();
        choice.put(2,className + " add at: " + this.getPosition());
        choice.put(3,className + " increase power: " + this.value);
        choice.put(0,className + " move form: " + this.organism.getPosition() + " to " + this.position);
        choice.put(1,className + " was devoured: " + this.organism.getPosition());
        return choice.get(this.action);
    }
}
