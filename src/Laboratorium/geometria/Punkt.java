package Laboratorium.geometria;

public class Punkt {
	private double x;
	private double y;

	public Punkt(){
		this(0.0, 0.0);
	}
	public Punkt(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = (x < 0 ? -x: x);
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = (y< 0 ? -y: y);
	}

	public double distance(Punkt p){
		return 0;
	}
}
// p = new Point(1,1);
// p.setX(7); -> Point.setX(this, 7)