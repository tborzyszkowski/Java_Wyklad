package creatures.animals;

import creatures.Animal;
import creatures.behaviors.ActiveGrowth;
import creatures.behaviors.AnimalMovement;
import creatures.behaviors.CloneReproduction;
import world.Position;
import world.WorldLayout;

public class Sheep extends Animal {

	private final int NUTRITION = 100;

	public Sheep(Position position, WorldLayout universe, int hit_points, int max_hit_points, int attack_power) {
		super(position, universe, hit_points, max_hit_points);
		this.attack_power = attack_power;
		this.sign = 'S';
		this.growing = new ActiveGrowth();
		this.movement = new AnimalMovement();
		this.reproduction = new CloneReproduction();
		
	}
	
	public Sheep(Sheep s) {
		super(s);
		this.attack_power = s.attack_power;	
		this.growing = s.growing;
		this.movement = s.movement;
		this.sign = s.sign;
		this.reproduction = s.reproduction;
	}
	
	public int getNUTRITION() {
		return NUTRITION;
	}
	
	@Override
	public Sheep clone() {
		return new Sheep(this);
	}
}
