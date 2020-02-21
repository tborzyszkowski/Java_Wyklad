package employees.logic;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import employees.logic.Trader.TraderEffectivness;

/*
 * Rejestr powinien umo¿liwiæ realizacjê nastêpuj¹cych zadañ:
 * --OK--dodanie dowolnego z typów pracownika do rejestru
 * --OK--usuniêcie pracownika o danym identyfikatorze pracowniczym z rejestru
 * --OK--dodanie kilku pracowników o ró¿nych typach na raz do rejestru
 * --OK--wyœwietleanie listy wszystkich pracowników posortowanych po liczbie lat doœwiadczenia (malej¹co), nastêpnie po wieku pracownika (rosn¹co), nastêpnie po nazwisku pracownika (zgodnie z kolejnoœci¹ alfabetyczn¹)
 * --OK--wyœwietlenie listy pracowników, którzy pracuj¹ w mieœcie po nazwie podanej jako parametr wejœciowy
 * --OK--wyœwietlenie listy wszystkich pracowników wraz z ich wartoœci¹ dla korporacji, przy czym dla ka¿dego z typów pracownika stopieñ wartoœci obliczany jest w inny sposób:
 * --OK--dla pracownika biurowego: wartoœæ dla korporacji obliczana jest ze wzoru: doœwiadczenie * intelekt
 * --OK--dla pracownika fizycznego: wartoœæ dla korporacji obliczana jest ze wzoru doœwiadczenie * si³a / wiek
 * --OK--dla handlowca: wartoœæ dla korporacji obliczana jest ze wzoru doœwiadczenie * skutecznoœæ, gdzie odpowiedni typ skutecznoœci zamieniany jest na wartoœæ
 * NISKA: 60
 * SREDNIA: 90
 * WYSOKA: 120
 */


class EmployeeTest {

	private List<Employee> employees;
	
	private void setUp() {
		employees = new ArrayList<>();
		employees.add(new WhiteCollarEmployee(50, 120, 1, "Jack", "Black", 27, new Adress("Lipowa", "Gdansk", 2, 1)));
		employees.add(new BlueCollarEmployee(80,2,"Adam", "Sack", 27, new Adress("Lipowa", "Warszawa", 1,2)));
		employees.add(new WhiteCollarEmployee(50, 120, 1, "Samuel", "Cat", 27, new Adress("Lipowa", "Katowice", 2, 1)));
		employees.add(new Trader(TraderEffectivness.high, 12, 3, "Robert", "Fisher", 42, new Adress("Lipowa", "Katowice", 15, 7)));
		employees.add(new Trader(TraderEffectivness.high, 12, 3, "Arthur", "Test", 21, new Adress("Lipowa", "Krakow", 3, 4)));
	}
	
	private void changeExperiance() {
		employees.get(0).setStartDate(LocalDate.of(2018, 10, 1));
		employees.get(1).setStartDate(LocalDate.of(2018, 10, 1));
		employees.get(3).setStartDate(LocalDate.of(2018, 10, 1));
	}
	
	private List<String> employeesWithBussinessValue() {
		List<String> list = new ArrayList<>();
		list.add("Jack Black : 120.0");
		list.add("Adam Sack : 2.962962962962963");
		list.add("Samuel Cat : 0.0");
		list.add("Robert Fisher : 120.0");
		list.add("Arthur Test : 0.0");
		
		return list;

	}
	
	private List<Employee> employeesSortedByExperianceAgeSurname() {
		List<Employee> list = new ArrayList<>();
		list.add(new Trader(TraderEffectivness.high, 12, 3, "Arthur", "Test", 21, new Adress("Lipowa", "Krakow", 3, 4)));
		list.add(new WhiteCollarEmployee(50, 120, 1, "Jack", "Black", 27, new Adress("Lipowa", "Gdansk", 2, 1)));
		list.add(new WhiteCollarEmployee(50, 120, 1, "Samuel", "Cat", 27, new Adress("Lipowa", "Katowice", 2, 1)));
		list.add(new BlueCollarEmployee(80,2,"Adam", "Sack", 27, new Adress("Lipowa", "Warszawa", 1,2)));
		list.add(new Trader(TraderEffectivness.high, 12, 3, "Robert", "Fisher", 42, new Adress("Lipowa", "Katowice", 15, 7)));
		return list;
	}
	
	private List<Employee> employeesFromKatowice() {
		List<Employee> list = new ArrayList<>();
		list.add(new WhiteCollarEmployee(50, 120, 1, "Samuel", "Cat", 27, new Adress("Lipowa", "Katowice", 2, 1)));
		list.add(new Trader(TraderEffectivness.high, 12, 3, "Robert", "Fisher", 42, new Adress("Lipowa", "Katowice", 15, 7)));
		return list;
	}
	
	@Test   
	void addEmployeeTest() {
		Register register = new Register(new EmployeeFactory());
		register.addBlueCollarEmployee(50, 1, "Andrzej", "Kowalski", 32, new Adress("Lipowa","Gdansk",2,1));
		register.addWhiteCollarEmployee(2, 80, 2, "Jack", "Black", 27, new Adress("Baker St", "New York", 12, 42));
		register.addTrader(TraderEffectivness.high, 12, 3, "Robert", "Rybka", 26, new Adress("Zaciszna", "Gdynia", 15, 7));
		assertEquals(3, register.count());
	}
	
	@Test
	void removeEmployeeTest() {
		Register register = new Register(new EmployeeFactory());
		register.addBlueCollarEmployee(50, 1, "Andrzej", "Kowalski", 32, new Adress("Lipowa","Gdansk",2,1));
		register.addWhiteCollarEmployee(2, 80, 2, "Jack", "Black", 27, new Adress("Baker St", "New York", 12, 42));
		register.removeEmployee(2);
		assertEquals(null, register.getEmployee(2));
	}
	
	@Test
	void addManyEmployeesTest() {
		Register register = new Register(null);
		setUp();
		register.addManyEmployees(employees.get(0), employees.get(1), employees.get(2),
									employees.get(3), employees.get(4));
		assertEquals(5, register.count());
	}
	
	@Test
	void getSortedByReverseExperianceAgeSurnameTest() {
		Register register = new Register(new EmployeeFactory());
		setUp();
		register.setEmployees((ArrayList<Employee>)employees);
		List<Employee> list = register.getSortedEmployees(new SurnameComperator(), new AgeComperator(), new ReverseExperianceComperator());
		assertTrue(employeesSortedByExperianceAgeSurname().equals(list));
	}
	
	@Test
	void getEmployeesByCity() {
		Register register = new Register(null);
		setUp();
		register.setEmployees(employees);
		assertTrue(employeesFromKatowice().equals(register.getEmployeesByCity("Katowice")));
	}
	
	@Test
	void getEmployeesWithBussinessValue() {
		Register register = new Register(null);
		setUp();
		register.setEmployees(employees);
		register.setVisitor(new BussinessValueVisitor());
		changeExperiance();
		List<String> list = register.getEmployeesWithBussinessValue();
		assertTrue(employeesWithBussinessValue().equals(list));
	}
}
