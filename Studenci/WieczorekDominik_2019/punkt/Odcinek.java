import static java.lang.Math.pow;

public class Odcinek {
    private double xa;
    private double ya;
    private double xb;
    private double yb;


    public Odcinek() {
        this(0, 0, 0, 0);
    }

    public Odcinek(Punkt a, Punkt b) {
        this.xa = a.getX();
        this.ya = a.getY();

        this.xb = b.getX();
        this.yb = b.getY();
    }

    public Odcinek(double xa, double ya, double xb, double yb) {
        this.xa = xa;
        this.ya = ya;

        this.xb = xb;
        this.yb = yb;
    }

    public Odcinek(Punkt a, double xb, double yb) {
        this.xa = a.getX();
        this.ya = a.getY();

        this.xb = xb;
        this.yb = yb;
    }

    public double getXa() {
        return xa;
    }

    public void setXa(double xa) {
        this.xa = xa;
    }

    public double getXb() {
        return xb;
    }

    public void setXb(double xb) {
        this.xb = xb;
    }

    public double getYa() {
        return ya;
    }

    public void setYa(double ya) {
        this.ya = ya;
    }

    public double getYb() {
        return yb;
    }

    public void setYb(double yb) {
        this.yb = yb;
    }

    public void shift(double x, double y) {
        this.xa += x;
        this.ya += y;

        this.xb += x;
        this.yb += y;
    }

    public double pointDistance(Punkt punkt) {
        double xa = this.getXa();
        double xb = this.getXb();
        double xp = punkt.getX();

        double ya = this.getYa();
        double yb = this.getYb();
        double yp = punkt.getY();

        double dlugoscap = punkt.distance(new Punkt(xa, ya));
        double dlugoscbp = punkt.distance(new Punkt(xb, yb));

        if ((xa <= xp && xp <= xb) || (xb <= xp && xp <= xa) || (ya <= yp && yp <= yb) || (yb <= yp && yp <= ya)) {
            double licznik = Math.abs((yb - ya) * xp - (xb - xa) * yp + (xb * ya) - (yb * xa));
            double mianownik = Math.sqrt(pow(yb - ya, 2) + pow(xb - xa, 2));
            return licznik / mianownik;
        } else return Math.min(dlugoscap, dlugoscbp);
    }

}
