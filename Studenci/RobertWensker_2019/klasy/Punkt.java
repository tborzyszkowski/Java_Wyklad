class Punkt {
    private double x;
    private double y;

     Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

     Punkt() {
        this(0, 0);
    }

     Punkt(Punkt punkt) {
        this(punkt.x, punkt.y);
    }

     double getX() {
        return x;
    }

     void setX(double x) {
        this.x = x;
    }

     double getY() {
        return y;
    }

     void setY(double y) {
        this.y = y;
    }
     void shift(double x, double y){
        this.x = this.x + x;
        this.y = this.y + y;
    }

    double distance(Punkt punkt){
        double dx = Math.abs(this.getX() - punkt.getX());
        double dy = Math.abs(this.getY() - punkt.getY());
        return Math.sqrt( dx * dx + dy * dy);
    }

}
