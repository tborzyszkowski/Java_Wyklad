import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punkt {
    private double x;
    private double y;

    public Punkt() {
        this(0, 0);
    }

    public Punkt(Punkt punkt) {
        this(punkt.getX(), punkt.getY());
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Punkt punkt) {
        double xp = pow((punkt.getX() - this.getX()), 2);
        double yp = pow((punkt.getY() - this.getY()), 2);

        return sqrt(xp + yp);
    }

    public void shift(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

