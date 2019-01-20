package creatures.plants;

import creatures.Plant;
import creatures.behaviors.PassiveGrowth;
import creatures.behaviors.CloneReproduction;
import creatures.behaviors.NoMovement;
import world.Position;
import world.WorldLayout;

public class Grass extends Plant {
	
	private final int NUTRITION = 10;
	
	public Grass(Position position, WorldLayout universe, int hit_points, int max_hit_points) {
		super(position, universe, hit_points, max_hit_points);
		this.sign = 'G';
		this.growing = new PassiveGrowth();
		this.reproduction = new CloneReproduction();
		this.movement = new NoMovement();
	}
	
	public Grass(Grass g) {
		super(g);
		this.sign = g.sign;
		this.growing = g.growing;
		this.reproduction = g.reproduction;
		this.movement = g.movement;
	}

	public int getNutrition() {
		return NUTRITION;
	}

	@Override
	public Grass clone() {
		return new Grass(this);
	}
	
}
