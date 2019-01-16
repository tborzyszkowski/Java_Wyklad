package PersonalSystem.Modele;

public final class Manager extends MaindWorker {
    private double financialAllowance;
    private String cellProneNumber;
    private String departmentName;

    public Manager(String firstName, String lastName, int year, int month, int day, double salary, double bonusPercent,
                   String telNumber, String roomNumber, double financialAllowance, String cellProneNumber, String departmentName)
    {
        super(firstName, lastName, year, month, day, salary, bonusPercent, telNumber, roomNumber);
        this.financialAllowance = financialAllowance;
        this.cellProneNumber = cellProneNumber;
        this.departmentName =departmentName;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public double getSalary() {
        double salary = super.getSalary() + financialAllowance;
        return salary;
    }

        @Override
    public String toString() {
        return "\nMenadźer\n" +
                "Imię: " + getFirstName() + "\n" +
                "Nazwisko: " + getLastName() + "\n" +
                "Podstawa: " + getBaseSalary() + "\n" +
                "Podstawa + premia: " + super.getSalary() + "\n" +
                "Dodatek: " + financialAllowance + "\n" +
                "Pensja: " + getSalary() + "\n" +
                "Numer telefonu biurowego: " + getTelNumber() + "\n" +
                "Numer telefonu komurkowego: " + cellProneNumber + "\n" +
                "Pokój: " + super.getRoomNumber() + "\n" +
                "Wydział: " + departmentName + "\n";
    }
}
