public class Odcinek
{
	private Punkt A;
	private Punkt B;

	public Odcinek(double x1, double y1, double x2, double y2)
	{
		setSegment(x1, y1, x2, y2);
	}

	public Odcinek()
	{
		this(0, 0, 1, 1);
	}

	public Odcinek(Punkt a, Punkt b)
	{
		this.A = a;
		this.B = b;
	}

	public Odcinek(Punkt a, double x2, double y2)
	{
		this(a.getX(), a.getY(), x2, y2);
	}

	public Odcinek(double x1, double y1, Punkt b)
	{
		this(x1, y1, b.getX(), b.getY());
	}

	public double getAX()
	{
		return this.A.getX();
	}

	public double getAY()
	{
		return this.A.getY();
	}

	public double getBX()
	{
		return this.B.getX();
	}

	public double getBY()
	{
		return this.B.getY();
	}

	public void setA(double x, double y)
	{
		this.A = new Punkt(x, y);
	}

	public void setB(double x, double y)
	{
		this.B = new Punkt(x, y);
	}

	public void setSegment(double x1, double y1, double x2, double y2)
	{
		setA(x1, y1);
		setB(x2, y2);
	}

	public void shiftSegment(double x, double y)
	{
		this.A.shift(x, y);
		this.B.shift(x, y);
	}
	
	public double getPointDistance(Punkt p)
	{
		Punkt s = new Punkt();
		double dx, dy, z, distance;
		
		dx = getBX() - getAX();
		dy = getBY() - getAY();
		
		if(dx == 0 && dy == 0)
		{
			return -1.0;
		}
		
		z = ((p.getX()-getAX())*dx+(p.getY()-getAY())*dy)/(dx*dx+dy*dy);
		
		if(z <= 0)
			distance = this.A.distance(p);
		else if (z >= 1)
			distance = this.B.distance(p);
		else
		{
			s.setX(getAX()+z*dx);
			s.setY(getAY()+z*dy);
			distance = s.distance(p);
		}
		
		return distance;
	}
}