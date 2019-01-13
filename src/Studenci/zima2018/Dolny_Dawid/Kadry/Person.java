public class Person {
    private String imie;
    private String nazwisko;
    private String rokUrodzenia;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getRokUrodzenia() {
        return rokUrodzenia;
    }

    public Person(){}

    public Person(String imie, String nazwisko, String rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }
}
