
public class Intern extends Employee{
	String protector;
	int grant;
	public Intern(String firstName, String lastName, int yearOfBirth, String protector, int grant) {
		super(firstName, lastName, yearOfBirth);
		this.protector = protector;
		this.grant = grant;
	}
	public double countEarnings() {
		if(!(new Integer(grant) instanceof Integer))	return 0;	
		return grant;
	}
	@Override
	public String toString() {
		return "Intern [ firstName="+ getFirstName() + " lastName=" + getLastName() + " dateOfBirth="+ getYearOfBirth()+" protector=" + protector + ", grant=" + grant + " salary="+countEarnings() + "]";
	}
}
