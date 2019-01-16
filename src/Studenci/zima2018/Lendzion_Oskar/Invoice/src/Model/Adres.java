package Model;

public class Adres {

	private String ulica;
	private String miasto;
	private String kod;
	
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public String getMiasto() {
		return miasto;
	}
	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kod == null) ? 0 : kod.hashCode());
		result = prime * result + ((miasto == null) ? 0 : miasto.hashCode());
		result = prime * result + ((ulica == null) ? 0 : ulica.hashCode());
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
		Adres other = (Adres) obj;
		if (kod == null) {
			if (other.kod != null)
				return false;
		} else if (!kod.equals(other.kod))
			return false;
		if (miasto == null) {
			if (other.miasto != null)
				return false;
		} else if (!miasto.equals(other.miasto))
			return false;
		if (ulica == null) {
			if (other.ulica != null)
				return false;
		} else if (!ulica.equals(other.ulica))
			return false;
		return true;
	}
	public Adres(String ulica, String miasto, String kod) {
		super();
		this.ulica = ulica;
		this.miasto = miasto;
		this.kod = kod;
	}
	
	public Adres() {
		super();
		this.ulica = "moja ulica";
		this.miasto = "Gdansk";
		this.kod = "80-074";
	}
	
	@Override
	public String toString() {
		return "Adres [ulica=" + ulica + ", miasto=" + miasto + ", kod=" + kod + "]";
	}
	
	
	
}
