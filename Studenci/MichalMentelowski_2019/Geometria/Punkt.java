package faktpkt;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punkt {
    private double x;
    private double y;

    public Punkt() {
        this(0, 0);
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punkt(Punkt punkt) {
        this.x = (punkt.getX());
        this.y=(punkt.getY());
    }
//METODY

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void Shift(double x, double y){
       this.x+=x;
       this.y+=y;
    }
    public double Distance(Punkt p){
    double distance=sqrt((pow(this.getX()-p.getX(),2))+(pow(this.getY()-p.getY(),2)));
    return distance;
    }

}