import java.util.Random;

@SuppressWarnings("WeakerAccess")
public class WorldBoard extends World {
    public WorldBoard(int x, int y) {
        super(x, y);
        myFrame = new MyFrame(x, y, this);
    }

    public void newGame() {
        Random rand = new Random();
        organismArray.clear();

        int organismsQty = rand.nextInt(20) + minOrganismQty;
        for (int i = 0; i < organismsQty; i++) {
            Coordinates coordinates = new Coordinates(rand.nextInt(size.x), rand.nextInt(size.y));

            boolean canSet = true;
            for (Organism org : organismArray) {
                if (coordinates.equals(org.getCoordinates())) {
                    canSet = false;
                    break;
                }
            }

            if (canSet) this.addOrganism(organismList.get(rand.nextInt(organismList.size())), coordinates);
        }

        this.drawWorld();
    }

    public void nextTurn() {
        for (int i = 0; i < organismArray.size(); i++) {
            if (!organismArray.get(i).isDestroyed())
                organismArray.get(i).doMove();
        }

        // remove destroyed organisms
        int i = 0;
        while (i != organismArray.size()) {
            if (organismArray.get(i).isDestroyed()) {
                organismArray.remove(i);
                i--;
            }

            i++;
        }

//        for (Organism organism : organismArray) {
//            if (!organism.isDestroyed()) {
//                organism.doMove();
//            }
//        }

        this.drawWorld();
    }
}
