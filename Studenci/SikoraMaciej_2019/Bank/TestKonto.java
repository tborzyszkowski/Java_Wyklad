import org.junit.*;

public class TestKonto {

    @Test
    public void BankImie(){
        Konto bank = new Konto();
        Assert.assertEquals("Banku", bank.imie);
    }
    @Test
    public void BankNazwisko(){
        Konto bank = new Konto();
        Assert.assertEquals("Mbank", bank.nazwisko);
    }
    @Test
    public void BankNumer(){
        Konto bank = new Konto();
        Assert.assertEquals("Numer bankomatu", bank.nr);
    }
    @Test
    public void Imie(){
        Konto Jan = new Konto("Jan", "Kowalski", "1234567890", 250.00);
        Assert.assertEquals("Jan", Jan.imie);
    }
    @Test
    public void Nazwisko(){
        Konto Jan = new Konto("Jan", "Kowalski", "1234567890", 250.00);
        Assert.assertEquals("Kowalski", Jan.nazwisko);
    }
    @Test
    public void Numer(){
        Konto Jan = new Konto("Jan", "Kowalski", "1234567890", 250.00);
        Assert.assertEquals("1234567890", Jan.nr);
    }

    @Test
    public void StanKonta(){
        Konto Jan = new Konto("Jan", "Kowalski", "1234567890", 250.00);
        Assert.assertEquals(250.00, Jan.stan, 0.0001);
    }


}
