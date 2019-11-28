import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhysicalWorkerTest {

    @Test
    public void getStrength() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        PhysicalWorker worker = new PhysicalWorker(1, "name", "surname", 2, 3,address, 4, 50 );
        Assert.assertEquals(worker.getStrength(), 50, 0.01);
    }

    @Test
    public void setStrength() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        PhysicalWorker worker = new PhysicalWorker(1, "name", "surname", 2, 3,address, 4, 50 );
        worker.setStrength(75);
        Assert.assertEquals(worker.getStrength(), 75, 0.01);
    }
    @Test
    public void getValue(){
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        PhysicalWorker worker = new PhysicalWorker(1, "name", "surname", 3, 3,address, 4, 50 );
        Assert.assertEquals(worker.getValue(), 50, 0.001);

    }
}