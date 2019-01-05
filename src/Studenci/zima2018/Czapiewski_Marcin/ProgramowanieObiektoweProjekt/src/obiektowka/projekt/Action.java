package obiektowka.projekt;

import java.util.HashMap;
import java.util.Map;

public class Action {
    private ActionEnum action;
    private Position position;
    private value value;
    private Organism organism;

    Action(ActionEnum action, Position position, value value, Organism organism) {
        this.action = action;
        this.position = position;
        this.value = value;
        this.organism = organism;
    }

    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public value getValue() {
        return value;
    }

    public void setValue(value value) {
        this.value = value;
    }

    public Organism getOrganism() {
        return organism;
    }

    public void setOrganism(Organism organism) {
        this.organism = organism;
    }

    @Override
    public String toString() {
        var className = this.organism.getClass().getName();

        HashMap<ActionEnum, String> choice = Map.ofEntries(
                Map.entry(ActionEnum.A_ADD, String.format("%s: add at: %s", className, position)),
                Map.entry(ActionEnum.A_INCREASEPOWER, String.format("%s increase power: %s", className, value)),
                Map.entry(ActionEnum.A_MOVE, String.format("%s move from: %s to: %s", className, organism.position, position)),
                Map.entry(ActionEnum.A_REMOVE, String.format("%s remove from %s", className, position))
        );

        return choice.get(action);
    }
}
