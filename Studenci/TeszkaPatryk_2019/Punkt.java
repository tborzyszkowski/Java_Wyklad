package Punkt_odcinek;

public class Punkt {

    private double x;
    private double y;

    public Punkt() {this(0,0);}

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
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

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void shift(double x, double y) {
        setX(this.x + x);
        setY(this.y + y);
    }

    public double distance(Punkt punkt) {
        double X_diff = this.x - punkt.x;
        double Y_diff = this.y - punkt.y;
        double X_result = Math.pow(X_diff, 2);
        double Y_result = Math.pow(Y_diff, 2);
        return Math.sqrt(X_result + Y_result);
    }

}

