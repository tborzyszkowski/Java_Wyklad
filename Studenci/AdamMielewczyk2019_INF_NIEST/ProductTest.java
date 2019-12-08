import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void constructorIllegalArgument()
    {
        assertThrows(IllegalArgumentException.class, ()->
        {
            new Product("978020347967", "Rx 590", 400.453);
        },"niepoprawna liczba groszy");
    }

    @Test
    void constructorNegativePrice()
    {
        assertThrows(IllegalArgumentException.class, ()->
        {
            new Product("978020347967", "Rx 590", -4);
        },"ujemna cena");
    }
}