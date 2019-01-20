public class Worker implements Person {
    private String name;
    private String surname;
    private int yearBorn;

    public Worker(String name, String surname, int yearBorn) {
        this.name = name;
        this.surname = surname;
        this.yearBorn = yearBorn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    @Override
    public String getInfo() {
        return "Pracownik: " + this.getName() + " " + this.getSurname() + "\n" + "urodzony: " + this.getYearBorn() + "\n";
    }

    @Override
    public double getSalary() {
        return 0;
    }
}
