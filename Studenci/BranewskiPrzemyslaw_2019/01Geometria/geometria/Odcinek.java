package geometria;

public class Odcinek {
	
	Punkt fEdge;
	Punkt sEdge;
	
	public Odcinek(Punkt p1, Punkt p2)
	{
		this.fEdge = new Punkt(p1);
		this.sEdge = new Punkt(p2);
	}
	
	public Odcinek(double fx, double fy, double sx, double sy)
	{
		this.fEdge = new Punkt(fx, fy);
		this.sEdge = new Punkt(sx, sy);
	}
	
	public Odcinek()
	{
		this(0, 0, 1, 1);
	}
	
	public Odcinek(Punkt p, double sx, double sy)
	{
		this(p.getX(), p.getY(), sx, sy);
	}
	
	public Odcinek(double sx, Punkt p, double sy)
	{
		this(sx, sy, p.getX(), p.getY());
	}
	
	public Odcinek(double sx, double sy, Punkt p)
	{
		this(sx, sy, p.getX(), p.getY());
	}
	
	public void shift(double x, double y)
	{
		this.fEdge.setX(this.fEdge.getX() + x);
		this.fEdge.setY(this.fEdge.getY() + y);
		this.sEdge.setX(this.sEdge.getX() + x);
		this.sEdge.setY(this.sEdge.getY() + y);
	}
	
	public double pointDistance(Punkt p)
	{
		Punkt p3 = new Punkt();
		double u, dx, dy, distance;
		
		dx = this.sEdge.getX() - this.fEdge.getX();
		dy = this.sEdge.getY() - this.fEdge.getY();
		
		if(dx == 0 && dy == 0)
		{
			distance = -1.0;
			return distance;
		}
		
		u = ((p.getX() - this.fEdge.getX()) * dx + (p.getY() - this.fEdge.getY()) * dy) / (dx * dx + dy * dy);
		
		if(u <= 0)
			distance = this.fEdge.distance(p);
		else if (u >= 1)
			distance = this.sEdge.distance(p);
		else
		{
			p3.setX(this.fEdge.getX() + u * dx);
			p3.setY(this.fEdge.getY() + u * dy);
			distance = p3.distance(p);
		}
		
		return distance;
	}
}