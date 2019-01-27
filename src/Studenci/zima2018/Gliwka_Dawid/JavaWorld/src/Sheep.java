package JavaWorld;

public class Sheep extends Organism implements Eater, Edible {
    public Sheep() {
        super("Sheep", 's');
    }

    public void eat(Edible organism) {

    }
    public void getEaten(){
        World.getInstance().getOrganisms().remove(this);
    }

}
