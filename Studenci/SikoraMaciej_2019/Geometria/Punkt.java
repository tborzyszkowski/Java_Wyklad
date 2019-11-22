import static java.lang.Math.*;

public class Punkt{
    double x;
    double y;

    // KONSTRUKTORY
    public Punkt(){}

    public Punkt(double a, double b){
        x = a;
        y = b;

    }

    public Punkt(Punkt pkt){
        x = pkt.x;
        y = pkt.y;
    }


    // METODY
    double getX(){
        return(x);
    }

    void setX(double a){
        x = a;
    }

    double getY(){
        return(y);
    }

    void setY(double a){
        y = a;
    }

    void shift(double a, double b){
        x = x + a;
        y = y + b;
    }

    double distance(Punkt p){
        return(sqrt((pow(p.x - x,2)) + (pow(p.y - y,2))));
    }
}
