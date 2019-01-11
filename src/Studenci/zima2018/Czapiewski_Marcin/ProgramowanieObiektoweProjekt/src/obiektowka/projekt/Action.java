package obiektowka.projekt;

import obiektowka.projekt.organisms.Organism;

import java.util.HashMap;
import java.util.Map;

public class Action {
    private ActionEnum actionType;
    private Position position;
    private int value;
    private Organism organism;

    public Action(ActionEnum actionType, Position position, int value, Organism organism) {
        this.actionType = actionType;
        this.position = position;
        this.value = value;
        this.organism = organism;
    }

    public ActionEnum getActionType() {
        return actionType;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getValue() {
        return value;
    }

    public Organism getOrganism() {
        return organism;
    }

    @Override
    public String toString() {
        var className = this.organism.getClass().getSimpleName();
        var positionString = position.toString();

        Map<ActionEnum, String> choice = Map.ofEntries(
                Map.entry(ActionEnum.A_ADD, String.format("%s: add at: %s", className, positionString)),
                Map.entry(ActionEnum.A_INCREASEPOWER, String.format("%s increase power: %s", className, value)),
                Map.entry(ActionEnum.A_MOVE, String.format("%s move from: %s to: %s", className, organism.getPosition().toString(), positionString)),
                Map.entry(ActionEnum.A_REMOVE, String.format("%s remove from %s", className, positionString))
        );

        return choice.get(actionType);
    }
}
