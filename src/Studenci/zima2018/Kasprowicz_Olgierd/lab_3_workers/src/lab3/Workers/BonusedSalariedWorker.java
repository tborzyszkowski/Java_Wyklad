package lab3.Workers;

abstract public class BonusedSalariedWorker extends SalariedWorker
{
    private final int bonusPercentage;

    public BonusedSalariedWorker(String name, String surname, int yearOfBirth, double monthlySalary, int bonusPercentage)
    {
        super(name, surname, yearOfBirth, monthlySalary);
        this.bonusPercentage = bonusPercentage;
    }

    public int getBonusPercentage()
    {
        return this.bonusPercentage;
    }

    protected double getBaseMonthlyPayment()
    {
        return super.getBaseMonthlyPayment() * (1 + (getBonusPercentage() / 100.0));
    }
}
