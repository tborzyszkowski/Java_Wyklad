import java.util.ArrayList;
import java.util.List;

public class Frog extends Organism {
    private static final String SIGN = "F";

    public Frog(int power) {
        super(SIGN, power);
    }

    @Override
    public boolean shouldReproduce() {
        return false;
    }

    @Override
    public void move(Map map1) {
        List<MapField> locationLeafList = new ArrayList<>();

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                for (Organism organism : map1.tablica[row][col].getOrganisms()) {
                    if (organism instanceof Leaf) {
                        if (organism.power > 1) {
                            MapField location = map1.tablica[row][col];
//                          System.out.println("["+row+"]["+col+"]");
                            locationLeafList.add(location);
//                          System.out.println(locationLeafList);
                        }
                    }
                }
            }
        }
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                map1.tablica[row][col].removeOrganism(this);
            }
        }
        if (locationLeafList.size() > 0) {
            int randomLeafIndex = (int) (Math.random() * locationLeafList.size());
            MapField selectedLeaf = locationLeafList.get(randomLeafIndex);
            selectedLeaf.addOrganism(this);
        } else {
            locationLeafList.remove(this);
        }
        //System.out.println(organism.toString());

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                for (Organism organism : map1.tablica[row][col].getOrganisms()) {
                    if (organism instanceof Frog) {
                        MapField lacationFrog = map1.tablica[row][col];
                        System.out.println("F przeskakuje na: " + "["+row+"]["+col+"]" );

                        int y1 = row > 0 ? row - 1 : row;
                        int y2 = row < 4 ? row + 1 : row;
                        int x1 = col > 0 ? col - 1 : col;
                        int x2 = col < 4 ? col + 1 : col;

                        for (int i = y1; i <= y2; i++) {

                            for (int j = x1; j <= x2; j++) {
                                List <Organism> organisms = new ArrayList<>(map1.tablica[i][j].getOrganisms());
                                for (Organism organism2 : organisms) {

                                    if (organism2 instanceof Insect) {
                                        map1.tablica[i][j].removeOrganism(organism2);
                                        power++;
                                        System.out.println("F zjada " + organism2.getSign() + "[" + i + "][" + j + "]");
                                        System.out.println("F power: " + power);
                                        // System.out.println("[" + i + "][" + j + "]");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        power--;
    }
    //System.out.println(organismAllList);
}


