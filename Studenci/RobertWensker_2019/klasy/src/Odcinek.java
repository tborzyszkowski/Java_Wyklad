
public class Odcinek {
    private double starting_x;
    private double starting_y;
    private double ending_x;
    private double ending_y;

    public Odcinek(double x1, double y1, double x2, double y2) {
        this.starting_x = x1;
        this.starting_y = y1;
        this.ending_x = x2;
        this.ending_y = y2;
    }
    Odcinek(){this(0,0,0,0);}
    public Odcinek(Punkt punkt1, Punkt punkt2) {
        this.starting_x = punkt1.getX();
        this.starting_y = punkt1.getY();
        this.ending_x = punkt2.getX();
        this.ending_y = punkt2.getY();
    }
    public void set(double x1, double y1, double x2, double y2){
        this.starting_x = x1;
        this.starting_y = y1;
        this.ending_x = x2;
        this.ending_y = y2;
    }
    public Odcinek(Punkt punkt1, double x, double y){
        this.starting_x = punkt1.getX();
        this.starting_y = punkt1.getY();
        this.ending_x = x;
        this.ending_y = y;
    }
    public Odcinek(double x, double y, Punkt punkt2){
        this.starting_x = x;
        this.starting_y = y;
        this.ending_x = punkt2.getX();
        this.ending_y = punkt2.getY();
    }
    public void setStarting_x(double x) {this.starting_x = x;}
    public void setStarting_y(double y) {this.starting_y = y;}
    public void setEnding_x(double x) {this.ending_x = x;}
    public void setEnding_y(double y) {this.ending_y = y;}
    public void  shift(double x, double y) {
        this.starting_x = starting_x + x;
        this.starting_y = starting_y + y;
        this.ending_x = ending_x + x;
        this.ending_y = ending_y + y;
    }
    public double distance(double px, double py){

        if (px < starting_x)
        {
            return Math.sqrt((starting_x - px) * (starting_x - px) + (starting_y - py) * (starting_y - py));
        }
        if(px > ending_x){
            return Math.sqrt((ending_x - px) * (ending_x - px) + (ending_y - py) * (ending_y - py));
        }
        else {
            var a = (ending_y - starting_y) / (ending_x - starting_x);
            var b =  (-1) * ( a * starting_x - starting_y );
            //return  b;
            return Math.abs(a*px - py + b) / Math.sqrt(a*a + 1);

        }

    }
    public double getStarting_x() {return starting_x;}
    public double getEnding_x() {return ending_x;}
    public double getStarting_y() {return starting_y;}
    public double getEnding_y() {return ending_y;}

}


