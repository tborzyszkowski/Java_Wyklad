package Personnel_System;

public  class Worker {

	String name;
	String surname;
	int birth;
	
	public Worker(String name, String surname, int birth) {
		super();
		this.name = name;
		this.surname = surname;
		this.birth = birth;
	}
	
	public Worker() {
		super();
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
	
	public int getBirth() {
		return birth;
	}
	
	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		return "Worker " + name + " " + surname + ", birth = " + birth;
	}

}
