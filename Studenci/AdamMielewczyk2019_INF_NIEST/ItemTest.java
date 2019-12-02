import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void testToString() {
        Item toTest = new Item("Koparka cat", 5, 400000, 0.12);
        assertEquals("||Koparka cat                                               |5x     |400000.0   |2240000.0          ||", toTest.toString(), "toString");
    }

    @Test
    void getNetPrice() {
        Item toTest = new Item("Koparka cat", 5, 400000, 0.12);
        assertEquals(2000000, toTest.getNetPrice(), "getNetPrice");
    }

    @Test
    void getGrossPrice() {
        Item toTest = new Item("Koparka cat", 5, 400000, 0.12);
        assertEquals(2240000, toTest.getGrossPrice(), "getGrossPrice");
    }
}