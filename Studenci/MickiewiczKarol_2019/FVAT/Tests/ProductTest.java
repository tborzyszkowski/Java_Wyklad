package Tests;

import Zamówienie.Product;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void countNettoPosition_properValue_properValue() {
        Product product = new Product("example", 2, 50);

        double result = product.countNettoPosition(product.getCount(), product.getNetto());

        assertEquals(100.0, result, 0.01);
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @Test
    public void countNettoPosition_wrongValue_exception() {
        Product product = new Product("example", 0, 50);

        expectedEx.expect(IllegalArgumentException.class);

        product.countNettoPosition(product.getCount(), product.getNetto());
    }

    @Test
    public void countBruttoPosition_properValue_properValue() {
        Product product = new Product("example", 2, 50);

        product.countNettoPosition(product.getCount(), product.getNetto());
        double result = product.countBruttoPosition(product.getNettoPosition(), product.getVat());

        assertEquals(123.0, result, 0.01);
    }

    @Test
    public void countBruttoPosition_wrongValue_exception() {
        Product product = new Product("example", 2, 0);

        expectedEx.expect(IllegalArgumentException.class);

        product.countBruttoPosition(product.getNettoPosition(), product.getVat());

    }

}