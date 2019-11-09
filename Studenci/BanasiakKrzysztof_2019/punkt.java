import java.lang.Math;


class Punkt {
    double x;
    double y;

    Punkt() {
        x = 0;
        y = 0;
    }

    Punkt(double n, double m){
        x = n;
        y = m;
    }
    Punkt(Punkt p){
        this.x = p.x;
        this.y = p.y;
    }
    double getX()
    {
        return x;
    }
    double getY()
    {
        return y;
    }
    void setXY(double i, double j) {
        x = i;
        y = j;
    }
    void swiftXY(double i, double j){
        x = x + i;
        y = y + j;
    }
    double distance(Punkt p){

        return Math.sqrt((Math.pow((this.x -p.x), 2))+(Math.pow((this.y-p.y),2)));
    }
}
