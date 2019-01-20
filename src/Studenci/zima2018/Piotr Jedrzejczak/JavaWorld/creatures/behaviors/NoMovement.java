package creatures.behaviors;

import creatures.Organism;
import creatures.behaviourInterfaces.MovementBehavior;
import world.Position;

public class NoMovement implements MovementBehavior {

	@Override
	public Position move(Organism o) {
		return o.getPosition();
	}

}
