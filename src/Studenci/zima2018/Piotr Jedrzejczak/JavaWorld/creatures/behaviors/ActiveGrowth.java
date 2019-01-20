package creatures.behaviors;

import creatures.Organism;
import creatures.behaviourInterfaces.GrowingBehavior;

public class ActiveGrowth implements GrowingBehavior {

	@Override
	public void grow(int growth_value, Organism o) {
		if (o.getMaxHitPoints() > o.getHitPoints() + growth_value) {
			o.setHitPoints(growth_value + o.getHitPoints());
		}
	}

}
