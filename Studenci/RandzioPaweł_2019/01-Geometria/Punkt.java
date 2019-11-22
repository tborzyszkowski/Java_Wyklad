import java.lang.*;

public class Punkt {
    double x;
    double y;

    public Punkt(){}

    public Punkt(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punkt(Punkt pkt){
        x = pkt.x;
        y = pkt.y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void shift(double x, double y){
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public double distance(Punkt p){
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
    }
}