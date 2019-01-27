package JavaWorld;

import java.util.ArrayList;

public abstract class Organism {
    private String name;
    private char representation;
    private Position position;
    int hp;
    ArrayList<Organism> neighbours;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public Organism(String name, char representation) {
        this.name = name;
        this.representation = representation;
        this.hp = 10;
    }

    public char getRepresentation() {
        return representation;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void getNeighbours(){
        this.neighbours = World.getInstance().getBoard().getNeighbours(this.position);
    }

    public Organism makeMove() {
        this.getNeighbours();

        for (Organism neighbour : this.neighbours) {
            if (neighbour != null && neighbour.getName() == "Sheep" && neighbour.getName() == "Grass") {
                this.hp += neighbour.getHp();
                Edible edible = (Edible)neighbour;
                edible.getEaten();
                return this;
            }
        }
        return this;
    }

}
