@SuppressWarnings("WeakerAccess")
public class Muschroom extends Plant {
    public Muschroom(Coordinates coordinates, World world) {
        super("Muschroom", "m", 0, 0, coordinates, world);
    }

    public void doMove() {
        if (this.getAge() == 10) {
            this.world.removeOrganism(this);
        }

        super.doMove();
    }

    public void multiply() {
        super.doMultiply(20);
        super.multiply();
    }

    public void doAction(Organism another) {
        this.world.removeOrganism(another);
        this.world.addToQueueOrganism(this.getName(),
                this.world.randomCoordinates(this.getCoordinates(),1, true));
    }
}
