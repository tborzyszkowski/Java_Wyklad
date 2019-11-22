public class Punkt {
    private double x;
    private double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punkt() {
        this(0, 0);
    }

    public Punkt(Punkt punkt) {
        this(punkt.x, punkt.y);
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

    public double distance(Punkt punkt) {
        double dx = Math.abs(this.getX() - punkt.getX());
        double dy = Math.abs(this.getY() - punkt.getY());
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void shift(double x, double y) {
        this.x += x;
        this.y += y;
    }
}

