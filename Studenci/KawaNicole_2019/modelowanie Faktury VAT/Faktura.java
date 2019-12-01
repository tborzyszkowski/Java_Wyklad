@SuppressWarnings("Dostep")
public class Faktura {
    private Prodkt produkt;

    Faktura() {
    }

    Faktura(Produkt produkt) {
        this();
        this.produkt = produkt;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    @Override
    public String toString() {
        return "\n\t\t\tFaktura{" +
                "produkt=" + produkt +
                '}';
    }
}
