package PersonalSystem.Modele;

public class MaindWorker extends Employee {
    private double bonusPercent;
    private String telNumber;
    private String roomNumber;

    public MaindWorker(String firstName, String lastName, int year, int month, int day, double salary, double bonusPercent,
                       String telNumber, String roomNumber){
        super(firstName,lastName, year, month, day, salary);
        this.bonusPercent = bonusPercent;
        this.telNumber = telNumber;
        this.roomNumber = roomNumber;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public double getBaseSalary()
    {
        return super.getSalary();
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public double getSalary(){
        double salary = super.getSalary() * (1 + bonusPercent/100) ;
        return salary;
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
    public String toString()
    {
        return "\nPracownik umysłowy:\n" +
                "Imię: " + getFirstName() + "\n" +
                "Nazwisko: " + getLastName() + "\n" +
                "Telefon: " + telNumber + "\n" +
                "Pokój: " + roomNumber + "\n" +
                "Wynagrodzenie " + getSalary() + "\n";
    }
}
