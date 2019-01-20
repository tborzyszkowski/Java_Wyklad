package creatures;


import world.Position;
import world.WorldLayout;

public abstract class Animal extends Organism {
	
	protected int attack_power;

	public Animal(Position position, WorldLayout universe, int hit_points, int max_hit_points) {
		super(position, universe, hit_points, max_hit_points);
	}
	
	public abstract Animal clone();
	
	public Animal(Animal a) {
		super(a);
	}
}
