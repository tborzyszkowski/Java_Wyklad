public class Sheep extends Animal {
    public Sheep(Coordinates coordinates, World world) {
        super("Sheep", "s", 1, 1, coordinates, world);
    }

    public void doMove() {
        if (this.getAge() > 500) {
            this.world.removeOrganism(this);
        }

        super.doMove();
    }

    public void multiply() {
        super.doMultiply(0);
        super.multiply();
    }
}
