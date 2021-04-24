package Laboratorium.dziedziczenie.maszyny;

public class Jednoslad extends Pojazd{
	private String typ = "";

	public Jednoslad(String marka, String nazwa, double moc, String typ) {
		super(marka, nazwa, moc);
		this.typ = typ;
	}
	public Jednoslad(String marka, String nazwa, double moc) {
		super(marka, nazwa, moc);
	}

	@Override
	public String toString() {
		return "Jednoslad{" +
				(typ.isEmpty() ? "" : "typ='" + typ + '\'')
				+ super.toString() + "} " ;
	}
}
