package geometria;

import java.lang.Math;

public class Punkt
{
    private double x, y;
    
    public Punkt(double x, double y)
    {
        setPoint(x, y);
    }
    
    public Punkt()
    {
    	this(0, 0);
    }
    
    public Punkt(Punkt p)
    {
        this(p.x, p.y);
    }
    
    public double getX()
    {
        return x;
    }
    
    public void setX(double x)
    {
        this.x = x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public void setY(double y)
    {
        this.y = y;
    }
    
    public void setPoint(double x, double y)
    {
    	setX(x);
    	setY(y);
    }

    public void shift(double x, double y)
    {
    	setPoint(this.x + x, this.y + y);
    }

    public double distance(Punkt p)
    {
        double dx = Math.abs(this.getX() - p.getX());
        double dy = Math.abs(this.getY() - p.getY());
        return Math.sqrt(dx * dx + dy * dy);
    }
}