public class Grass extends Plant {
    public Grass(Coordinates coordinates, World world) {
        super("Grass", "g", 0, 0, coordinates, world);
    }

    public void doMove() {
        if (this.getAge() > 400) {
            this.world.removeOrganism(this);
        }

        super.doMove();
    }

    public void multiply() {
        super.doMultiply(15);
        super.multiply();
    }
}
