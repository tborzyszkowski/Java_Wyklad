public class Boss extends OfficeWorker {
    private String department;
    private double salaryBossBonus;

    public double getSalaryBossBonus() {
        return salaryBossBonus;
    }

    public void setSalaryBossBonus(double salaryBossBonus) {
        this.salaryBossBonus = salaryBossBonus;
    }

    public Boss(String name, String surname, int yearBorn) {
        super(name, surname, yearBorn);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getInfo() {
        return super.getInfo() +
                "Dział: " + this.getDepartment() + "\n" +
                "Premia kierownicza: " + this.getSalaryBossBonus() + "\n";
    }

    public double getSalary() {
        return super.getSalary() + this.getSalaryBossBonus();
    }

}
