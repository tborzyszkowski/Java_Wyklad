package Laboratorium.dziedziczenie.maszyny;

public class Pojazd extends Maszyna{
	static int nextNumber = 1;
	protected double moc;
	protected int numerPojazdu;

	public Pojazd(String marka, String nazwa, double moc) {
		this.setMarka(marka);
		this.setNazwa(nazwa);
		this.moc = moc;
		this.numerPojazdu = nextNumber++;
	}

	@Override
	public String toString() {
		return "Pojazd{" +
				"numerPojazdu= " + numerPojazdu +
				", marka='" + marka + '\'' +
				", nazwa='" + nazwa + '\'' +
				", moc=" + moc +
				"} " ;
	}
}
