package Personnel_System;

public class Apprentice extends BodyWorker {
	private boolean scholarship;
	private int valueOfScholarship = 0;
	
	public Apprentice(String name, String surname, int birth, boolean scholarship) {
		super(name, surname, birth);
		this.scholarship = scholarship;
	}

	public boolean isScholarship() {
		return scholarship;
	}

	public void setScholarship(boolean scholarship) {
		this.scholarship = scholarship;
	}
	
	public int getValueOfScholarship() {
		return valueOfScholarship;
	}

	public void setValueOfScholarship(int valueOfScholarship) {
		this.valueOfScholarship = valueOfScholarship;
	}
	
	public int check (boolean scholarship) {
		if (scholarship == true)
			return valueOfScholarship = 800;
		return valueOfScholarship;
	}
	
	public String assistant() {
		return getName() + " " + getSurname();
	}

	@Override
	public String toString() {
		return "Apprentice " + name + " " + surname + ", birth = " + birth
				+ ", scholarship: " + this.check(scholarship);
	}
}
