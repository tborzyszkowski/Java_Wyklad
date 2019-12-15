package Geometria.odcinek;

import Geometria.punkt.Punkt;

public class Odcinek {
    private Punkt punktA;
    private Punkt punktB;

    Odcinek(double x1, double y1, double x2, double y2){
        this.punktA = new Punkt(x1, y1);
        this.punktB = new Punkt(x2, y2);
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
        this(punkt, x, y);
    }

    Punkt getPunktA(){
        return this.punktA;
    }

    Punkt getPunktB(){
        return this.punktB;
    }

    void shift(double x, double y){
        this.punktA.setX(this.getPunktA().getX() + x);
        this.punktA.setY(this.getPunktA().getY() + y);
        this.punktB.setX(this.getPunktB().getX() + x);
        this.punktB.setY(this.getPunktB().getY() + y);
    }

    double length(){
        return Math.sqrt(Math.pow(this.punktA.getX() -this.punktB.getX(),2) +
                Math.pow(this.punktA.getY()-this.punktB.getY(),2));
    }
}
