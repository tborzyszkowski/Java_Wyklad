package Punkt_odcinek;
import java.lang.*;

public class Odcinek {
    private Punkt a;
    private Punkt b;

    public Odcinek() {
        this.a = new Punkt();
        this.b = new Punkt();
    }

    public Odcinek(Odcinek odcinek) {
        this(odcinek.a, odcinek.b);
    }


    public Odcinek(Punkt a, Punkt b) {
        this.a = a;
        this.b = b;
    }

    public Odcinek(double x1, double y1, double x2, double y2) {
        this.a = new Punkt(x1,y1);
        this.b = new Punkt(x2,y2);

    }

    public Odcinek(Punkt punkt, double x, double y) {
         this(punkt.getX(), punkt.getY(), x, y);
    }
    public Odcinek(double y, double x, Punkt punkt) {
        this(x, y, punkt.getX(), punkt.getY());
    }


    public void new_set(double new_x, double new_y) {
        this.a = new Punkt(this.a.getX() + new_x, this.a.getY() + new_y);
        this.b = new Punkt(this.b.getX() + new_x, this.b.getY() + new_y);
    }

    public double getX_A() {
        return this.a.getX();
    }
    public double getY_A() {
        return this.a.getY();
    }
    public double getX_B() {
        return this.b.getX();
    }
    public double getY_B() {
        return this.b.getY();
    }


    public double pointDistance(Punkt p) {
        double x1 = this.a.getX();
        double y1 = this.a.getY();
        double x2 = this.b.getX();
        double y2 = this.b.getY();

        double A = y2-y1;
        double B = x1-x2;
        double C = y1*x2-y2*x1;
        double x0 = p.getX();
        double y0 = p.getY();
        double d = Math.abs(A*x0+ B*y0 + C)/Math.sqrt(Math.pow(A,2) + Math.pow(B,2));
        return Math.round(d*1000.0) / 1000.0;//zaokrąglenie

    }

}
