import org.junit.Test;
import static org.junit.Assert.*;

public class KontoTest {

    @Test
    public void wplac_kwotaDodatnia_zwiększonyStanKonta() {
        Konto konto = new Konto("1", 20);

        int wynik = konto.wplac(10);

        assertEquals(30, wynik);
    }

    @Test
    public void wyplac_kwotaUjemna_zmniejszonyStanKonta() {
        Konto konto = new Konto("1", 20);

        int wynik = konto.wyplac(10);

        assertEquals(10, wynik);
    }

    @Test
    public void przelew_naJednymKoncieMalejeStanKonta_naDrugimRośnie() {
        Konto konto1 = new Konto("1", 20);

        Konto konto2 = new Konto("2", 0);

        Przelew przelew = new Przelew(konto1, konto2, 2);

        assertEquals(Integer.valueOf(18), Integer.valueOf(konto1.getHistoria().get(konto1.getHistoria().size()-1).get(4)));
        assertEquals(Integer.valueOf(2), Integer.valueOf(konto2.getHistoria().get(konto2.getHistoria().size()-1).get(4)));
    }

}
