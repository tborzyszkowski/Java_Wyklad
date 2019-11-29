
public class Pozycja {
	private String nazwa;
	private double ilosc; //Sztuki lub kilogramy
	private double cena; //Netto za sztukê lub kilogram
	private double VAT;
	Pozycja(String nazwa, double ilosc, int cena, double vat){
		this.nazwa=nazwa;
		this.ilosc=ilosc;
		this.cena=cena;
		this.VAT=vat;
	}
	public String getName() {
		return nazwa;
	}
	public double getQuantity() {
		return ilosc;
	}
	public double getPrice() {
		return cena;
	}
	public double getVAT() {
		return VAT;
	}
	public double getBrutto() {
		return getNetto()*VAT;
	}
	public double getNetto() {
		return cena*ilosc;
	}
}
