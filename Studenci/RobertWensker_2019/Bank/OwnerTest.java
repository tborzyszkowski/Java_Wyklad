import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void getName() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Assert.assertEquals("Robert",owner1.getName());
    }

    @Test
    void setName() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        owner1.setName("Kuba");
        Assert.assertEquals("Kuba",owner1.getName());
    }

    @Test
    void getSurname() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Assert.assertEquals("Wensker",owner1.getSurname());
    }

    @Test
    void setSurname() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        owner1.setSurname("Kowalski");
        Assert.assertEquals("Kowalski",owner1.getSurname());
    }

    @Test
    void getData() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        Assert.assertEquals(new Date(1998, Calendar.SEPTEMBER,24),owner1.getData());
    }

    @Test
    void setData() {
        Owner owner1 = new Owner("Robert", "Wensker",new Date(1998, Calendar.SEPTEMBER,24));
        owner1.setData(new Date(1998, Calendar.SEPTEMBER,12));
        Assert.assertEquals(new Date(1998, Calendar.SEPTEMBER,12),owner1.getData());
    }
}