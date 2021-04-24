package wyklad._03klasy;

public class Ksiazka {
	private String autor;
	private String tytul;

	public Ksiazka(String autor, String tytul) {
		this.autor = autor;
		this.tytul = tytul;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Ksiazka)) return false;

		Ksiazka ksiazka = (Ksiazka) o;

		if (!autor.equals(ksiazka.autor)) return false;
		return tytul.equals(ksiazka.tytul);
	}

	@Override
	public int hashCode() {
		int result = autor.hashCode();
		result = 31 * result + tytul.hashCode() + super.hashCode();
		return result;
	}
}
