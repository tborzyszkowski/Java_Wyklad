import java.text.SimpleDateFormat;
import java.util.*;

@SuppressWarnings("Dostep")
public class FakturaVAT {
    private ArrayList<InvoiceItem> items = new ArrayList<>();
    private double kwotaBrutto;
    private Firma firma;
    private int numerFakturyVAT;
    private Date dataWystawienia;
    private Date dataSprzedazy;
    private Date dataPlatnosci;

    public FakturaVAT() {
    }

    public FakturaVAT(String dataWystawienia, String dataSprzedazy, String dataPlatnosci) throws Exception {
        this();
        this.numerFakturyVAT = hashCode();
        this.dataWystawienia = new SimpleDateFormat("yyyy-MM-dd").parse(dataWystawienia);
        this.dataSprzedazy = new SimpleDateFormat("yyyy-MM-dd").parse(dataSprzedazy);
        this.dataPlatnosci = new SimpleDateFormat("yyyy-MM-dd").parse(dataPlatnosci);
    }

    public FakturaVAT addProdukt(Produkt produkt) {
        items.add(new Faktura (produkt));
        this.kwotaBrutto = calkowiteBrutto();
        return this;
    }

    public FakturaVAT removeProdukt(Produkt produkt) {
        for (Faktura item : items) {
            if (item.getProdukt().ilosc (produkt)) {
                items.remove(item);
                this.kwotaBrutto = calkowiteBrutto();
                return this;
            }
        }

        return this;
    }

    public FakturaVAT addFirma(Firma firma) {
        this.firma = firma;
        return this;
    }

    private double calkowiteBrutto() {
        double brutto = 0;
        for (FakturaVAT item : items) brutto += item.getProdukt().kwotaBrutto();
        return Math.round(brutto * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return "\n\t\tFakturaVAT{" +
                "items=" + items +
                ", \n\t\t\t\tcalkowiteBrutto=" + calkowiteBruttos +
                ", \n\t\t\t\tfirma=" + firma +
                ", \n\t\t\t\tnumerFakturyVAT='" + numerFakturyVAT + '\'' +
                ", \n\t\t\t\tdataWystawienia=" + formatter.format(dataWystawienia) +
                ", \n\t\t\t\tdataSprzedazy=" + formatter.format(dataSprzedazy) +
                ", \n\t\t\t\t dataPlatnosci=" + formatter.format(dataPlatnosci) +
                '}';
    }
}
