import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DealerTest {

    @Test
    public void getEffectiveness() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        Dealer worker = new Dealer(1, "name", "surname", 2, 3,address, 4, "NISKA", 5 );
        Assert.assertEquals(worker.getEffectiveness(), "NISKA");
    }

    @Test
    public void setEffectiveness() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        Dealer worker = new Dealer(1, "name", "surname", 2, 3,address, 4, "NISKA", 5 );
        worker.setEffectiveness("SREDNIA");
        Assert.assertEquals(worker.getEffectiveness(), "SREDNIA");
    }
    @Test(expected = ValueException.class)
    public void effectivenessError(){
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        Dealer worker = new Dealer(1, "name", "surname", 2, 3,address, 4, "abc", 5 );
    }

    @Test
    public void getCommision() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        Dealer worker = new Dealer(1, "name", "surname", 2, 3,address, 4, "NISKA", 5 );
        Assert.assertEquals(worker.getCommision(), 5);
    }

    @Test
    public void setCommision() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        Dealer worker = new Dealer(1, "name", "surname", 2, 3,address, 4, "NISKA", 5 );
        worker.setCommision(10);
        Assert.assertEquals(worker.getCommision(), 10);
    }
    @Test
    public void getValue() {
        Address address = new Address("miasto", "Ulica", "dom", "mieszkanie");
        Dealer worker = new Dealer(1, "name", "surname", 2, 3,address, 4, "NISKA", 5 );
        Assert.assertEquals(worker.getValue(), 90);
    }

}