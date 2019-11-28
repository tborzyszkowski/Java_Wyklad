import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkerTest {


    @Test
    public void getId() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        Assert.assertEquals(worker.getId(), 1);
    }

    @Test
    public void getName() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        Assert.assertEquals(worker.getName(), "name");
    }

    @Test
    public void getSurname() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        Assert.assertEquals(worker.getSurname(), "surname");
    }

    @Test
    public void getAge() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        Assert.assertEquals(worker.getAge(), 2);
    }

    @Test
    public void setAge() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        worker.setAge(3);
        Assert.assertEquals(worker.getAge(), 3);
    }

    @Test
    public void getExperience() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        Assert.assertEquals(worker.getExperience(), 3);
    }

    @Test
    public void setExperience() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        worker.setExperience(1);
        Assert.assertEquals(worker.getExperience(), 1);
    }

    @Test
    public void getAddress() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80);
        Assert.assertEquals(worker.getAddress(), address);
    }

    @Test
    public void setAddress() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        Address address2 = new Address("miastoo", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        worker.setAddress(address2);
        Assert.assertEquals(worker.getAddress(), address2);
    }

    @Test
    public void getOfficeId() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        Assert.assertEquals(worker.getOfficeId(), 4);
    }

    @Test
    public void setOfficeId() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        worker.setOfficeId(1);
        Assert.assertEquals(worker.getOfficeId(), 1);
    }
}