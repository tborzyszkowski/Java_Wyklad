package JavaWorld;

public class Wolf extends Organism implements Eater {
    public Wolf() {
        super("Wolf", 'W');
    }

    public void eat(Edible organism) {
        organism.getEaten();
    }


}
