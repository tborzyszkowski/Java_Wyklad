package creatures.behaviourInterfaces;

import creatures.Organism;
import world.Position;

public interface MovementBehavior {

	public Position move(Organism o);
}
