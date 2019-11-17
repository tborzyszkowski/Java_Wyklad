package Geometria.odcinek;

public class Odcinek {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    Odcinek(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    Odcinek(){
        this(0,0,0,0);
    }


    Odcinek(Punkt punkt1, Punkt punkt2){
        this(punkt1.getX(),punkt1.getY(), punkt2.getX(), punkt2.getY());
    }

    Odcinek(Punkt punkt, double x, double y){
        this(punkt.getX(), punkt.getY(), x, y);
    }

    Odcinek(double x, double y, Punkt punkt){
        this(x, y, punkt.getX(), punkt.getY());
    }

    double getX1(){
        return this.x1;
    }
    double getY1(){
        return this.y1;
    }

    double getX2(){
        return this.x2;
    }

    double getY2(){
        return this.y2;
    }

    void shift(double x, double y){
        this.x1 = this.x1 + x;
        this.x2 = this.x2 + x;
        this.y1 = this.y1 + y;
        this.y2 = this.y2 + y;
    }

    double length(){
        return Math.sqrt(Math.pow(this.x1-this.x2,2)+Math.pow(this.y1-this.y2,2));
    }
}
