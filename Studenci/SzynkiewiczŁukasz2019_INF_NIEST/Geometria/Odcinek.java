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
        this.punkt1.setY(this.punkt1.getY() + y);
        this.punkt2.setX(this.punkt2.getX() + x);
        this.punkt2.setY(this.punkt2.getY() + y);
    }

    public double pointDistance(Punkt p) {

        double dx21 = this.punkt2.getX() - this.punkt1.getX();
        double dx1 = p.getX() - this.punkt1.getX();
        double dy21 = this.punkt2.getY() - this.punkt1.getY();
        double dy1 = p.getY() - this.punkt1.getY();
        double u = ((dx21 * dx1) + (dy21 * dy1)) / ((dx21 * dx21) + (dy21 * dy21));
        double x3 = this.punkt1.getX() + u * (this.punkt2.getX() - this.punkt1.getX());
        double y3 = this.punkt1.getY() + u * (this.punkt2.getY() - this.punkt1.getY());
        Punkt punkt3 = new Punkt(x3, y3);

        if (u <= 0) {
            return this.punkt1.distance(p);
        }

        else if (u > 0 && u < 1) {
            return punkt3.distance(p);
        }
        else {
            return punkt2.distance(p);
        }

//            (x2 - x1)(x - x1) + (y2 - y1)(y - y1)
//    u = ——————————————————————————
//                (x2 - x1)2 + (y2 - y1)2
    }

}