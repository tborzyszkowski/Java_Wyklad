public class Main {

    public static void main(String[] args) {

        Punkt punkt = new Punkt(2.0, 5.0);
        System.out.printf("Punkt 1: ");
        System.out.printf("x1 = " + punkt.getX() + " ");
        System.out.println("y1 = " + punkt.getY());

        System.out.println("-----------");

        System.out.println("Punkt 1 po przesunięciu o wektor (2.0, 5.0): ");
        punkt.shift(2.0, 5.0);
        System.out.printf("Punkt 1: ");
        System.out.printf("x1 = " + punkt.getX() + " ");
        System.out.println("y1 = " + punkt.getY());

        System.out.println("-----------");

        Punkt punkt1 = new Punkt();
        System.out.println("Punkt 2:");
        System.out.printf("x2 = " + punkt1.getX() + " ");
        System.out.println("y2 = " + punkt1.getY());

        System.out.println("Odległość punktu 1 (po przesunięciu) od punktu 2 = " + punkt.distance(punkt1));

        System.out.println("-----------");

        System.out.println("Dodano nowe punkty między którymi wyznaczany jest odcinek: ");

        Punkt punktOdcinka1 = new Punkt(1, 3);
        System.out.printf("Punkt 3: ");
        System.out.printf("x3 = " + punktOdcinka1.getX() + " ");
        System.out.println("y3 = " + punktOdcinka1.getY());
        Punkt punktOdcinka2 = new Punkt(-1, 5);
        System.out.printf("Punkt 4: ");
        System.out.printf("x4 = " + punktOdcinka2.getX() + " ");
        System.out.println("y4 = " + punktOdcinka2.getY());

        Odcinek odcinek = new Odcinek(punktOdcinka1, punktOdcinka2);

        Punkt punktProstopadly = new Punkt(0, 5);
        System.out.printf("Współrzędne punktu prostopadłego do tego odcinka: ");
        System.out.printf("x5 = " + punktProstopadly.getX() + " ");
        System.out.println("y5 = " + punktProstopadly.getY());

        System.out.println("Odległość bieżącego odcinka zbudowanego między punktami (x3, y3) i (x4, y4)" +
                " od punktu (x5, y5): " + odcinek.distance(punktProstopadly));

        System.out.println("-----------");

        System.out.println("Przesunięcie odcinka o wektor (1, 1): ");
        odcinek.shift(1.0, 1.0);
        System.out.println("Współrzędne Odcinka po przesunięciu: ");
        System.out.printf("x6 = " + odcinek.getPunkt1().getX() + " ");
        System.out.println("y6 = " + odcinek.getPunkt1().getY());
        System.out.printf("x7 = " + odcinek.getPunkt2().getX() + " ");
        System.out.println("y7 = " + odcinek.getPunkt2().getY());

    }

}
