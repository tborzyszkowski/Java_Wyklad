import java.io.*;

public class  Odcinek {
    private double starting_x;
    private double starting_y;
    private double ending_x;
    private double ending_y;


    public Odcinek(double starting_x, double starting_y, double ending_x, double ending_y) {
        this.starting_x = starting_x;
        this.starting_y = starting_y;
        this.ending_x = ending_x;
        this.ending_y = ending_y;
    }

    public Odcinek() {
        this(0, 0, 0, 0);
    }

    public Odcinek(Punkt punkt1, Punkt punkt2) {
        this.starting_x = punkt1.getX();
        this.ending_x = punkt2.getX();
        this.starting_y = punkt1.getY();
        this.ending_y = punkt2.getY();

    }
    public Odcinek(Punkt punkt, double x, double y){
        this.starting_x = punkt.getX();
        this.starting_y = punkt.getY();
        this.ending_x = x;
        this.ending_y =y;
    }
    public Odcinek(double x, double y, Punkt punkt){
        this.starting_x = x;
        this.starting_y = y;
        this.ending_x = punkt.getX();
        this.ending_y = punkt.getY();
    }

    public double getStarting_X() {
        return starting_x;
    }

    public double getStarting_Y() {
        return starting_y;
    }

    public double getEnding_X() {
        return ending_x;
    }

    public double getEnding_Y() {
        return ending_y;
    }

    public void setStarting_x(double starting_x) {
        this.starting_x = starting_x;
    }
    public void setStarting_y(double starting_y) {
        this.starting_y = starting_y;
    }
    public void setEnding_x(double ending_x) {
        this.ending_x = ending_x;
    }
    public void setEnding_y(double ending_y) {
        this.ending_y = ending_y;
    }
    public void shiftodcinek(double x, double y) {
        this.starting_x += x;
        this.starting_y += y;
        this.ending_x += x;
        this.ending_y += y;
    }
    public double pointDistance(Punkt punkt){

        if (starting_x>punkt.getX()){
            return punkt.distance(new Punkt(starting_x,starting_y));
        }
        if (ending_x<punkt.getX()){
            return punkt.distance(new Punkt(ending_x,ending_y));
        }
        else
        {
            var a = (ending_y - starting_y) / (ending_x - starting_x);
            var b = (starting_y - a*starting_x);
            return (Math.abs(a*punkt.getX()-punkt.getY()+b))/(Math.sqrt(a*a+1));
        }
    }
}