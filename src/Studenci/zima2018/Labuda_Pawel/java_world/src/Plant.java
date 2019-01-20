public class Plant extends Organism {
    public Plant(){}

    public Plant(String name, String short_name, int strong, int movement, Coordinates coordinates, World board) {
        super(name, short_name, strong, movement, coordinates, board);
    }

    public void doMove() {
        multiply();
        super.doMove();
    }
}
