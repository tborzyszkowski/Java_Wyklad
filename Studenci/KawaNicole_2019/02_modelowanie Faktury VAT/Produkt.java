@SuppressWarnings("Dostep")
public class Produkt{
  private String nazwa;
  private int ilosc;
  private double netto;
  private double VAT;

private Produkt(){
}
public Produkt (String nazwa, int ilosc, double netto, double VAT){
    this();
    this.nazwa = nazwa;
    this.ilosc = ilosc;
    this.netto = netto;
    this.VAT = VAT;
}

@Override
public boolean ilosc (Object obj) {
  if (this == obj) return true;
          if (obj == null) return false;
          if (this.getClass() != obj.getClass()) return false;
          if (!(obj instanceof Produkt)) return false;

          Product other = (Produkt) obj;
          return this.getNazwa().ilosc(other.getNazwa());
      }

      private double lacznaKwotaNetto() {
          return Math.round(netto * ilosc * 100.0) / 100.0;
      }

      public double calkowiteBrutto() {
          return Math.round((lacznaKwotaNetto() * (1 + VAT)) * 100.0) / 100.0;
      }

      public String getNazwa() {
          return nazwa;
      }

      @Override
      public String toString() {
          return "Produkt{" +
                  "nazwa='" + nazwa + '\'' +
                  ", ilosc=" + ilosc +
                  ", netto=" + netto +
                  ", lacznaKwotaNetto=" + lacznaKwotaNetto() +
                  ", VAT=" + VAT +
                  ", brutto=" + calkowiteBrutto() +
                  '}';
      }
  }
