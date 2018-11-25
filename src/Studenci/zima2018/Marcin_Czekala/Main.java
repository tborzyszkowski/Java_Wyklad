
public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("Marcin", "Czekała", 1996);
		Employee employee2 = new Blue("Marcin", "Czekała", 1996, 20, 200, 50, "Marek Pion","wozki,prawo jazdy,uprawienia");
		Employee employee3 = new BoardMember("Marcin", "Czekała", 1996, 4000, "Piotr Nowak", 20);
		Employee employee4 = new Head("Marcin", "Czekała", 1996, 4000, 0.1 ,1000, 200000000,111111111,101,"Cool Dept");
		Employee employee5 = new Intern("Marcin", "Czekała", 1996, "Piotr Nowak", 1800);
		Employee employee6 = new White("Marcin", "Czekała", 1996, 2800, 0.05 , "Piotr Nowak",400000000,520);
		System.out.println(employee);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);
		System.out.println(employee6);
	}

}
