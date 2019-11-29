package koszyk;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void getName() {
        Client client = new Client("asdf");
        assertEquals("asdf", client.getName());
    }

    @Test
    public void setName() {
        Client client = new Client("asdf");
        client.setName("qwerty");
        assertEquals("qwerty", client.getName());
    }
}