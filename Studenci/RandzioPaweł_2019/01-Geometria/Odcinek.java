import java.lang.*;

public class Odcinek{
    double Ax;
    double Ay;
    double Bx;
    double By;

    public Odcinek(){}

    public Odcinek(double a, double b, double c, double d){setValues(a,b,c,d);}

    public Odcinek(Punkt a, Punkt b){this(a.x,a.y,b.x,b.y);}

    public Odcinek(Punkt p, double a, double b){this(p.x,p.y,a,b);}

    private void setValues(double ax, double ay, double bx, double by){
        this.Ax = ax;
        this.Ay = ay;
        this.Bx = bx;
        this.By = by;
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