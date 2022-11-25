package wyklad._03klasy;

class ReadOnly1 {
	final public double value;

	public ReadOnly1(double initialValue) {
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
		ReadOnly1 readOnly1 = new ReadOnly1(10);
		ReadOnly1 readOnly2 = new ReadOnly1(20);

//		readOnly1.value = 15;
		double qq = readOnly1.value;
		System.out.println(readOnly1);
		System.out.println(readOnly2);
	}
}
