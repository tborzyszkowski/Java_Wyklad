public class main {
    public static void main(String[] args){
        Employee register = new Employee();
        OfficeEmployee kowalski = new OfficeEmployee("Jan", "Kowalski", 25, 3, "Warszawa", "Kasztanowa", 4, 1, 70);
        TradesmanEmployee nowak = new TradesmanEmployee("Jan", "Nowak", 35, 4, "Gdańsk", "Straussa", 56, 3,2.5, 1);
        PhisicalEmployee figiel = new PhisicalEmployee("Daniel", "Figiel", 41, 2, "Wrocław",  "Leśna", 4, 1, 70);
        PhisicalEmployee juta = new PhisicalEmployee("Roman", "Juta", 39, 2, "Sosnowiec", "Leśna", 4, 1, 70);
        System.out.println(register.toString());
//        nowak.remEmployeeList(nowak.getId());
//        System.out.println(register.toString());
        TradesmanEmployee szczaw = new TradesmanEmployee("Mateusz", "Szczaw", 35, 4, "Gdańsk", "Straussa", 56, 3,2.5, 1);
//        System.out.println(register.toString());
//        nowak.addEmployeeListById(nowak, nowak.getId());
//        System.out.println(register.toString());
        System.out.println(register.toString(register.sortedArray()));
//        System.out.println(register.toString());
        System.out.println(register.toString(register.findCity("Gdańsk")));
        System.out.println(register.showEmplyeesValue());
    }
}
