import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class OwnerTest {

    @Test
    public void getName() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1) ) ;
        Assert.assertEquals(owner.getName(), "abc");
    }

    @Test
    public void setName() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1) ) ;
        owner.setName("def");
        Assert.assertEquals(owner.getName(), "def");
    }

    @Test
    public void getSurname() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1)) ;
        Assert.assertEquals(owner.getSurname(), "def");
    }

    @Test
    public void setSurname() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1) ) ;
        owner.setSurname("abc");
        Assert.assertEquals(owner.getSurname(), "abc");
    }

    @Test
    public void getDate_of_birth() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1990, 1, 1) ) ;
        Assert.assertEquals(owner.getDate_of_birth(), LocalDate.of(1990, 1, 1));
    }

    @Test
    public void setDate_of_birth() {
        Owner owner = new Owner("abc", "def", LocalDate.of(1900, 1, 1) ) ;
        owner.setDate_of_birth(LocalDate.of(1999, 1, 1));
        Assert.assertEquals(owner.getDate_of_birth(), LocalDate.of(1999, 1, 1));
    }

}