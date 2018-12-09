package kadra;

public class Fizyczny extends Pracownik {
	
	private int HourlyRate;
	private int WorkHours;
	private int Overtime;
	private String Boss;
	private String Skills;
	private double Salary;
	
	public Fizyczny(String Name, String Surname, String DoB, int HourlyRate, int WorkHours, int Overtime, String Boss, String Skills, double Salary) {
		super(Name, Surname, DoB);
		this.HourlyRate = HourlyRate;
		this.WorkHours = WorkHours;
		this.Overtime = Overtime;
		this.Boss = Boss;
		this.Skills = Skills;
		this.Salary = (HourlyRate * WorkHours) + (1.5 * HourlyRate * Overtime);
	}
	
	public int getHourlyRate() {
		return HourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		HourlyRate = hourlyRate;
	}
	public int getWorkHours() {
		return WorkHours;
	}
	public void setWorkHours(int workHours) {
		WorkHours = workHours;
	}
	public int getOvertime() {
		return Overtime;
	}
	public void setOvertime(int overtime) {
		Overtime = overtime;
	}
	public String getBoss() {
		return Boss;
	}
	public void setBoss(String boss) {
		Boss = boss;
	}
	public String getSkills() {
		return Skills;
	}
	public void setSkills(String skills) {
		Skills = skills;
	}

	@Override
	public String toString() {
		return "Fizyczny [Name=" + Name + ",Surname=" + Surname + ",Date=" + DoB + ", HourlyRate=" + HourlyRate + ", WorkHours=" + WorkHours + ", Overtime=" + Overtime + ", Boss="
				+ Boss + ", Skills=" + Skills + ", Salary=" + Salary + "]";
	}

	
	
	
	

}
