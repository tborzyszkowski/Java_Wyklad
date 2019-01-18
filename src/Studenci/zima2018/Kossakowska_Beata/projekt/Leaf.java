import java.util.ArrayList;
import java.util.List;

public class Leaf extends Organism {

    private static final String SIGN = "L";

    public Leaf(int power) {
        super(SIGN, power);
    }

    @Override
    public boolean shouldReproduce() {
        return true;
    }

    @Override
    public void move(Map map1) {
        if (power < 1) {
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 5; col++) {
                    map1.tablica[row][col].removeOrganism(this);
                }
            }
        }
        if (power > 2) {
            Leaf l = new Leaf(5);
            MapField pole = map1.tablica[(int) (Math.random() * 5)][(int) (Math.random() * 5)];
            if (pole.getOrganisms().isEmpty()) {
                pole.addOrganism(l);
            }
        }
        power--;
    }
}



