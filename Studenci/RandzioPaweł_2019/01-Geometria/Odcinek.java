import java.lang.*;

public class Odcinek{
    double Ax;
    double Ay;
    double Bx;
    double By;

    public Odcinek(){}

    public Odcinek(double ax, double ay, double bx, double by){
        Ax = ax;
        Ay = ay;
        Bx = bx;
        By = by;
    }

    public Odcinek(Punkt a, Punkt b){
        Ax = a.x;
        Ay = a.y;
        Bx = b.x;
        By = b.y;
    }

    public Odcinek(Punkt p, double a, double b){
        Ax = p.x;
        Ay = p.y;
        Bx = a;
        By = b;
    }

    public void shift(double a, double b){
        this.Ax = this.Ax + a;
        this.Bx = this.Bx + a;
        this.Ay = this.Ay + b;
        this.By = this.By + b;
    }

    public double pointDistance(Punkt p){
        return (Math.abs(((this.By-this.Ay)/(this.Bx-this.Ax))*p.x-p.y+((this.Bx*this.Ay-this.Ax*this.By)/(this.Bx-this.Ax))))/Math.sqrt(Math.pow((this.By-this.Ay)/(this.Bx-this.Ax),2)+1);
    }
}