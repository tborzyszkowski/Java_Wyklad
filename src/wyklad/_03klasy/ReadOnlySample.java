package wyklad._03klasy;

class ReadOnly {
	final public double value;

	public ReadOnly(double initialValue) {
		value = initialValue;
	}

	@Override
	public String toString() {
		return "ReadOnly{" +
				"value=" + value +
				'}';
	}
}

public class ReadOnlySample {
	public static void main(String[] args) {
		ReadOnly readOnly1 = new ReadOnly(10);
		ReadOnly readOnly2 = new ReadOnly(20);

//		readOnly1.value = 15;
		System.out.println(readOnly1);
		System.out.println(readOnly2);
	}
}
