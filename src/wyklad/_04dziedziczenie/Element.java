package wyklad._04dziedziczenie;


import java.util.Objects;

public class Element implements Cloneable {
	int i = 5;

	void setI(int k) {
		i = k;
	}

	public Element clone() throws CloneNotSupportedException {
		try {
			Element cloned = (Element) super.clone();
			cloned.i = i;
			return cloned;
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
			return null;
		}
	}

	public String toString() {
		return "Element i = " + i;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Element)) return false;
		Element element = (Element) o;
		return i == element.i;
	}

	@Override
	public int hashCode() {
		return Objects.hash(i);
	}
}
