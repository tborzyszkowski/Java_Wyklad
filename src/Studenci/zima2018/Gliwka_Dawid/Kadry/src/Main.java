import sun.font.TrueTypeFont;

public class Main {

    public static void main(String[] args) {
        Boss kierownik = new Boss("Jerzy", "Szefowy", 1966);
        kierownik.setDepartment("Produkcja");
        kierownik.setBonusPercentage(20);
        kierownik.setPhoneNumber("+48 405 404 004");
        kierownik.setSalaryMonthly(4200);
        kierownik.setRoomNumber("33a");
        kierownik.setSalaryBossBonus(200);

        System.out.println(kierownik.getInfo());
        System.out.println("Wynagrodzenie: " + kierownik.getSalary() + "\n");


        BlueCollarWorker pracownikFiz = new BlueCollarWorker("Jan", "Kowalski", 1967);
        pracownikFiz.setWage(15);
        pracownikFiz.setBoss(kierownik);
        pracownikFiz.setAdditionalInfo("Uprawnienia spawacza");
        pracownikFiz.setHoursWorked(168);
        pracownikFiz.setOverhoursWorked(20);

        System.out.println(pracownikFiz.getInfo());
        System.out.println("Wynagrodzenie: " + pracownikFiz.getSalary() + "\n");


        WhiteCollarWorker pracownikBiurowy = new WhiteCollarWorker("Olaf", "Kocicki", 1950);
        pracownikBiurowy.setBoss(kierownik);
        pracownikBiurowy.setBonusPercentage(10);
        pracownikBiurowy.setPhoneNumber("43 432 243 431");
        pracownikBiurowy.setRoomNumber("34");
        pracownikBiurowy.setSalaryMonthly(3000);

        System.out.println(pracownikBiurowy.getInfo());
        System.out.println("Wynagrodzenie: " + pracownikBiurowy.getSalary() + "\n");

        BoardMember czlRady = new BoardMember("Wojciech", "Kiciński", 1946);
        czlRady.setAssistant(pracownikBiurowy);
        czlRady.setMeetingsNumber(4);
        czlRady.setSalaryMonthly(10000);
        System.out.println(czlRady.getInfo());
        System.out.println("Wynagrodzenie: " + czlRady.getSalary() + "\n");

        Trainee stazysta = new Trainee("Anna", "Stecka", 1970);
        stazysta.setHasScholarship(true);
        stazysta.setOverseer(czlRady);

        System.out.println(stazysta.getInfo());
        System.out.println("Wynagrodzenie: " + stazysta.getSalary() + "\n");


    }
}
