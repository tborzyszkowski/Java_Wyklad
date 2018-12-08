package systemKadrowy;

public class Praktykant extends Pracownik{

	PracownikUmyslowy opiekun;
	private boolean stypendium;
	
	public Praktykant(String imie, String nazwisko, int rokUrodzenia, PracownikUmyslowy opiekun, boolean stypendium) {
		super(imie, nazwisko, rokUrodzenia);
		this.opiekun = opiekun;
		this.stypendium = stypendium;
	}

	public PracownikUmyslowy getOpiekun() {
		return opiekun;
	}

	public void setOpiekun(PracownikUmyslowy opiekun) {
		this.opiekun = opiekun;
	}

	public boolean isStypendium() {
		return stypendium;
	}

	public void setStypendium(boolean stypendium) {
		this.stypendium = stypendium;
	}

	@Override
	public String toString() {
		return "Praktykant [" + super.toString() + ", stypendium=" + stypendium + "[opiekun= " + opiekun.getImie() + " " + opiekun.getNazwisko() + "]";
	}
	
	
}
