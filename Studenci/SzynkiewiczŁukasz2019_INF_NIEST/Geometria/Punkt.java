public class Punkt {
    private double x;
    private double y;

    public Punkt() {
        this(0,0);
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
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
        this.x += x;
        this.y += y;
    }

    public double distance(Punkt p) {
        return (Math.sqrt(Math.pow((p.getX()-this.x), 2)+(Math.pow((p.getY()-this.y), 2))));
    }
}
