
public class Odcinek {
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	
	public Odcinek() {
		this(0,0,0,0);
	}

	public Odcinek(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public Odcinek(Punkt a, Punkt b) {
       this(a.getX(),a.getY(),b.getX(),b.getY());
    		   
    }
    
	public Odcinek(Punkt a,double x2, double y2) {
		this(a.getX(),a.getY(),x2,y2);
	}
	
	public Odcinek(double x2,double y2, Punkt a) {
		this (x2,y2,a.getX(),a.getY());
	}
	
	public double getx1(){
		return x1;
	}
	
	public double getx2(){
		return x2;
	}
	public double gety1(){
		return y1;
	}
	public double gety2(){
		return y2;
	}
	
	public void setx1(double x){
		this.x1 = x;
	}
	
	public void setx2(double x){
		this.x2 = x;
	}
	
	public void sety1(double y){
		this.y1 = y;
	}
	
	public void sety2(double y){
		this.y2 = y;
	}
	
	public void shift(double x, double y) {
		this.x1 = x1 + x;
		this.x2 = x2 + x;
		this.y1 = y1 + y;
		this.y2 = y2 + y;
	}
	
	public double pointDistance (Punkt p) {
		double a=0; double b = 0; double c=0;
		double d=0; double e=0;double f=0;
		
		a = this.getx1();  
		b = this.getx2(); 
		d = this.gety1();  
		e = this.gety2(); 
		
		c = p.getX();  
		f = p.getY(); 
		
		return Math.abs(((e-d)/(b-a))*c-f+(b*d-a*e)/(b-a))/Math.sqrt((Math.pow((e-d)/(b-a),2))+1);
		

	}
}
