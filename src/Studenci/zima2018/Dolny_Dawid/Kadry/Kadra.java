public class Kadra {
    public static void main(String[] args) {
        Kierownik kierownik = new Kierownik("Kierownik","Mniejszy","1985",5400,"552309456","555-666-777","24","Metalurgiczny");
        PracownikUmyslowy umysl = new PracownikUmyslowy("Mózg","Myślący","1989",4200,"999-888-777","18", kierownik);
        Praktykant stazysta = new Praktykant("Ziomus","Niedoświadczony","1999",umysl, 600);
        CzlonekZarzadu zarzad = new CzlonekZarzadu("Szefu","Najwiekszy","1967",11900,23,stazysta);
        PracownikFizyczny fizyk = new PracownikFizyczny("Fizyk","Umięśniony","1992",15.45,160,22,kierownik,"Potrafi zrobić dobre spawy");

        System.out.println(stazysta);
        stazysta.wyplata();
        System.out.println(" ");
        System.out.println(kierownik);
        kierownik.wyplata();
        System.out.println(" ");
        System.out.println(zarzad);
        zarzad.wyplata();
        System.out.println(" ");
        System.out.println(umysl);
        umysl.wyplata();
        System.out.println(" ");
        System.out.println(fizyk);
        fizyk.wyplata();
    }
}
