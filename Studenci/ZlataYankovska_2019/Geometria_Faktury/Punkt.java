import java.lang.Math;
public class Punkt {
	private double x;
	private double y;
	Punkt(){
		x=0;
		y=0;
	}
	Punkt(double x, double y){
		this.x=x;
		this.y=y;
	}
	Punkt(Punkt p){
		this.x=p.getX();
		this.y=p.getY();
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	public void shift(double x, double y){
		this.x += x;
		this.y += y;
	}
	public double distance(Punkt p) {
		double dx = (x-p.getX());
		double dy = (x-p.getY());
		return Math.sqrt(dx*dx+dy*dy);
	}
}
