package wyklad._04dziedziczenie;

public class Dolly implements Cloneable {
	Element e = new Element();
	int w = 10;

	public String toString() {
		return "" + e + " w = " + w;
	}

	public Dolly clone() throws CloneNotSupportedException {
		try {
			Dolly cloned = (Dolly) super.clone();
			cloned.e = (Element) e.clone();// e;//
			return cloned;
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
			return null;
		}
	}
}
