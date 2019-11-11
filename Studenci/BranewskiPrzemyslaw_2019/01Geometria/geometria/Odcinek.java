package geometria;

public class Odcinek {
	
	private Punkt fEdge;
	private Punkt sEdge;
	
	public Odcinek(double x1, double y1, double x2, double y2)
	{
		setSegment(x1, y1, x2, y2);
	}
	
	public Odcinek()
	{
		this(0, 0, 1, 1);
	}
	
	public Odcinek(Punkt p1, Punkt p2)
	{
		this(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}
	
	public Odcinek(Punkt p, double x2, double y2)
	{
		this(p.getX(), p.getY(), x2, y2);
	}
	
	public Odcinek(double x2, Punkt p, double y2)
	{
		this(x2, y2, p.getX(), p.getY());
	}
	
	public Odcinek(double x2, double y2, Punkt p)
	{
		this(x2, y2, p.getX(), p.getY());
	}
	
	public double getfEdgeX()
	{
		return this.fEdge.getX();
	}
	
	public double getfEdgeY()
	{
		return this.fEdge.getY();
	}
	
	public double getsEdgeX()
	{
		return this.sEdge.getX();
	}
	
	public double getsEdgeY()
	{
		return this.sEdge.getY();
	}
	
	public void setfEdge(double x, double y)
	{
		this.fEdge = new Punkt(x, y);
	}
	
	public void setsEdge(double x, double y)
	{
		this.sEdge = new Punkt(x, y);
	}
	
	public void setSegment(double x1, double y1, double x2, double y2)
	{
		setfEdge(x1, y1);
		setsEdge(x2, y2);
	}
	
	public void shiftWhole(double x, double y)
	{
		this.fEdge.shift(x, y);
		this.sEdge.shift(x, y);
	}
	
	public double pointDistance(Punkt p)
	{
		Punkt p3 = new Punkt();
		double u, dx, dy, distance;
		
		dx = getsEdgeX() - getfEdgeX();
		dy = getsEdgeY() - getfEdgeY();
		
		if(dx == 0 && dy == 0)
		{
			distance = -1.0;
			return distance;
		}
		
		u = ((p.getX() - getfEdgeX()) * dx + (p.getY() - getfEdgeY()) * dy) / (dx * dx + dy * dy);
		
		if(u <= 0)
			distance = this.fEdge.distance(p);
		else if (u >= 1)
			distance = this.sEdge.distance(p);
		else
		{
			p3.setX(getfEdgeX() + u * dx);
			p3.setY(getfEdgeY() + u * dy);
			distance = p3.distance(p);
		}
		
		return distance;
	}
}