package creatures.behaviors;

import creatures.behaviourInterfaces.GrowingBehavior;
import creatures.Organism;

public class PassiveGrowth implements GrowingBehavior {
	
	public void grow(int growth_value, Organism o) {
		
		if(o.getHitPoints() < o.getMaxHitPoints()) {
			o.setHitPoints(o.getHitPoints() + growth_value);
		}
	}
}
