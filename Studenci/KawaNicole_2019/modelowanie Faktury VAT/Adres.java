@SuppressWarnings("Dostep")
public class Adres {
    private String ulica;
    private String miasto;
    private String region;
    private String kodPocztowy;
    private String kraj;

    public Adres(String ulica, String miasto, String region, String kodPocztowy, String kraj) {
        this.ulica = ulica;
        this.miasto = miasto;
        this.region = region;
        this.kodPocztowy = kodPocztowy;
        this.kraj = kraj;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", miasto='" + miasto + '\'' +
                ", region='" + region + '\'' +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                ", kraj='" + kraj + '\'' +
                '}';
    }
}
