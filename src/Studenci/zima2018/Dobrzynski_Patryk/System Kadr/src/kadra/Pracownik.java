package kadra;

public class Pracownik {
	
	public String Name;
	public String Surname;
	public String DoB;
	
	public Pracownik(String Name, String Surname, String DoB){
		this.Name = Name;
		this.Surname = Surname;
		this.DoB = DoB;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	
	public String getDoB() {
		return DoB;
	}

	public void setDoB(String doB) {
		DoB = doB;
	}

	@Override
	public String toString() {
		return "Pracownik [Name=" + Name + ", Surname=" + Surname + ", Date of birth=" + DoB + "]";
	}
	
	

}
