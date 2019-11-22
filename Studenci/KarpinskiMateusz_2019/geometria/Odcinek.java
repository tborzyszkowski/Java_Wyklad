package geometria;

public class Odcinek {
    private Punkt a;
    private Punkt b;



    public Odcinek(Punkt a, Punkt b) {
        this.a = a;
        this.b = b;
    }

    public Odcinek() { this(new Punkt(), new Punkt()); }

    public Odcinek(Punkt a, double x2, double y2) {
        this(a, new Punkt(x2, y2));
    }

    public Odcinek(double x1, double y1, Punkt b) {
        this(new Punkt(x1, y1), b);
    }

    public Odcinek(double x1, double y1, double x2, double y2) {
        this(new Punkt(x1, y1), new Punkt(x2, y2));
    }

    public Punkt getA(){ return a; }

    public Punkt getB(){ return b; }


    public void shift(double x, double y) {
        this.a.setX(this.a.getX() + x);
        this.a.setY(this.a.getY() + y);
        this.b.setX(this.b.getX() + x);
        this.b.setY(this.b.getY() + y);
    }


    public double pointDistance(Punkt p) {
        double dot = (p.getX() - a.getX()) * (b.getX() - a.getX()) + (p.getY() - a.getY()) * (b.getY() - a.getY());
        double t = Math.max(0, Math.min(1, dot/Math.pow(a.distance(b), 2)));
        Punkt p0 = new Punkt(a.getX() + t * (b.getX() - a.getX()), a.getY() + t * (b.getY() - a.getY()));
        return p.distance(p0);

    }

    @Override
    public boolean equals(Object v){
        return (((Odcinek) v).getA().equals(a) && ((Odcinek) v).getB().equals(b));

    }
}
