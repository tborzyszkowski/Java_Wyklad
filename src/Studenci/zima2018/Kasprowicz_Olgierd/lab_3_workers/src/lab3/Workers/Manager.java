package lab3.Workers;

import java.util.StringJoiner;

public class Manager extends BonusedSalariedWorker implements OfficeWorker
{
    private final String telephoneNumber;
    private final int roomNumber;

    private final String cellphoneNumber;
    private final double managerSalaryBonus;
    private final String departmentName;

    @Override
    protected double getSpecificMonthlyPayment(double baseMonthlyPayment)
    {
        return baseMonthlyPayment + this.managerSalaryBonus;
    }

    @Override
    protected void toStringDetails(StringJoiner stringJoiner)
    {
        stringJoiner
            .add("telephoneNumber='" + telephoneNumber + "'")
            .add("roomNumber=" + roomNumber)
            .add("cellphoneNumber='" + cellphoneNumber + "'")
            .add("managerSalaryBonus=" + managerSalaryBonus)
            .add("departmentName='" + departmentName + "'")
        ;
    }

    public Manager(String name, String surname, int yearOfBirth, double monthlySalary, int bonusPercentage, String telephoneNumber, int roomNumber, String celphoneNumber, double managerSalaryBonus, String departmentName)
    {
        super(name, surname, yearOfBirth, monthlySalary, bonusPercentage);
        this.telephoneNumber = telephoneNumber;
        this.roomNumber = roomNumber;
        this.cellphoneNumber = celphoneNumber;
        this.managerSalaryBonus = managerSalaryBonus;
        this.departmentName = departmentName;
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

    public String getCellphoneNumber()
    {
        return cellphoneNumber;
    }

    public double getManagerSalaryBonus()
    {
        return managerSalaryBonus;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }
}
