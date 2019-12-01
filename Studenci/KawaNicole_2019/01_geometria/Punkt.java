public class Punkt {
    private double x;
    private double y;

    public Punkt() {

    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "Punkt [x=" + x + ", y=" + y + "]";
    }

    public double odleglosc(Punkt p) {
        double x2 = (this.getX() - p.getX()) * (this.getX() - p.getX());
        double y2 = (this.getY() - p.getY()) * (this.getY() - p.getY());
        return Math.sqrt(x2 + y2);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        if (! (obj instanceof Punkt))
            return false;

        Punkt other = (Punkt) obj;
        if (this.getX() == other.getX())
            if (this.getY() == other.getY())
                return true;
            else
                return false;
        else
            return false;
    }
}
