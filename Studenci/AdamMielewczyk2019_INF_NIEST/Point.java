public class Point {
    private double x;
    private double y;

    Point()
    {}

    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void shift(double x, double y)
    {
        this.x += x;
        this.y += y;
    }

    public double distance(Point p)
    {
        return Math.sqrt(Math.pow(p.getX()-this.x,2) + Math.pow(p.getY()-this.y,2));
    }

    @Override
    public boolean equals(Object obj) {
        Point p=(Point) obj;
        if (this.x == p.x && this.y == p.y)
            return true;
        else
            return false;
    }
}