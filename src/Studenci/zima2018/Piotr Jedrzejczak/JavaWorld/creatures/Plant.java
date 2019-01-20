package creatures;


import world.Position;
import world.WorldLayout;

public abstract class Plant extends Organism {
	
	public Plant(Position position, WorldLayout universe, int hit_points, int max_hit_points) {
		super(position, universe, hit_points, max_hit_points);

	}
	
	public abstract Plant clone();
	
	public Plant(Plant p) {
		super(p);
	}
}
