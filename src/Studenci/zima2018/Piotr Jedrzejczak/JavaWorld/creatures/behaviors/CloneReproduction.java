package creatures.behaviors;

import creatures.Organism;
import creatures.behaviourInterfaces.ReproductionBehavior;
import world.WorldLayout;

public class CloneReproduction implements ReproductionBehavior {
	
	@Override
	public Organism reproduce(Organism o) {
		
		Organism neworg = o.clone();
		WorldLayout currentWorld = neworg.getUniverse();
		neworg.setPosition(currentWorld.getRandomFreePosition());
		
		return neworg;
	}

}
