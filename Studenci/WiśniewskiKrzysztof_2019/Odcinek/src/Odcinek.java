public class Odcinek {
    private double starting_x;
    private double starting_y;
    private double ending_x;
    private double ending_y;

    public Odcinek(double staring_x, double staring_y, double ending_x, double ending_y) {
        this.starting_x = staring_x;
        this.starting_y = staring_y;
        this.ending_x = ending_x;
        this.ending_y = ending_y;
    }

    public Odcinek() {
        this(0, 0, 0, 0);
    }

    public Odcinek(Punkt punkt1, Punkt punkt2) {
        this.starting_x = punkt1.getX();
        this.starting_y = punkt1.getY();
        this.ending_x = punkt2.getX();
        this.ending_y = punkt2.getY();
    }

    public Odcinek(Punkt punkt1, double ending_x, double ending_y) {
        this.starting_x = punkt1.getX();
        this.starting_y = punkt1.getY();
        this.ending_x = ending_x;
        this.ending_y = ending_y;
    }

    public double getStartingX() {
        return starting_x;
    }

    public void setStaringX(double x) {
        this.starting_x = x;
    }

    public double getStaringY() {
        return starting_y;
    }

    public void setStaringY(double y) {
        this.starting_y = y;
    }

    public double getEndingX() {
        return ending_x;
    }

    public void setEndingX(double x) {
        this.ending_x = x;
    }

    public double getEndingY() {
        return ending_y;
    }

    public void setEndingY(double y) {
        this.ending_y = y;
    }

    public void shift(double x, double y) {
        this.starting_x += x;
        this.starting_y += y;
        this.ending_x += x;
        this.ending_y += y;
    }
    public double pointDinstance(Punkt punkt){
        double A = punkt.getX() - this.starting_x; // position of point rel one end of line
        double B = punkt.getY() - this.starting_y;
        double C = this.ending_x - this.starting_x; // vector along line
        double D = this.ending_y -this.starting_y;
        double E = -D; // orthogonal vector
        double F = C;

        double dot = A * E + B * F;
        double len_sq = E * E + F * F;

        return dot * dot / len_sq;
    }
    public double length(){
        return Math.sqrt(Math.pow(this.starting_x-this.ending_x, 2) + Math.pow(this.starting_y-this.ending_y, 2));
    }

}
