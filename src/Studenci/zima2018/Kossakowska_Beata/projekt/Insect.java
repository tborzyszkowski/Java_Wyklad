public class Insect extends Organism {

    private static final String SIGN = "I";

    public Insect(int power) {
        super(SIGN, power);
    }

    @Override
    public boolean shouldReproduce() {
        return true;
    }

    @Override
    public void move(Map map1) {

        if (power < 2) {
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 5; col++) {
                    if(map1.tablica[row][col].getOrganisms().contains(this)) {
                        System.out.println("I ginie " + "[" + row + "]["+ col +"]");
                        map1.tablica[row][col].removeOrganism(this);
                    }

                }
            }
        }
        if (power > 3) {
            Insect i = new Insect(4);
            int row = ((int) (Math.random() * 5));
            int col = ((int) (Math.random() * 5));
            MapField pole = map1.tablica[row][col];
            if (pole.getOrganisms().isEmpty()) {
                pole.addOrganism(i);
                System.out.println("I rozmnaza sie: " + "[" + row + "]["+ col +"]");
            }
        }
        power--;
    }
}
