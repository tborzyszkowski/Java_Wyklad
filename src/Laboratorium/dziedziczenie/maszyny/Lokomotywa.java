package Laboratorium.dziedziczenie.maszyny;

public class Lokomotywa extends Maszyna{
	private double cisnienie;

	public Lokomotywa(String marka, String nazwa, double cisnienie) {
		this.setMarka(marka);
		this.setNazwa(nazwa);
		this.cisnienie = cisnienie;
	}

	public double getCisnienie() {
		return cisnienie;
	}

	public void setCisnienie(double cisnienie) {
		this.cisnienie = cisnienie;
	}

	@Override
	public String toString() {
		return "Lokomotywa{" +
				"cisnienie=" + cisnienie +
				", marka='" + marka + '\'' +
				", nazwa='" + nazwa + '\'' +
				"} ";
	}
}
