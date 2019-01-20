public class BlueCollarWorker extends Worker {
    private double wage;
    private int hoursWorked;
    private int overhoursWorked;
    private Worker boss;
    private String additionalInfo;

    public BlueCollarWorker(String name, String surname, int yearBorn) {
        super(name, surname, yearBorn);
    }


    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getOverhoursWorked() {
        return overhoursWorked;
    }

    public void setOverhoursWorked(int overhoursWorked) {
        this.overhoursWorked = overhoursWorked;
    }

    public Worker getBoss() {
        return boss;
    }

    public void setBoss(Worker boss) {
        this.boss = boss;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "Stawka godzinowa: " + this.getWage() + "\n" +
                "Przepracowane godziny: " + this.getHoursWorked() + "\n" +
                "Przepracowane nadgodziny: " + this.getOverhoursWorked() + "\n" +
                "Szef: " + this.boss.getName() + " " + this.boss.getSurname() + "\n" +
                "Informacje dodatkowe: " + this.getAdditionalInfo() + "\n";
    }

    @Override
    public double getSalary() {
        return (this.getHoursWorked() + 1.5 * this.getOverhoursWorked()) * this.getWage();
    }
}
