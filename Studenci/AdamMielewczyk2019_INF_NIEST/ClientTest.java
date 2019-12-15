import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    @Test
    void constructor(){
        //zły nip
        assertThrows(IllegalArgumentException.class, () -> {
            new Client("SpaceX sp.z.o.o.", "84-200 Waszyngton, Szkolna 1234", 56794682576L,new  BigInteger("42565478321845987846954185"));
        }, "za długi nip");
        assertThrows(IllegalArgumentException.class, () -> {
            new Client("SpaceX sp.z.o.o.", "84-200 Waszyngton, Szkolna 1234", 5679462576L,new  BigInteger("42565478321845987846954185"));
        }, "za krótki nip");

        //zły numer konta
        assertThrows(IllegalArgumentException.class, () -> {
            new Client("SpaceX sp.z.o.o.", "84-200 Waszyngton, Szkolna 1234", 56794682576L,new  BigInteger("425654783218459987846954185"));
        }, "za długi numer konta");
        assertThrows(IllegalArgumentException.class, () -> {
            new Client("SpaceX sp.z.o.o.", "84-200 Waszyngton, Szkolna 1234", 5679462576L,new  BigInteger("4256547832184597846954185"));
        }, "za krótki numer konta");
    }

    @Test
    void testToString() {
        Client toTest = new Client("SpaceX sp.z.o.o.", "84-200 Waszyngton, Szkolna 1234", 6794682576L,new  BigInteger("42565478321845987846954185"));
        assertEquals("||SpaceX sp.z.o.o.       |84-200 Waszyngton, Szkolna 1234   |6794682576|42565478321845987846954185  ||\n", toTest.toString(), "toString");
    }
}