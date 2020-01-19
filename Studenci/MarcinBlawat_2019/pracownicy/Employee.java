package employees.logic;

import java.time.LocalDate;
import java.time.Period;

public abstract class Employee {
	
	private int id;
	private String name;
	private String surname;
	private int age;
	private Adress adress;
	private LocalDate startDate;
	
	public Employee() {}
	
	public void configure(int id, String name, String surname, int age, 
								Adress adress) {
		setId(id);
		setName(name);
		setSurname(surname);
		setAge(age);
		setAdress(adress);
		setStartDate(LocalDate.now());
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this.getClass() == obj.getClass()) {
			Employee temp = (Employee) obj;
			if(this.getAge() != temp.getAge())
				return false;
			if(this.getId() != temp.getId())
				return false;
			if(!this.getName().equals(temp.getName()))
				return false;
			if(!this.getSurname().equals(temp.getSurname()))
				return false;
			if(!this.getStartDate().equals(temp.getStartDate()))
				return false;
			if(!this.getAdress().equals(temp.getAdress()))
				return false;
		}
		else
			return false;
		
		return true;
	}
	
	public int getSeniorityInYears() {
		return Period.between(startDate, LocalDate.now()).getYears();
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
}
