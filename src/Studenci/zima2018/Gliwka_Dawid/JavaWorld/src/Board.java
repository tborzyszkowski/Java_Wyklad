package JavaWorld;

import java.util.ArrayList;

public interface Board {
    String toString();
    void insert(Position position, Organism organism);
    void remove(Position position);
    void fill();
    ArrayList<Organism> getNeighbours(Position position);
}
