package SystemKadrowy;

public class test {
    public static void main(String[] args) {
        fizyczny fizyczny1 = new fizyczny("Piotr", "Wielgus", 1974, 25, 178, 10, "Bruno", "Spawacz");
        fizyczny fizyczny2 = new fizyczny("Witold", "Borowicz", 1968, 31, 153, 0, "Bruno", "Spawacz, Kierowca");
        fizyczny fizyczny3 = new fizyczny("Paweł", "Rompel", 1985, 22, 199, 30, "Bruno", "Operator wózka widłowego");
        umyslowy umyslowy1 = new umyslowy("Agnieszka", "Chabała", 1973, 2799, 0.12,587123857, 233);
        kierownik kierownik1 = new kierownik("Bruno", "Skwara", 1955, 4500, 0.3,500, 586687576,  601333444, 101, "Serwis");
        kierownik kierownik2 = new kierownik("Zbigniew", "Moczydło", 1969, 6200, 0.3,1200, 586686577,  607324568, 210, "Sprzedaż");

        System.out.println(fizyczny1.opis() + "\tWynagrodzenie: " + fizyczny1.wynagrodzenie());
        System.out.println(fizyczny2.opis() + "\tWynagrodzenie: " + fizyczny2.wynagrodzenie());
        System.out.println(fizyczny3.opis() + "\tWynagrodzenie: " + fizyczny3.wynagrodzenie());
        System.out.println(umyslowy1.opis() + "\n\tWynagrodzenie: " + umyslowy1.wynagrodzenie());
        System.out.println(kierownik1.opis() + "\tWynagrodzenie: " + kierownik1.wynagrodzenie());
        System.out.println(kierownik2.opis() + "\tWynagrodzenie: " + kierownik2.wynagrodzenie());
    }
}
