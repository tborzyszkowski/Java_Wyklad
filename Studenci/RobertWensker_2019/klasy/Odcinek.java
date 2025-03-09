
public class Odcinek {
    //private double starting_x;
    //private double starting_y;
    //private double ending_x;
    //private double ending_y;
    private Punkt punkt1 =new Punkt();
    private Punkt punkt2 = new Punkt();
    public Punkt GetPunkt1(){
        return punkt1;
    }
    public Punkt GetPunkt2(){
        return punkt2;
    }
    public Odcinek(double x1, double y1, double x2, double y2) {
        //assert this.punkt1 != null;
        this.punkt1.setX(x1);
        this.punkt1.setY(y1);
        this.punkt2.setX(x2);
        this.punkt2.setY(y2);
    }
    Odcinek(){this(0,0,0,0);}
    public Odcinek(Punkt punkt1, Punkt punkt2) {
        this.punkt1 = punkt1;
        //this.starting_y = punkt1.getY();
        this.punkt2 = punkt2;
        //this.ending_y = punkt2.getY();
    }
    public void set(double x1, double y1, double x2, double y2){
        this.punkt1.setX(x1);
        this.punkt1.setY(y1);
        this.punkt2.setX(x2);
        this.punkt2.setY(y2);
    }
    public Odcinek(Punkt punkt1, double x, double y){
        this.punkt1 = punkt1;
        //this.starting_y = punkt1.getY();
        this.punkt2= new Punkt(x,y);
        //this.ending_y = y;
    }
    public Odcinek(double x, double y, Punkt punkt2){
        this.punkt1 = new Punkt(x,y);
        this.punkt2 = punkt2;
    }
    /*public void setStarting_x(double x) {this.starting_x = x;}
    public void setStarting_y(double y) {this.starting_y = y;}
    public void setEnding_x(double x) {this.ending_x = x;}
    public void setEnding_y(double y) {this.ending_y = y;}*/
    public void  shift(double x, double y) {
        this.punkt1.setX( punkt1.getX() + x );
        this.punkt1.setY( punkt1.getY() + y );
        this.punkt2.setX(punkt2.getX() + x);
        this.punkt2.setY(punkt2.getY() + y);
        //this.starting_y = starting_y + y;
        //this.ending_x = ending_x + x;
        //this.ending_y = ending_y + y;
    }
    public double distance(double px, double py){

        if (px < punkt1.getX())
        {
            return Math.sqrt((punkt1.getX() - px) * (punkt1.getX() - px) + (punkt1.getY() - py) * (punkt1.getY() - py));
        }
        if(px > punkt2.getX()){
            return Math.sqrt((punkt2.getX() - px) * (punkt2.getX() - px) + (punkt2.getY() - py) * (punkt2.getY() - py));
        }
        else {
            var a = (punkt2.getY() - punkt1.getY()) / (punkt2.getX() - punkt1.getX());
            var b =  (-1) * ( a * punkt1.getX() - punkt1.getY() );
            //return  b;
            return Math.abs(a*px - py + b) / Math.sqrt(a*a + 1);

        }

    }
   /* public double getStarting_x() {return starting_x;}
    public double getEnding_x() {return ending_x;}
    public double getStarting_y() {return starting_y;}
    public double getEnding_y() {return ending_y;}
*/
}


