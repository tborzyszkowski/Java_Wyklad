public class main {
    public static void main(String[] args){
        Register reg = new Register();
        OfficeEmployee kowalski = new OfficeEmployee("Jan", "Kowalski", 25, 3, "Warszawa", "Kasztanowa", 4, 1, 70);
        TradesmanEmployee nowak = new TradesmanEmployee("Jan", "Nowak", 35, 4, "Gdańsk", "Straussa", 56, 3,2.5, 1);
        PhisicalEmployee figiel = new PhisicalEmployee("Daniel", "Figiel", 41, 2, "Wrocław",  "Leśna", 4, 1, 70);
        PhisicalEmployee juta = new PhisicalEmployee("Roman", "Juta", 39, 2, "Sosnowiec", "Leśna", 4, 1, 70);
        reg.addEmployee(kowalski, nowak, figiel, juta);
        System.out.println(reg.toString());
        reg.remEmployee(nowak.getId());
        System.out.println(reg.toString());
        TradesmanEmployee szczaw = new TradesmanEmployee("Mateusz", "Szczaw", 35, 4, "Gdańsk", "Straussa", 56, 3,2.5, 1);
        reg.addEmployee(szczaw);
        System.out.println(reg.toString());
        System.out.println(reg.sortedArray());
        System.out.println(reg.findCity("Gdańsk"));
        System.out.println(reg.getEmployeesValue());
    }
}
