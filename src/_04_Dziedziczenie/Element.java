package _04_Dziedziczenie;


public class Element implements Cloneable {
	int i = 5;
	
	void setI(int k){
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
	public String toString(){
		return "Element i = " + i;
	}
}
