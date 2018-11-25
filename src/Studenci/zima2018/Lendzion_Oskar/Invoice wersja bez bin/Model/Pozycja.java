package Model;

public class Pozycja {
	
	private String nazwa;
	private int szt;
	private double netto;
	private double sumnetto;
	private double VAT;
	private double sumbrutto;
	public Pozycja(String nazwa, int szt, double netto) {
		super();
		this.nazwa = nazwa;
		this.szt = szt;
		this.netto = netto;
		this.sumnetto = netto * szt;
		this.VAT = sumnetto * 0.23;
		this.sumbrutto = sumnetto + VAT;
	}
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getSzt() {
		return szt;
	}
	public void setSzt(int szt) {
		this.szt = szt;
	}
	public double getNetto() {
		return netto;
	}
	public void setNetto(double netto) {
		this.netto = netto;
	}
	public double getSumnetto() {
		return sumnetto;
	}
	
	
	public double getVAT() {
		return VAT;
	}
	
	public double getSumbrutto() {
		return sumbrutto;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(VAT);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nazwa == null) ? 0 : nazwa.hashCode());
		temp = Double.doubleToLongBits(netto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sumbrutto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sumnetto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + szt;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pozycja other = (Pozycja) obj;
		if (Double.doubleToLongBits(VAT) != Double.doubleToLongBits(other.VAT))
			return false;
		if (nazwa == null) {
			if (other.nazwa != null)
				return false;
		} else if (!nazwa.equals(other.nazwa))
			return false;
		if (Double.doubleToLongBits(netto) != Double.doubleToLongBits(other.netto))
			return false;
		if (Double.doubleToLongBits(sumbrutto) != Double.doubleToLongBits(other.sumbrutto))
			return false;
		if (Double.doubleToLongBits(sumnetto) != Double.doubleToLongBits(other.sumnetto))
			return false;
		if (szt != other.szt)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[Pozycja=" + nazwa + ", szt=" + szt + ", netto=" + netto + ", suma netto=" + sumnetto + ", VAT="
				+ VAT + ", suma brutto=" + sumbrutto + "]\n";
	}
	
	
	

	
	

}
