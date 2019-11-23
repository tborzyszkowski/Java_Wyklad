import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


public class FakturaTest {

        private Faktura faktura;
        private Zamowienie zamowienie;
        private Kontrahent sprzedajacy;
        private Kontrahent kupujacy;

        @Test
        public void testGenerujNumerFaktury() {
            Faktura faktura = new Faktura(zamowienie, sprzedajacy, kupujacy);
            Assert.assertEquals("F/2019/11/1", faktura.generujNumerFaktury());
        }

        @Test
        public void testGetDataZaplaty() {
            Faktura faktura = new Faktura(zamowienie, sprzedajacy, kupujacy);
            Assert.assertEquals(LocalDate.now().plusDays(30), faktura.getDataZaplaty());
        }

}