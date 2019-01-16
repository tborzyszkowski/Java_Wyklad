package PersonalSystem;

import PersonalSystem.Modele.*;

public class Main {
    public static void main(String[] args)
    {

        Employee[] employees = new Employee[5];
        employees[0] = new Worker("Stefan", "Jażębina", 1874, 2, 14, 15.0,
                170, 30.0);
        employees[1] = new MaindWorker("Zbyszek", "Kieliszek", 1870, 5, 3, 2500.0,
                5.0, "300-22-33", "028");
        employees[2] = new Manager("Waldemar", "Ważny", 1956,8,25,2500.0, 5.0,
                "300-22-44","038",1000.0,"500-222-333","Gier i zabaw");
        employees[3] = new Member("Bardzo", "Ważny", 1968,5,5, 20000,"Jadwiga", 3);
        employees[4] = new Student("Zwykły", "Student", 1987, 5,7,employees[1],true);

        for (Employee e : employees)
            System.out.println("\nImię: " + e.getFirstName() + "\nNazwisko: " + e.getLastName() + "\nWypłata: " + e.getSalary());

        System.out.println(employees[1]);
        System.out.println(employees[2]);
        System.out.println(employees[4]);
    }
}