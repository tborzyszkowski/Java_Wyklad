@SuppressWarnings("WeakerAccess")
public class Bear extends Animal {
    public Bear(Coordinates coordinates, World world) {
        super("Bear", "b", 20, 1, coordinates, world);
    }

    public void doMove() {
        if (this.getAge() > 1200) {
            this.world.removeOrganism(this);
        }

        super.doMove();
    }

    public void doAction(Organism another) {
    }

    public void multiply() {
        super.doMultiply(2);
        super.multiply();
    }
}
