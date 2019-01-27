package JavaWorld;

import java.util.ArrayList;
import java.util.Arrays;

public class World {
    private int sizeX;
    private int sizeY;
    private int sizeZ;
    private int turn;
    private ArrayList<Organism> organisms;
    private BoardFactory factory = new BoardFactory();
    private Board board;

    private volatile static World instance;

    private World() {
        this.turn = 0;
        this.organisms = new ArrayList<Organism>();
    }

    public static World getInstance() {
        if (instance == null) {
            synchronized (World.class) {
                if (instance == null) {
                    instance = new World();
                }
            }
        }

        return instance;
    }

    public void addOrganism(Organism organism) {
        this.organisms.add(organism);
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public int getSizeZ() {
        return sizeZ;
    }

    public int getTurn() {
        return turn;
    }

    private void setTurn(int turn) {
        this.turn = turn;
    }

    public Board getBoard() {
        return board;
    }

    public void initialize(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.board = factory.getBoard(this.getSizeX(), this.getSizeY());
        this.board.fill();
    }

    public void initialize(int sizeX, int sizeY, int sizeZ) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
        this.board = factory.getBoard(this.getSizeX(), this.getSizeY(), this.getSizeZ());
        this.board.fill();
    }

    public ArrayList<Organism> getOrganisms() {
        return organisms;
    }

    public void makeTurn() {
        this.setTurn(this.getTurn() + 1);
        ArrayList<Organism> organismsNew = new ArrayList<Organism>();
        for (Organism organism : organisms){
            organism.makeMove();
        }
        organisms = organismsNew;

    }

    @Override
    public String toString() {
        return "World{" +
                "sizeX=" + sizeX +
                ", sizeY=" + sizeY +
                ", turn=" + turn +
                "}\n" + board.toString();
    }
}
