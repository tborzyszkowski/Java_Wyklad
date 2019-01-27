package JavaWorld;

import java.util.ArrayList;
import java.util.Random;

public class Board2D implements Board {
    private Organism[][] board;

    public Board2D(int x, int y) {
        this.board = new Organism[x][y];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Organism[] row : board) {
            for (Organism organism : row) {
                if (organism == null) {
                    sb.append("_");
                } else sb.append(organism.getRepresentation());
                sb.append(' ');
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void insert(Position position, Organism organism) {
        board[position.getX()][position.getY()] = organism;
    }

    public void remove(Position position) {
        board[position.getX()][position.getY()] = null;
    }

    public void fill() {
        OrganismFactory of = new OrganismFactory();
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                board[x][y] = of.getOrganism();
                if (board[x][y] != null) {
                    Position pos = new Position(x, y);
                    board[x][y].setPosition(pos);
                    World.getInstance().addOrganism(board[x][y]);
                }
            }
        }
    }

    public ArrayList<Organism> getNeighbours(Position position) {
        int x = position.getX();
        int y = position.getY();
        ArrayList<Organism> neighbours = new ArrayList<Organism>();
        return neighbours;
    }
}

