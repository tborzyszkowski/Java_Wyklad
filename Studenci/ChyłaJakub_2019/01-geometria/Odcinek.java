package geometria;

public class Odcinek {
    private Punkt p1;
    private Punkt p2;

    public Odcinek(Punkt p1, Punkt p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Odcinek(double x1, double y1, double x2, double y2){
        this(new Punkt(x1, y1), new Punkt(x2, y2));
    }
    public Odcinek() {
        this(new Punkt(0, 0), new Punkt(1, 1));
    }
    public Odcinek(Punkt p, double x, double y){
        this(p, new Punkt(x, y));
    }
    public Odcinek(double x, double y, Punkt p) {
        this(new Punkt(x, y), p);
    }
    public Punkt getP1() { return p1; }

    public Punkt getP2() { return p2; }

    public void setP1(double x, double y) { this.p1 = new Punkt(x, y); }

    public void setP2(double x, double y) { this.p2 = new Punkt(x, y); }

    public void shift(double x, double y){
        setP1(getP1().getX() + x, getP1().getY() + y);
        setP2(getP2().getX() + x, getP2().getY() + y);
    }

    public double pointDistance(Punkt p){
        Punkt p3 = new Punkt();
        double u, a, b;

        if (getP1().distance(getP2()) == 0)
            return p.distance(getP1());

        a = getP2().getX() - getP1().getX();
        b = getP2().getY() - getP1().getY();
        u = ( a * (p.getX() - getP1().getX()) + b * (p.getY()-getP1().getY()) ) / (Math.pow(a,2) + Math.pow(b, 2));
        if (u <= 0)
            p3 = getP1();
        else if (u >= 1)
            p3 = getP2();
        else{
            p3.setX(getP1().getX() + u * a);
            p3.setY(getP1().getY() + u * b);
        }
        return p.distance(p3);
    }

    @Override
    public boolean equals(Object o){
        return (((Odcinek) o).getP1().equals(p1) && ((Odcinek) o).getP2().equals(p2));
    }
}
