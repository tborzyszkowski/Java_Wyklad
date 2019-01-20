public class Animal extends Organism {
    public Animal(String name, String short_name, int strength, int movement, Coordinates coordinates, World board) {
        super(name, short_name, strength, movement, coordinates, board);
    }

    public void doMove() {
        Coordinates coordinates = world.randomCoordinates(this.getCoordinates(), this.getMovement(), false);
        this.setCoordinates(coordinates);
        super.doMove();
    }
}
