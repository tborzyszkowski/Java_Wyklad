package wyklad._07wyjatki;

class Switch {
	boolean state = false;

	boolean getState() {
		return state;
	}

	void on() {
		state = true;
	}

	void off() {
		state = false;
	}

	public String toString() {
		return state ? "true" : "false";
	}
}

class ExcB {
	static Switch sw = new Switch();

	public static void main(String[] args) {
		try {
			sw.on();
			System.out.println("Włącznik :" + sw);
			throw new NullPointerException("To tylko test");
			//sw.off();
			//System.out.println("Włącznik :" + sw);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
			//sw.off();
			System.out.println("Włącznik :" + sw);
		} catch (IllegalArgumentException e) {
			System.out.println("IOException");
			//sw.off();
			System.out.println("Włącznik :" + sw);
		} finally {
			sw.off();
			System.out.println("Włącznik :" + sw);
		}
		System.out.println("Włącznik :" + sw);
	}
}
