
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
		/*
		Punkt par = new Punkt(B.getX()-A.getX(), B.getY()-A.getY());
		Punkt ort = new Punkt(B.getY()-A.getY(), A.getX()-B.getX());
		Punkt pnt = new Punkt(A);
		Punkt rzut;
		if(par.getX() == 0 && par.getY() == 0) { //A=B
			return p.distance(A);
		}
		else if(par.getX() == 0) { //odcinek jest pionowy
			rzut = new Punkt(A.getX(), p.getY());
			if ((B.getY() >= rzut.getY() && rzut.getY() <= A.getY()) || (B.getY() <= rzut.getY() && rzut.getY() >= A.getY())) {
				return Math.abs(A.getX()-p.getX());
			}
			else {
				return Math.min(p.distance(A), p.distance(B));
			}
		}
		else if(par.getY() == 0) { //odcinek jest poziomy
			rzut = new Punkt(p.getX(), A.getY());
			if ((B.getX() >= rzut.getX() && rzut.getX() <= A.getX()) || (B.getX() <= rzut.getX() && rzut.getX() >= A.getX())) {
				return Math.abs(A.getY()-p.getY());
			}
			else {
				return Math.min(p.distance(A), p.distance(B));
			}
		}
		double mult = (pnt.getX()*p.getY()-pnt.getY()*p.getX())/(ort.getX()*pnt.getY()-ort.getY()*pnt.getX());
		rzut = new Punkt(p.getX() + mult*ort.getX(), p.getY() + mult*ort.getY());
		if(
				((rzut.getX() <= A.getX() && rzut.getX() >= B.getX()) || (rzut.getX() <= A.getX() && rzut.getX() >= B.getX()))
				&& (rzut.getY() <= A.getY() && rzut.getY() >= B.getY()) || (rzut.getY() <= A.getY() && rzut.getY() >= B.getY())
				) {
			return p.distance(rzut);
		}
		else {
			return Math.min(p.distance(A), p.distance(B));
		}
		*/
	}
}
