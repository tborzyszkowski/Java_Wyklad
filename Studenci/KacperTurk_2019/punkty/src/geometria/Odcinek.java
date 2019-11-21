package geometria;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;


public class Odcinek {
    private Punkt A;
    private Punkt B;

    public Odcinek(Punkt A, Punkt B) {
        this.A = A;
        this.B = B;
    }

    public Odcinek() {
        this(new Punkt(),new Punkt());
    }

    public Odcinek(double x1, double y1, double x2, double y2) {
        this(new Punkt(x1,y1),new Punkt(x2,y2));
    }

    public Odcinek(Punkt A, double x2, double y2) {
        this(A,new Punkt(x2,y2));
    }

    public Odcinek(double x1, double y1, Punkt B) {
        this(new Punkt(x1,y1), B);
    }

    public void shift(double x, double y) {
        this.A.shift(x,y);
        this.B.shift(x,y);
    }

    public double getX1() { return this.A.getX();}

    public double getY1() { return this.A.getY();}

    public double getX2() { return this.B.getX();}

    public double getY2() { return this.B.getY();}

    public double pointDistance(Punkt p){
        double x1= this.A.getX();
        double y1= this.A.getY();
        double x2= this.B.getX();
        double y2= this.B.getY();
        double a = (y1 - y2) / (x1 - x2);
        double b = y1 - (a * x1);

        return abs( (a * p.getX()) + p.getY() + b ) / sqrt((a * a) + 1);
    }
}