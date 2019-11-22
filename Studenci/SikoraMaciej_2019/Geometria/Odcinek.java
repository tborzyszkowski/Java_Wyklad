import static java.lang.Math.*;

public class Odcinek{
    double x1;
    double y1;

    double x2;
    double y2;

    // KONSTRUKTORY
    public Odcinek(){}

    public Odcinek(Punkt pkt1, Punkt pkt2){
        x1 = pkt1.x;
        y1 = pkt1.y;
        x2 = pkt2.x;
        y2 = pkt2.y;
    }

    public Odcinek(double a1, double b1, double a2, double b2){
        x1 = a1;
        y1 = b1;
        x2 = a2;
        y2 = b2;

    }

    public Odcinek(Punkt pkt, double a2, double b2){
        x1 = pkt.x;
        y1 = pkt.y;
        x2 = a2;
        y2 = b2;
    }

    public Odcinek(double a1, double b1, Punkt pkt){
        x1 = a1;
        y1 = b1;
        x2 = pkt.x;
        y2 = pkt.y;
    }
    // METODY

    void wyswietl(){
        System.out.println("Odcinek ma punkty "+x1+","+y1+" i "+x2+","+y2);

    }
    void shift(double a, double b){
        x1 = x1 + a;
        y1 = y1 + b;
        x2 = x2 + a;
        y2 = y2 + b;
    }

    double distance(Punkt p){
        double px=x2-x1;
        double py=y2-y1;
        double temp=(px*px)+(py*py);
        double u=((p.x - x1) * px + (p.y - y1) * py) / (temp);
        if(u>1){
            u=1;
        }
        else if(u<0){
            u=0;
        }

        double dx = x1 + u * px - p.x;
        double dy = y1 + u * py - p.y;
        double odl = Math.sqrt(dx*dx + dy*dy);
        return odl;
    }


}