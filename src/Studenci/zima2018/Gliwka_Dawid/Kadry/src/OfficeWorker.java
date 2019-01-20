public abstract class OfficeWorker extends Worker{
    private double salaryMonthly;
    private double bonusPercentage;
    private String phoneNumber;
    private String roomNumber;

    public OfficeWorker(String name, String surname, int yearBorn) {
        super(name, surname, yearBorn);
    }

    public double getSalaryMonthly() {
        return salaryMonthly;
    }

    public void setSalaryMonthly(double salaryMonthly) {
        this.salaryMonthly = salaryMonthly;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getSalary() {
        return (this.getSalaryMonthly() + this.getBonusPercentage()/100 * this.getSalaryMonthly());
    }

    public String getInfo() {
        return super.getInfo() +
                "Pensja miesięczna: " + this.getSalaryMonthly() + "\n" +
                "Procent premii: " + this.getBonusPercentage() + "%\n" +
                "Telefon: " + this.getPhoneNumber() + "\n" +
                "Numer pokoju: " + this.getRoomNumber() + "\n";
    }
}
