package Bank;

import org.junit.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class HistoriaKontaElementyTest {
    @Test
    public void HistoriaKontaElemntyConstructorTest(){
        LocalDate dataTransakcji = LocalDate.now();
        String celTransakcji = "Otwarcie konta";
        double wartoscTransakcji = 1.0;

        HistoriaKontaElementy otwarcieKonta = new HistoriaKontaElementy(dataTransakcji, celTransakcji, wartoscTransakcji);

        Assert.assertEquals(dataTransakcji, otwarcieKonta.getDataTransakcji());
        Assert.assertEquals(celTransakcji, otwarcieKonta.getCelTransakcji());
        Assert.assertEquals(wartoscTransakcji, otwarcieKonta.getWartoscTransakcji(), 0.001);
    }

    @Test
    public void HistoriaKontaElemntyPustyConstructorTest() {
        LocalDate dataTransakcji = LocalDate.now();
        String celTransakcji = "Otwarcie konta";
        double wartoscTransakcji = 0.0;

        HistoriaKontaElementy otwarcieKonta = new HistoriaKontaElementy();

        Assert.assertEquals(dataTransakcji, otwarcieKonta.getDataTransakcji());

        Assert.assertEquals(wartoscTransakcji, otwarcieKonta.getWartoscTransakcji(), 0.001);
    }

    //Testy getterów
    @Test
    public void HistoriaKontaElementyCelTransakcjiGetterTest(){

        HistoriaKontaElementy otwarcieKonta = new HistoriaKontaElementy();

        Assert.assertEquals("Otwarcie konta", otwarcieKonta.getCelTransakcji());
    }

    @Test
    public void HistoriaKontaElementyWartoscTransakcjiGetterTest(){

        HistoriaKontaElementy otwarcieKonta = new HistoriaKontaElementy();

        Assert.assertEquals(0.0, otwarcieKonta.getWartoscTransakcji(), 0.001);
    }
    @Test
    public void HistoriaKontaElementyDataTransakcjiGetterTest(){

        HistoriaKontaElementy otwarcieKonta = new HistoriaKontaElementy();

        Assert.assertEquals(LocalDate.now(), otwarcieKonta.getDataTransakcji());

    }

    @Test
    public void  HistoriaKontaElementyWypiszTest(){
        LocalDate dataTransakcji = LocalDate.now();
        String celTransakcji = "Przesyłka";
        double wartoscTransakcji = 1.11;
        HistoriaKontaElementy otwarcieKonta = new HistoriaKontaElementy(dataTransakcji, celTransakcji, wartoscTransakcji);


        Assert.assertEquals("Data: " + dataTransakcji.toString() +", Cel: " + celTransakcji + ", Kwota: " + wartoscTransakcji
                , otwarcieKonta.wypisz());
    }
}
