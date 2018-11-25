package lab3.Workers;

import java.util.StringJoiner;

public class WhiteCollarWorker extends BonusedSalariedWorker implements OfficeWorker, ManagedWorker
{
    private final String telephoneNumber;
    private final int roomNumber;
    private final Manager manager;

    @Override
    protected void toStringDetails(StringJoiner stringJoiner)
    {
        stringJoiner
            .add("telephoneNumber='" + telephoneNumber + "'")
            .add("roomNumber=" + roomNumber)
            .add("manager=" + manager)
        ;
    }

    @Override
    protected double getSpecificMonthlyPayment(double baseMonthlyPayment)
    {
        return baseMonthlyPayment;
    }

    public WhiteCollarWorker(String name, String surname, int yearOfBirth, double monthlySalary, int bonusPercentage, String telephoneNumber, int roomNumber, Manager manager)
    {
        super(name, surname, yearOfBirth, monthlySalary, bonusPercentage);
        this.telephoneNumber = telephoneNumber;
        this.roomNumber = roomNumber;
        this.manager = manager;
    }

    @Override
    public String getTelephoneNumber()
    {
        return telephoneNumber;
    }

    @Override
    public int getRoomNumber()
    {
        return roomNumber;
    }

    @Override
    public Manager getManager()
    {
        return manager;
    }
}
