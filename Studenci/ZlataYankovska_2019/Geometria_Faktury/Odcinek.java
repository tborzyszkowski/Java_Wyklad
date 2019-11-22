
public class Odcinek {
	Punkt A;
	Punkt B;
	Odcinek(){
		A = new Punkt();
		B = new Punkt();
	}
	Odcinek(Punkt A, Punkt B){
		this.A = new Punkt(A);
		this.B = new Punkt(B);
	}
	Odcinek(double Ax, double Ay, double Bx, double By){
		this.A = new Punkt(Ax, Ay);
		this.B = new Punkt(Bx, By);
	}
	Odcinek(Punkt A, double Bx, double By){
		this.A = new Punkt(A);
		this.B = new Punkt(Bx, By);
	}
	Odcinek(double Ax, double Ay, Punkt B){
		this.A = new Punkt(Ax, Ay);
		this.B = new Punkt(B);
	}
	public void shift(double x, double y) {
		A.shift(x, y);
		B.shift(x, y);
	}
	public double distance(Punkt p) {
		//Chyba chodzilo o odleglosc od srodka odcinka
		//Wtedy:
		Punkt srodek = new Punkt((A.getX()+B.getX())/2, (A.getY()+B.getY())/2);
		return p.distance(srodek);
	}
}
