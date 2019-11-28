import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OfficeWorkerTest {

    @Test
    public void getIq() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        Assert.assertEquals(worker.getIq(), 80);
    }

    @Test
    public void setIq() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        worker.setIq(120);
        Assert.assertEquals(worker.getIq(), 120);
    }
    @Test(expected = ValueException.class)
    public void iqError() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 1 );
    }
    @Test
    public void getValue(){
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        Assert.assertEquals(worker.getValue(), 240);
    }
}