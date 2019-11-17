public class Odcinek {

    private Punkt punkt1;
    private Punkt punkt2;

    public Odcinek() {}

    public Odcinek(double x1, double y1, double x2, double y2) {
        this.punkt1 = new Punkt(x1, y1);
        this.punkt2 = new Punkt(x2, y2);
    }

    public Odcinek(Punkt punkt1, Punkt punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
    }

    public Odcinek(Punkt punkt, double x2, double y2) {
        this.punkt1 = punkt;
        this.punkt2 = new Punkt(x2, y2);
    }

    public Punkt getPunkt1() {
        return punkt1;
    }

    public Punkt getPunkt2() {
        return punkt2;
    }

    public void shift(double x, double y) {
        this.punkt1.setX(this.punkt1.getX() + x);
        this.punkt2.setX(this.punkt2.getX() + x);
    }

    public double pointDistance(Punkt p) {
        return 0.0;
    }

}
