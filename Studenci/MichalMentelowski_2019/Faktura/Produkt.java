package faktura;

public class Produkt {
   private String nazwa;
   private int ilosc;
   private double cenaJednoNetto;
   private double cenaNettoPozycji;
   private double vat;
   private double brutto;

   public Produkt(String nazwa, int ilosc, double cenaJednoNetto, double vat) {
      this.nazwa = nazwa;
      this.ilosc = ilosc;
      this.cenaJednoNetto = cenaJednoNetto;
      this.cenaNettoPozycji = cenaJednoNetto* ilosc;
      this.vat = vat;
      this.brutto = cenaNettoPozycji*vat;
   }

   public String getNazwa() {
      return nazwa;
   }

   public void setNazwa(String nazwa) {
      this.nazwa = nazwa;
   }

   public int getIlosc() {
      return ilosc;
   }

   public void setIlosc(int ilosc) {
      this.ilosc = ilosc;
   }

   public double getCenaJednoNetto() {
      return cenaJednoNetto;
   }

   public void setCenaJednoNetto(double cenaJednoNetto) {
      this.cenaJednoNetto = cenaJednoNetto;
   }

   public double getCenaNettoPozycji() {
      return cenaNettoPozycji;
   }

   public void setCenaNettoPozycji(double cenaNettoPozycji) {
      this.cenaNettoPozycji = cenaNettoPozycji;
   }

   public double getVat() {
      return vat;
   }

   public void setVat(double vat) {
      this.vat = vat;
   }

   public double getBrutto() {
      return brutto;
   }

   public void setBrutto(double brutto) {
      this.brutto = brutto;
   }
}

