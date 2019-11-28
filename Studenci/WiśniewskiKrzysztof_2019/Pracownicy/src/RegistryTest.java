import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class RegistryTest {

    @Test
    public void addWorker() { Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        Registry registry = new Registry();
        registry.addWorker(worker);
        Assert.assertEquals(registry.getWorkers().size(), 1);
    }

    @Test
    public void getWorkers() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        Registry registry = new Registry();
        registry.addWorker(worker);
        ArrayList<Worker> list= new ArrayList<>();
        list.add(worker);
        Assert.assertEquals(registry.getWorkers(),list);

    }

    @Test
    public void removeWorker() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        Registry registry = new Registry();
        registry.addWorker(worker);
        registry.removeWorker(1);
        Assert.assertEquals(registry.getWorkers().size(), 0);
    }

    @Test
    public void addWorkers() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        OfficeWorker worker2 = new OfficeWorker(2, "name2", "surname", 2, 3,address, 4, 80 );

        Registry registry = new Registry();
        ArrayList<Worker> list= new ArrayList<>();
        list.add(worker);
        list.add(worker2);
        registry.addWorkers(list);
        Assert.assertEquals(registry.getWorkers().size(), 2);
    }

    @Test
    public void printWorkers() {
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        OfficeWorker worker = new OfficeWorker(1, "name", "surname", 2, 3,address, 4, 80 );
        OfficeWorker worker2 = new OfficeWorker(2, "name2", "surname", 2, 3,address, 4, 80 );

        Registry registry = new Registry();
        ArrayList<Worker> list= new ArrayList<>();
        list.add(worker);
        list.add(worker2);
        registry.addWorkers(list);
        registry.printWorkers();
        String[] expected = {"OfficeWorker{, id=1, name='name', surname='surname', age=2, experience=3, address=Address@4a58b90a, officeId=4, value=240iq=80}", "OfficeWorker{, id=2, name='name2', surname='surname', age=2, experience=3, address=Address@4a58b90a, officeId=4, value=240iq=80}"};
        String[] actual =  outputStream.toString().replaceAll("\\r\\n", "\n").split("\n");
        Assert.assertArrayEquals(actual, expected);
    }

}