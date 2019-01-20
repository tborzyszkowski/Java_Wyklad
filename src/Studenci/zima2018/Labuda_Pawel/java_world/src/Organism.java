import java.util.Random;

@SuppressWarnings("WeakerAccess")
public class Organism {
    private String name;
    private String short_name;
    private int strength;
    private int age;
    private int movement;
    private boolean do_move = true;
    private int freeze;
    private Coordinates coordinates;
    public World world;
    private int young;
    private boolean destroyed = false;
    private boolean multiplied = false;

    public Organism(){}

    public Organism(String name, String short_name, int strength, int movement, Coordinates coordinates, World world) {
        this.name = name;
        this.short_name = short_name;
        this.strength = strength;
        this.age = 0;
        this.movement = movement;
        this.coordinates = coordinates;
        this.world = world;
        this.young = 0;
        this.freeze = 0;
    }

    public void doMove() {
        this.increaseAge();
        this.world.checkCollision(this);

        if (this.isDo_move()) {
//            if (this.movement > 0)
//                System.out.println("Move " + this.getName() + "(" + this.hashCode() + ")" + " on x: " +
//                        this.getCoordinates().x + "; y: " + this.getCoordinates().y);
        } else {
            if (this.freeze-- == 0) this.do_move = true;
        }
    }

    public void collision(Organism another) {
//        System.out.println("Collision " + this.getName() + "(" + this.hashCode() + "; x: "
//                + this.getCoordinates().x + "; y: " + this.getCoordinates().y + ") with "
//                + another.getName() + "(" + another.hashCode() + "; x: "
//                + another.getCoordinates().x + "; y: " + another.getCoordinates().y + ")");

        if (this.getName().equals(another.getName())) {
            this.increaseYoung();
            another.increaseYoung();
            this.multiply();
        } else this.doFight(another);
    }

    public void doAction(Organism another) {
    }

    public void multiply() {
        if (this.multiplied) {
//            System.out.println("Multiply " + this.getName() + "(" + this.hashCode() + ")");
            this.multiplied = false;
        }
    }

    public void doMultiply(int const_val) {
        int chance = this.world.countOrganism(this.getName()) / 10 + 1 + const_val;
        if (chance < 1) chance = 1;

        Random rand = new Random();
        if (rand.nextInt(chance) == 0) {
            this.setMultiplied(true);
            this.world.addToQueueOrganism(this.getName(),
                    this.world.randomCoordinates(this.getCoordinates(), 1, true));
        }
    }

    public void doFight(Organism another) {
        if (this.getStrength() >= another.getStrength()) {
            this.increaseStrength();
            this.world.removeOrganism(another);
            another.doAction(this);
        } else {
            another.increaseStrength();
            this.world.removeOrganism(this);
            this.doAction(another);
        }
    }

    public void doFreeze(int turns) {
        this.freeze = turns;
    }

    private void increaseYoung() {
        this.setYoung(this.getYoung() + 1);
    }

    private void increaseStrength() {
        this.setStrength(this.getStrength() + 1);
    }

    private void increaseAge() {
        this.setAge(this.getAge() + 1);
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMovement() {
        return movement;
    }

    public boolean isDo_move() {
        return do_move;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public int getYoung() {
        return young;
    }

    public void setYoung(int young) {
        this.young = young;
    }

    public String getShort_name() {
        return short_name;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public void setMultiplied(boolean multiplied) {
        this.multiplied = multiplied;
    }

    @Override
    public String toString() {
        return "Organism{" +
                "name='" + name + '\'' +
                ", short_name='" + short_name + '\'' +
                ", strength=" + strength +
                ", age=" + age +
                ", movement=" + movement +
                ", do_move=" + do_move +
                ", coordinates=" + coordinates +
                ", world=" + world +
                ", young=" + young +
                '}';
    }
}
