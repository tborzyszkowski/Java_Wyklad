import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private Map mapka;

    public void init (){
        mapka = new Map();
        mapka.populateFilds();

        Leaf nymphaea = new Leaf(4);
        Frog pelophylax = new Frog(3);
        Insect anopheles = new Insect(8);

        //mapka.tablica[(int) (Math.random() * 5)][(int) (Math.random() * 5)].addOrganism(nymphaea);

        MapField field = mapka.tablica[(int) (Math.random() * 5)][(int) (Math.random() * 5)];
        field.addOrganism(nymphaea);
        field.addOrganism(pelophylax);

        MapField fieldforInsect = mapka.tablica[(int) (Math.random() * 5)][(int) (Math.random() * 5)];

        if (field.equals(fieldforInsect)) {
            MapField fieldforInsect2 = mapka.tablica[(int) (Math.random() * 5)][(int) (Math.random() * 5)];
            fieldforInsect2.addOrganism(anopheles);
        } else {
            fieldforInsect.addOrganism(anopheles);
        }
        // mapka.tablica[(int) (Math.random() * 5)][(int) (Math.random() * 5)].addOrganism(pelophylax);
        // mapka.printMap();
    }

    public void run () {
        for (int i = 0; i < 10; i++) {

            mapka.printMap();

            List<Organism> organismAllList = new ArrayList<>();
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 5; col++) {
                    List<Organism> organismList = mapka.tablica[row][col].getOrganisms();
                    organismAllList.addAll(organismList);
                }
            }

            for (Organism organism : organismAllList) {
                organism.move(mapka);
            }

            int insectQuantity = 0;
            for (Organism organism : organismAllList) {

                if (organism instanceof Insect) {
                    insectQuantity++;
                }
            }
            if (insectQuantity > 0) {
                Scanner keyIn = new Scanner(System.in);

                System.out.print("Press the enter key to continue");
                keyIn.nextLine();
            }
            else if (i ==9 && insectQuantity == 0) {

                System.out.print("Insekty wygraly");
            }
            else {
                System.out.println("Koniec gry");
                System.out.println("wygrana pelophylax");
                System.out.println("wszystkie insekty zjedzone");
                break;
            }
        }
    }
}



