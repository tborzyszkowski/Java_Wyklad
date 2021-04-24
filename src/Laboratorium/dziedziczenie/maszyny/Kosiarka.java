package Laboratorium.dziedziczenie.maszyny;

public class Kosiarka extends Maszyna{
	private boolean czyMelekser;

	public Kosiarka(String marka, String nazwa, boolean czyMelekser) {
		this.setMarka(marka);
		this.setNazwa(nazwa);
		this.czyMelekser = czyMelekser;
	}

	@Override
	public String toString() {
		return "Kosiarka{" +
				"czyMelekser=" + czyMelekser +
				", marka='" + marka + '\'' +
				", nazwa='" + nazwa + '\'' +
				"} ";
	}
}
