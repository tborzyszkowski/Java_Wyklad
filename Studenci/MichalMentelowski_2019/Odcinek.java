import static java.lang.Math.*;
public class Odcinek {
    private double startx;
    private double starty;
    private double endx;
    private double endy;

    public Odcinek(double startx, double starty, double endx, double endy) {
        this.startx = startx;
        this.starty = starty;
        this.endx = endx;
        this.endy = endy;
    }

    public Odcinek() {
        this(0, 0, 0, 0);
    }

    public Odcinek(Punkt punkt1, Punkt punkt2) {
        this.startx = punkt1.getX();
        this.starty = punkt1.getY();
        this.endx = punkt2.getX();
        this.endy = punkt2.getY();
    }

    public Odcinek(Punkt punkt1, double endx, double endy) {
        this.startx = punkt1.getX();
        this.starty = punkt1.getY();
        this.endx = endx;
        this.endy = endy;
    }

    public double getStartingX() {
        return startx;
    }

    public void setStaringX(double x) {
        this.startx = x;
    }

    public double getStaringY() {
        return starty;
    }

    public void setStaringY(double y) {
        this.starty = y;
    }

    public double getEndingX() {
        return endx;
    }

    public void setEndingX(double x) {
        this.endx = x;
    }

    public double getEndingY() {
        return endy;
    }

    public void setEndingY(double y) {
        this.endy = y;
    }

    public void shift(double x, double y) {
        this.startx += x;
        this.starty += y;
        this.endx += x;
        this.endy += y;
    }
    public double pointDistance(Punkt punkt){
        double x = punkt.getX();
        double y = punkt.getY();
        double x1 = this.startx;
        double x2 = this.endx;
        double y1 = this.starty;
        double y2 = this.endy;
        double A = x - x1;
        double B = y - y1;
        double C = x2 - x1; 
        double D = y2 - y1;
        double E = -D; 
        double F = C;

        double dot = A * E + B * F;
        double len_sq = E * E + F * F;
        return  abs(dot) / sqrt(len_sq);


    }

    public double dlugoscOdcinka(){
        return sqrt(pow(this.startx -this.endx, 2) + pow(this.starty -this.endy, 2));
    }

}
