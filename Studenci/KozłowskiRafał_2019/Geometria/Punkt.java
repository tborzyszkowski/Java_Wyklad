package Punkt;

public class Punkt{
    double wspX;
    double wspY;

    Punkt(){
        this.wspX=0.0;
        this.wspY=0.0;
    }

    Punkt(double x, double y){
        wspX = x;
        wspY = y;
    }

    Punkt(Punkt point){
        this.wspX = point.wspX;
        this.wspY = point.wspY;
    }

    void shift(double x, double y){
        this.wspX = x;
        this.wspY = y;
    }

    double distance(Punkt p){
        double resultX, resultY;
        resultX = Math.pow((this.wspX - p.getX()), 2.0);
        resultY = Math.pow((this.wspY - p.getY()), 2.0);
        return resultX + resultY;
    }

    void setX(double x){
        wspX = x;
    }

    void setY(double y){
        wspY = y;
    }

    double getX(){
        return wspX;
    }

    double getY(){
        return wspY;
    }
}