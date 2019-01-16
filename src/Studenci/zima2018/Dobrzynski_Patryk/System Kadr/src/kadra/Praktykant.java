package kadra;


public class Praktykant extends Pracownik {
	
	private String guardian;
	private int scholarship;
	
	public Praktykant(String Name, String Surname, String DoB, String guardian, int scholarship) {
		super(Name, Surname, DoB);
		this.guardian = guardian;
		this.scholarship = scholarship;
	}
	
	public String getGuardian() {
		return guardian;
	}
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	public int scholarship() {
		return scholarship = 0;
	}
 	
	public int getScholarship() {
		return scholarship;
	}
	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}
	@Override
	public String toString() {
		return "Praktykant [Name=" + Name + ", Surname=" + Surname + ", Date of Birth=" + DoB + ", guardian=" + guardian + ", scholarship=" + scholarship + "]";
	}
	
	

}
