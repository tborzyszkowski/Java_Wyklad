package creatures;
import world.Position;
import world.WorldLayout;
import creatures.behaviourInterfaces.*;

public abstract class Organism {
	
	protected GrowingBehavior growing;
	protected ReproductionBehavior reproduction;
	protected MovementBehavior movement;
	protected Position position;
	protected WorldLayout universe;
	protected int hit_points;
	protected int max_hit_points;
	protected char sign;

	public Organism(Position position, WorldLayout universe, int hit_points, int max_hit_points) {
		this.position = new Position(position);
		this.universe = universe;
		this.hit_points = hit_points;
		this.max_hit_points = max_hit_points;
	}
	
	public Organism(Organism org) {
		this.position = new Position(org.position);
		this.universe = org.universe;
		this.hit_points = org.hit_points;
		this.max_hit_points = org.max_hit_points;
	}
	public abstract Organism clone();
	
	public int getMaxHitPoints() {
		return max_hit_points;
	}

	public void setMaxHitPoints(int max_hit_points) {
		this.max_hit_points = max_hit_points;
	}

	public GrowingBehavior getGrowing() {
		return growing;
	}
	
	public void setGrowing(GrowingBehavior growing) {
		this.growing = growing;
	}
	
	public MovementBehavior getMovement() {
		return movement;
	}
	
	public ReproductionBehavior getReproduction() {
		return reproduction;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public WorldLayout getUniverse() {
		return universe;
	}
	
	public void setUniverse(WorldLayout universe) {
		this.universe = universe;
	}
	
	public void setHitPoints(int hit_points) {
		this.hit_points = hit_points;
	}
	
	public int getHitPoints() {
		return hit_points;
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	@Override
	public String toString() {
		return "" + sign;
	}
}
