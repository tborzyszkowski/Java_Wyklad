import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void sort() {
        Date birthDate = new Date();
        birthDate.setYear(birthDate.getYear()-30);
        Date hireDate = new Date();
        hireDate.setYear(birthDate.getYear()+25);
        Employee empForTest0 = new OfficeEmployee("Wojtek", "Lew", birthDate, hireDate,
                new Address("Gdynia", "Odrębna", 19), 120);//value 600
        Employee empForTest1 = new Dealer("Alojzy", "Krolikowski", birthDate, hireDate,
                new Address("Wejherowo", "Okrezna", 13), 5, Dealer.Efficiency.ŚREDNIA);//value 450
        Employee empForTest2 = new Labourer("Patryk", "Krolikowska", birthDate, hireDate,
                new Address("Wejherowo", "Okrezna", 23), 50);//value 8

        Register register = new Register();
        register.addEmployee(empForTest0);
        register.addEmployee(empForTest1);
        register.addEmployee(empForTest2);

        assertTrue(register.getSortedEmployees().indexOf(empForTest0) == 2
                && register.getSortedEmployees().indexOf(empForTest1) == 1
                && register.getSortedEmployees().indexOf(empForTest2) == 0,
                "Sortiwanie");
    }

    @Test
    void sortByValue() {
        Date birthDate = new Date();
        birthDate.setYear(birthDate.getYear()-30);
        Date hireDate = new Date();
        hireDate.setYear(birthDate.getYear()+25);
        Employee empForTest0 = new Dealer("Alojzy", "Krolikowski", birthDate, hireDate,
                new Address("Wejherowo", "Okrezna", 13), 5, Dealer.Efficiency.ŚREDNIA);//value 450
        Employee empForTest1 = new Labourer("Patryk", "Krolikowski", birthDate, hireDate,
                new Address("Wejherowo", "Okrezna", 23), 50);//value 8
        Employee empForTest2 = new OfficeEmployee("Wojtek", "Lew", birthDate, hireDate,
                new Address("Gdynia", "Odrębna", 19), 120);//value 600
        Register register = new Register();
        register.addEmployee(empForTest0);
        register.addEmployee(empForTest1);
        register.addEmployee(empForTest2);

        assertTrue(register.getSortedByValueEmployees().indexOf(empForTest0) == 1
                && register.getSortedByValueEmployees().indexOf(empForTest1) == 2
                && register.getSortedByValueEmployees().indexOf(empForTest2) == 0,
                "Sortowanie po wartosci dla firmy");
    }

    @Test
    void getEmployeesFromTown() {
        Date birthDate = new Date();
        birthDate.setYear(birthDate.getYear()-30);
        Date hireDate = new Date();
        hireDate.setYear(birthDate.getYear()+25);
        Employee empForTest0 = new Dealer("Alojzy", "Krolikowski", birthDate, hireDate,
                new Address("Wejherowo", "Okrezna", 13), 5, Dealer.Efficiency.ŚREDNIA);//value 450
        Employee empForTest1 = new Labourer("Patryk", "Krolikowski", birthDate, hireDate,
                new Address("Wejherowo", "Okrezna", 23), 50);//value 8
        Employee empForTest2 = new OfficeEmployee("Wojtek", "Lew", birthDate, hireDate,
                new Address("Gdynia", "Odrębna", 19), 120);//value 600
        Register register = new Register();
        register.addEmployee(empForTest0);
        register.addEmployee(empForTest1);
        register.addEmployee(empForTest2);
        assertTrue(register.getEmployeesFromTown("Wejherowo").contains(empForTest0)
            &&register.getEmployeesFromTown("Wejherowo").contains(empForTest1)
            && !register.getEmployeesFromTown("Wejherowo").contains(empForTest2));
    }

    @Test
    void string() {
        Date birthDate = new Date(89,11,23);
        Date hireDate = new Date(114,11,23);
        Employee empForTest0 = new Dealer("Alojzy", "Krolikowski", birthDate, hireDate,
                new Address("Wejherowo", "Okrezna", 13), 5, Dealer.Efficiency.ŚREDNIA);//value 450
        Employee empForTest1 = new Labourer("Patryk", "Krolikowski", birthDate, hireDate,
                new Address("Wejherowo", "Okrezna", 23), 50);//value 8
        Employee empForTest2 = new OfficeEmployee("Wojtek", "Lew", birthDate, hireDate,
                new Address("Gdynia", "Odrębna", 19), 120);//value 600
        Register register = new Register();
        register.addEmployee(empForTest0);
        register.addEmployee(empForTest1);
        register.addEmployee(empForTest2);
        assertEquals("[NAME: Alojzy Krolikowski  BIRTH: Sat Dec 23 00:00:00 CET 1989  HIRE: Tue Dec 23 00:00:00 CET 2014  ADRESS: 13 Okrezna, Wejherowo  COMMISION: 5  EFFICIENCY: ŚREDNIA\n" +
                "\n" +
                ", NAME: Patryk Krolikowski  BIRTH: Sat Dec 23 00:00:00 CET 1989  HIRE: Tue Dec 23 00:00:00 CET 2014  ADRESS: 23 Okrezna, Wejherowo  STRENGTH: 50\n" +
                "\n" +
                ", NAME: Wojtek Lew  BIRTH: Sat Dec 23 00:00:00 CET 1989  HIRE: Tue Dec 23 00:00:00 CET 2014  ADRESS: 19 Odrębna, Gdynia  BOX_NUMBER: 0  IQ: 120\n" +
                "\n" +
                "]",register.toString(),"Wypisywanie pracownikow");
    }
}