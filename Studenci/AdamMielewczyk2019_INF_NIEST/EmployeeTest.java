import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getAge_AtBirthday() {
        Date birthDate = new Date();
        birthDate.setYear(89);
        Date hireDate = new Date();
        hireDate.setYear(110);
        Employee empForTest = new Dealer("Alojzy", "Krolikowski", birthDate,
                new Date(110, 11, 15),
                new Employee.Address("Wejherowo", "Okrezna", 13), 5, Dealer.Efficiency.ŚREDNIA);
        assertEquals((new Date()).getYear() - birthDate.getYear(), empForTest.getAge());
    }

    @Test
    void getAge_OneDayBeforeBirthday() {
        Date birthDate = new Date();
        birthDate.setYear(89);
        birthDate.setDate(birthDate.getDate()+1);
        Date hireDate = new Date();
        hireDate.setYear(110);
        Employee empForTest = new Dealer("Alojzy", "Krolikowski", birthDate,
                new Date(110, 11, 15),
                new Employee.Address("Wejherowo", "Okrezna", 13), 5, Dealer.Efficiency.ŚREDNIA);
        assertEquals((new Date()).getYear() - birthDate.getYear() -1, empForTest.getAge());
    }

    @Test
    void getExperience_AtHire() {
        Date birthDate = new Date();
        birthDate.setYear(89);
        Date hireDate = new Date();
        hireDate.setYear(110);
        Employee empForTest = new Dealer("Alojzy", "Krolikowski", birthDate, hireDate,
                new Employee.Address("Wejherowo", "Okrezna", 13), 5, Dealer.Efficiency.ŚREDNIA);
        assertEquals((new Date()).getYear() - hireDate.getYear(), empForTest.getExperience());
    }

    @Test
    void getExperience_OneDayBeforeHire() {
        Date birthDate = new Date();
        birthDate.setYear(89);
        Date hireDate = new Date();
        hireDate.setYear(110);
        hireDate.setDate(hireDate.getDate()+1);
        Employee empForTest = new Dealer("Alojzy", "Krolikowski", birthDate, hireDate,
                new Employee.Address("Wejherowo", "Okrezna", 13), 5, Dealer.Efficiency.ŚREDNIA);
        assertEquals((new Date()).getYear() - hireDate.getYear() -1, empForTest.getExperience());
    }




}
