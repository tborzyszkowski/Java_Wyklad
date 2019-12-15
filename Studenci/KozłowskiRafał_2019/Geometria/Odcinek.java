package Punkt;

class Odcinek {
    private Punkt first;
    private Punkt second;

    Odcinek(Punkt first, Punkt second){
        this.first = first;
        this.second = second;
    }

    Odcinek(){
        first = new Punkt(0.0, 0.0);
        second = new Punkt(0.0, 0.0);
    }

    Odcinek (double x1, double y1, double x2, double y2){
        first.setX(x1);
        first.setY(y1);
        second.setX(x2);
        second.setY(y2);
    }

    Odcinek(Punkt punkt, double x1, double y1){
        first = punkt;
        second.setY(y1);
        second.setX(x1);
    }

    void shift(double x, double y){
        first.setX(first.getX()+x);
        first.setY(first.getY()+y);
        second.setX(second.getX()+x);
        second.setY(second.getY()+y);
    }

    public double pointDistance(Punkt point){
        return Math.abs(((second.getY()-first.getY()) / (second.getX()-first.getX())) *
                point.getX() - point.getY()+(second.getX() * first.getY()-first.getX()*second.getY())/
                (second.getX() - first.getX())) / Math.sqrt((Math.pow((second.getY() - first.getY())/(second.getX()-first.getX()),2))+1);
    }

    public static void main(String[] args){
        Punkt punkt1 = new Punkt(1.0, 1.0);
        Punkt punkt2 = new Punkt(2.0, 2.0);
        Odcinek odc = new Odcinek(punkt1, punkt2);
        Punkt punkt3 = new Punkt(0.0,1.0);
        System.out.println(odc.pointDistance(punkt3));
    }
}
