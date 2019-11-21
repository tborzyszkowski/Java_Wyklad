import java.lang.Math;


class Punkt {
    private double x;
    private double y;

    Punkt(double x, double y) {
        setPunkt(x,y);
    }

    Punkt() {
        this(0,0);
    }


    Punkt(Punkt p) {
        this(p.x,p.y);
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x ) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y ) {
        this.y = y;
    }

    public void setPunkt(double x,double y) {
        this.setX(x);
        this.setY(y);
    }

    void swiftXY(double i, double j) {
        setPunkt(this.x+i,this.y+j);
    }

    double distance(Punkt p){

        return Math.sqrt((Math.pow((this.x -p.x), 2))+(Math.pow((this.y-p.y),2)));
    }
}