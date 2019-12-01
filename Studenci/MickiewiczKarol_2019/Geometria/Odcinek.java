import java.lang.Math;


public class Odcinek {

    private Punkt punkt1;
    private Punkt punkt2;
    private double x;
    private double y;

    public Odcinek(Punkt punkt1, Punkt punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
    }

    public Odcinek(double x1, double y1, double x2, double y2) {
        punkt1.setX(x1);
        punkt1.setY(y1);
        punkt2.setX(x2);
        punkt2.setY(y2);
    }

    public Odcinek(Punkt punkt, double x2, double y2) {
        this.punkt1 = punkt;
        punkt2.setX(x2);
        punkt2.setY(y2);
    }

    public Odcinek() {
        this(0,0,0,0);
    }


    public Punkt getPunkt1() {

        return punkt1;
    }

    public Punkt getPunkt2() {

        return punkt2;
    }

    public double getX() {

        return x;
    }

    public double getY() {

        return y;
    }

    public void setPunkt1(Punkt punkt1) {

        this.punkt1 = punkt1;
    }

    public void setPunkt2(Punkt punkt2) {

        this.punkt2 = punkt2;
    }

    public void setX(double x) {

        this.x = x;
    }

    public void setY(double y) {

        this.y = y;
    }

    public double distance(Punkt punkt){
        double x1 = punkt1.getX();
        double x2 = punkt2.getX();
        double y1 = punkt1.getY();
        double y2 = punkt2.getY();
        double u = ( (x2 - x1)*(punkt.getX() - x1) + (y2 - y1)*(punkt.getY() - y1) ) / ( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) );

        double x3 = x1 + u*(x2 - x1);
        double y3 = y1 + u*(y2 - y1);

        double dx = Math.abs(punkt.getX() - x3);
        double dy = Math.abs(punkt.getY() - y3);
        return Math.sqrt( dx * dx + dy * dy);
    }

    public void shift(double x, double y) {
        punkt1.setX(punkt1.getX() + x);
        punkt1.setY(punkt1.getY() + y);
        punkt2.setX(punkt2.getX() + x);
        punkt2.setY(punkt2.getY() + y);
    }

}

