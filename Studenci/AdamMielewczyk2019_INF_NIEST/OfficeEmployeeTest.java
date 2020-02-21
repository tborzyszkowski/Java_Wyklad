import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class OfficeEmployeeTest {
    @Test
    void boxReassignBox() {
        Date birthDate = new Date();
        birthDate.setYear(birthDate.getYear()-30);
        Date hireDate = new Date();
        hireDate.setYear(birthDate.getYear()+25);
        OfficeEmployee empForTest0 = new OfficeEmployee("Wojtek", "Lew", birthDate, hireDate,
                new Address("Gdynia", "Odrębna", 19), 120);//value 600

        Register register = new Register();
        register.addEmployee(empForTest0);
        register.delEmployee(empForTest0);

        OfficeEmployee empForTest1 = new OfficeEmployee("Alojzy", "Krolikowski", birthDate, hireDate,
                new Address("Wejherowo", "Okrezna", 13), 150);
        register.addEmployee(empForTest1);

        assertEquals(0, empForTest1.getBoxNumber());
    }

}