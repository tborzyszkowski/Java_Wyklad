package creatures.animals;

import creatures.Animal;
import creatures.behaviors.ActiveGrowth;
import creatures.behaviors.AnimalMovement;
import creatures.behaviors.CloneReproduction;
import world.Position;
import world.WorldLayout;

public class Wolf extends Animal {

	
	public Wolf(Position position, WorldLayout universe, int hit_points, int max_hit_points, int attack_power) {
		super(position, universe, hit_points, max_hit_points);
		this.attack_power = attack_power;
		this.sign = 'W';
		this.growing = new ActiveGrowth();
		this.movement = new AnimalMovement();
		this.reproduction = new CloneReproduction();
	}
	
	public Wolf(Wolf w) {
		super(w);
		this.attack_power = w.attack_power;	
		this.growing = w.growing;
		this.movement = w.movement;
		this.sign = w.sign;
		this.reproduction = w.reproduction;
	}
	
	@Override
	public Wolf clone() {
		return new Wolf(this);
	}
}
