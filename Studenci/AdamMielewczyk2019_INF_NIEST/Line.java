public class Line {
    private Point p[]=new Point[2];

    Line(){
        p[0]=new Point();
        p[1]=new Point();
    }
    Line(Point p1, Point p2)
    {
        p[0] = new Point(p1);
        p[1] = new Point(p2);
    }

    Line(Point p1, double x, double y)
    {
        p[0] = new Point(p1);
        p[1] = new Point(x,y);
    }

    Line(double x, double y, Point p2)
    {
        p[0] = new Point(x, y);
        p[1] = new Point(p2);
    }

    Point getPoint(int i)
    {
        return p[i>0?1:0];
    }

    void shift(double x, double y)
    {
        p[0].shift(x, y);
        p[1].shift(x, y);
    }

    double pointDistance(Point p)
    {
        Point np=new Point((this.p[0].getX()+this.p[1].getX())/2.0, (this.p[0].getY()+this.p[1].getY())/2.0);
        return np.distance(p);
    }
}
