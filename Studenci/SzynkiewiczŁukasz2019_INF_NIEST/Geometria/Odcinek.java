public class Odcinek {

    private Punkt punkt1;
    private Punkt punkt2;

    public Odcinek() {
       this(0,0,0,0);
    }

    public Odcinek(double x1, double y1, double x2, double y2) {
        this.punkt1 = new Punkt(x1, y1);
        this.punkt2 = new Punkt(x2, y2);
    }

    public Odcinek(Punkt punkt1, Punkt punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
    }

    public Odcinek(Punkt punkt, double x2, double y2) {
        this.(punkt.getX(), punkt.getY(), x2, y2);
    }

    public Punkt getPunkt1X() {
        return this.punkt1.getX();
    }

    public Punkt getPunkt2X() {
        return this.punkt2.getX();
    }
    
    public Punkt getPunkt1Y() {
        return this.punkt1.getY();
    }

    public Punkt getPunkt2Y() {
        return this.punkt2.getY();
    }

    public void shift(double x, double y) {
        
        this.punkt1.setX(getPunkt1X() + x);
        this.punkt1.setY(getPunkt1Y() + y);
        this.punkt2.setX(getPunkt2X() + x);
        this.punkt2.setY(getPunkt2Y() + y);
        
    }

    public double pointDistance(Punkt p) {
        
        Punkt punkt3;
        double dx21, dx1, dy21, dy1;

        double dx21 = getPunkt2X() - getPunkt1X();
        double dx1 = p.getX() - getPunkt1X();
        double dy21 = getPunkt2Y() - getPunkt1Y();
        double dy1 = p.getY() - getPunkt1Y();
        
        double u = ((dx21 * dx1) + (dy21 * dy1)) / ((dx21 * dx21) + (dy21 * dy21));
        
        double x3 = getPunkt1X() + u * (getPunkt2X() - getPunkt1X());
        double y3 = getPunktY1() + u * (getPunkt2Y() - getPunkt1Y());
        Punkt punkt3 = new Punkt(x3, y3);

        if (u <= 0) {
            return this.punkt1.distance(p);
        }

        else if (u > 0 && u < 1) {
            return punkt3.distance(p);
        }
        else {
            return this.punkt2.distance(p);
        }

//            (x2 - x1)(x - x1) + (y2 - y1)(y - y1)
//    u = —————————————————————————————————————————
//                (x2 - x1)2 + (y2 - y1)2
    }

}
