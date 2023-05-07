package Laboratorium.park;

public class Maszyna {
	private int value = 0;

	public Maszyna(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	 public String toString(){
		return "{Maszyna: " + getValue() +"}";
	 }
}
