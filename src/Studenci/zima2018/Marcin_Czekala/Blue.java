
public class Blue extends Employee{
	private int stake;
	private int hoursOfWork;
	private int overtime;
	private String head;
	private String skills;
	
	public Blue(String firstName, String lastName, int yearOfBirth, int stake, int hoursOfWork, int overtime, String head, String skills) {
		super(firstName, lastName, yearOfBirth);
		this.stake = stake;
		this.hoursOfWork = hoursOfWork;
		this.overtime = overtime;
		this.head = head;
		this.skills = skills;
	}
	public double countEarnings() {
		return stake*hoursOfWork+(1.5*stake*overtime);
	}
	@Override
	public String toString() {
		return "Blue [ firstName="+ getFirstName() + " lastName=" + getLastName() + " dateOfBirth="+ getYearOfBirth()+ " stake=" + stake + ", hoursOfWork=" + hoursOfWork + ", overtime=" + overtime + ", head=" + head
				+ ", skills=" + skills + " salary="+countEarnings() +"]";
	}
}