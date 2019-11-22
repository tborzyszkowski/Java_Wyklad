import java.lang.Math;


public class Punkt {

    private double x;
    private double y;
    private Punkt punkt;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punkt() {

        this(0,0);
    }

    public Punkt(Punkt punkt) {

        this(punkt.x, punkt.y);
    }

    public double getX() {

        return x;
    }

    public double getY() {

        return y;
    }

    public Punkt getPunkt() {

        return punkt;
    }

    public void setX(double x) {

        this.x = x;
    }

    public void setY(double y) {

        this.y = y;
    }

    public void setPunkt(Punkt punkt) {

        this.punkt = punkt;
    }

    public void shift(double x, double y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public double distance(Punkt punkt){
        double dx = Math.abs(this.getX() - punkt.getX());
        double dy = Math.abs(this.getY() - punkt.getY());
        return Math.sqrt( dx * dx + dy * dy);
    }

}
