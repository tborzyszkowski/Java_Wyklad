@SuppressWarnings("WeakerAccess")
public class Wolf extends Animal {
    public Wolf(Coordinates coordinates, World world) {
        super("Wolf", "w", 5, 2, coordinates, world);
    }

    public void doMove() {
        if (this.getAge() > 800) {
            this.world.removeOrganism(this);
        }

        if (this.world.countOrganism("Sheep") > 20) {
            this.doAim(this.world.getNearestOrganism(this.getCoordinates()));
        }

        super.doMove();
    }

    public void doAim(Organism another) {
        int x_direction;
        int y_direction;

        if (this.getCoordinates().x - another.getCoordinates().x + 1
                < this.getCoordinates().x - another.getCoordinates().x) x_direction = 1;
        else x_direction = -1;

        if (this.getCoordinates().y - another.getCoordinates().y + 1
                < this.getCoordinates().y - another.getCoordinates().y) y_direction = 1;
        else y_direction = -1;

        Coordinates coordinates = new Coordinates(this.getCoordinates().x + x_direction,
                this.getCoordinates().y + y_direction);
        this.setCoordinates(coordinates);
        super.doAction(another);
    }

    public void doAction(Organism another) {
        if (another.getName().equals("Sheep")) {
            this.doFreeze(1);
        }
    }

    public void multiply() {
        super.doMultiply(1);
        super.multiply();
    }
}
