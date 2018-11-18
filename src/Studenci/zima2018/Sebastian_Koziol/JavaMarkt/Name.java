package JavaMarkt.JavaMarkt2;

import java.util.Scanner;

public class Name {
	public Name(String name) {
		this.name = name;
	}

	private String name;
	
	Scanner scanner = new Scanner(System.in);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Name() {
		this.name = "Stranger";
	}
		
	@Override
	public String toString() {
		return "Name [name=" + name + ", scanner=" + scanner + "]";
	}
}
