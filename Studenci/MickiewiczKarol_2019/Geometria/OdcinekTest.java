import org.junit.Test;

import static org.junit.Assert.*;

public class OdcinekTest {

    @Test
    public void distance_properValue_properValue() {
        Punkt punktOdcinka1 = new Punkt(1, 3);
        Punkt punktOdcinka2 = new Punkt(-1, 5);
        Odcinek odcinek = new Odcinek(punktOdcinka1, punktOdcinka2);

        Punkt punktProstopadly = new Punkt(0, 5);
        double result = odcinek.distance(punktProstopadly);

        assertEquals(result, 0.707, 0.001);
    }

    @Test
    public void shiftJednegoKońcaOdcinkaOWektor() {
        Punkt punktOdcinka1 = new Punkt(1, 3);
        Punkt punktOdcinka2 = new Punkt(-1, 5);

        Odcinek odcinek = new Odcinek(punktOdcinka1, punktOdcinka2);

        odcinek.shift(1, 1);

        assertEquals(odcinek.getPunkt1().getX(), 2, 0.01);
        assertEquals(odcinek.getPunkt1().getY(), 4, 0.01);
    }

    @Test
    public void shiftJednegoKońcaOdcinkaOWektorX() {
        Punkt punktOdcinka1 = new Punkt(1, 3);
        Punkt punktOdcinka2 = new Punkt(-1, 5);

        Odcinek odcinek = new Odcinek(punktOdcinka1, punktOdcinka2);

        odcinek.shift(1, 1);

        assertEquals(odcinek.getPunkt1().getX(), 2, 0.01);
    }

    @Test
    public void shiftJednegoKońcaOdcinkaOWektorY() {
        Punkt punktOdcinka1 = new Punkt(1, 3);
        Punkt punktOdcinka2 = new Punkt(-1, 5);

        Odcinek odcinek = new Odcinek(punktOdcinka1, punktOdcinka2);

        odcinek.shift(1, 1);

        assertEquals(odcinek.getPunkt1().getY(), 4, 0.01);
    }

    @Test
    public void shiftDrugiegoKońcaOdcinkaOWektorX() {
        Punkt punktOdcinka1 = new Punkt(1, 3);
        Punkt punktOdcinka2 = new Punkt(-1, 5);

        Odcinek odcinek = new Odcinek(punktOdcinka1, punktOdcinka2);

        odcinek.shift(1, 1);

        assertEquals(odcinek.getPunkt2().getX(), 0, 0.01);
    }

    @Test
    public void shiftDrugiegoKońcaOdcinkaOWektorY() {
        Punkt punktOdcinka1 = new Punkt(1, 3);
        Punkt punktOdcinka2 = new Punkt(-1, 5);

        Odcinek odcinek = new Odcinek(punktOdcinka1, punktOdcinka2);

        odcinek.shift(1, 1);

        assertEquals(odcinek.getPunkt2().getY(), 6, 0.01);
    }

}