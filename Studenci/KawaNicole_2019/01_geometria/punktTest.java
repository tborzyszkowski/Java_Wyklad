public class PunktTest {
    public static void main(String[] args) {
        Punkt p0 = new Punkt();
        Punkt p1 = new Punkt(-3, -4);

        System.out.println("p0: " + p0);
        System.out.println("p1: " + p1);

        System.out.println("d: " + p0.odleglosc(p1));

        Odcinek o1 = new Odcinek(p0.getX(), p0.getY(), p1.getX(), p1.getY());
        System.out.println("o1: " + o1);

        Punkt p2 = new Punkt(-2, -4);
        System.out.println("eq1: " + p0.equals(p0) + " " + (p0 == p0));
        System.out.println("eq2: " + p0.equals(p1) + " " + (p0 == p1));
        System.out.println("eq3: " + p0.equals(p2) + " " + (p0 == p2));
        System.out.println("eq4: " + p0.equals("Ala ma kota"));
    }
}
