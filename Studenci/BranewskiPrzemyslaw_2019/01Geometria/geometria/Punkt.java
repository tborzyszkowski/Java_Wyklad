package geometria;

import java.lang.Math;

public class Punkt
{
    private double x, y;

    public Punkt()
    {
        this.x = 0;
        this.y = 0;
    }
    
    public Punkt(double i, double j)
    {
        this.x = i;
        this.y = j;
    }
    
    public Punkt(Punkt p)
    {
        this(p.x, p.y);
    }
    
    public double getX()
    {
        return x;
    }
    
    public void setX(double i)
    {
        this.x = i;
    }
    
    public double getY()
    {
        return y;
    }
    
    public void setY(double j)
    {
        this.y = j;
    }

    public void shift(double i, double j)
    {
        this.x += i;
        this.y += j;
    }

    public double distance(Punkt p)
    {
        double dx = Math.abs(this.getX() - p.getX());
        double dy = Math.abs(this.getY() - p.getY());
        return Math.sqrt(dx * dx + dy * dy);
    }
}