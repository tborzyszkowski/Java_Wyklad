package creatures.behaviors;

import java.util.Random;

import creatures.Organism;
import creatures.behaviourInterfaces.MovementBehavior;
import world.Position;
import world.WorldLayout;

public class AnimalMovement implements MovementBehavior {
	
	private final int MOVE_UP = 0;
	private final int MOVE_DOWN = 1;
	private final int MOVE_LEFT = 2;
	private final int MOVE_RIGHT = 3;
	
	
	@Override
	public Position move(Organism o) {
		Random rand = new Random();
		Position current_position = o.getPosition();
		WorldLayout current_world = o.getUniverse();
		
		int boundryX = current_world.getLayoutX();
		int boundryY = current_world.getLayoutY();
		int direction = rand.nextInt(4);
		
		switch (direction) {
			case MOVE_UP:
				if ((current_position.getY() - 1) >= 0) {
					current_position.setY(current_position.getY() - 1);
				}
				break;
			case MOVE_DOWN:
				if ((current_position.getY() + 1) <= boundryY) {
					current_position.setY(current_position.getY() + 1);
				}
				break;
			case MOVE_LEFT:
				if ((current_position.getX() - 1) >= 0) {
					current_position.setX(current_position.getX() - 1);
				}
				break;
			case MOVE_RIGHT:
				if ((current_position.getX() + 1) <= boundryX) {
					current_position.setX(current_position.getX() + 1);
				}
				break;
		}
		return o.getPosition();
	}
}
