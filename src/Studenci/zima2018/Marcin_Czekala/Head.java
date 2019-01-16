
public class Head  extends White{
	private int headBonus;
	private int mobileNumber;
	private int roomNumber;
	private String dept;
	public Head(String firstName, String lastName, int yearOfBirth, int salary, double bonus, int headBonus,int phoneNumber, int mobileNumber, int roomNumber, String dept) {
		super(firstName, lastName, yearOfBirth, salary, bonus, "", phoneNumber,roomNumber);
		this.headBonus = headBonus;
		this.mobileNumber = mobileNumber;
		this.dept = dept;
	}
	@Override
	public double countEarnings() {
		double salary= getSalary();
		double bonus= getBonus();
		return salary+salary*bonus+headBonus;
	}
	@Override
	public String toString() {
		return "Head [ firstName="+ getFirstName() + " lastName=" + getLastName() + " dateOfBirth="+ getYearOfBirth()+ " salary=" + getSalary() + ", bonus=" + getBonus() + ", headBonus=" + headBonus + ", phoneNumber="
				+ getPhoneNumber() + ", mobileNumber=" + mobileNumber + ", roomNumber=" + roomNumber + ", dept=" + dept
				+ " salary="+countEarnings() + "]";
	}
}
