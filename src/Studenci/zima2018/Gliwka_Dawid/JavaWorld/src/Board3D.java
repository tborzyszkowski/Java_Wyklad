package JavaWorld;

import java.util.ArrayList;
import java.util.Random;

public class Board3D implements Board {
    private Board2D[] skyscraper;

    public Board3D(int x, int y, int z) {
        this.skyscraper = new Board2D[z];
        for (int i = 0; i < z; i++) {
            skyscraper[i] = new Board2D(x, y);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int n = skyscraper.length;
        for (Board board : skyscraper) {
            sb.append("Piętro: " + n + "\n");
            n -= 1;
            sb.append(board.toString());
        }
        return sb.toString();
    }

    public void insert(Position position, Organism organism) {
        skyscraper[position.getZ()].insert(position, organism);
    }

    public void remove(Position position) {
        skyscraper[position.getZ()].remove(position);
    }

    public void fill() {
        for (int z = 0; z < skyscraper.length; z++) {
            skyscraper[z].fill();
        }
    }

    public ArrayList<Organism> getNeighbours(Position position) {
        ArrayList<Organism> neighbours = new ArrayList<Organism>();
        skyscraper[position.getZ()].getNeighbours(position);
        return neighbours;
    }

}
