package lab3.Workers;

abstract public class SalariedWorker extends Worker
{
    private final double monthlySalary;

    public SalariedWorker(String name, String surname, int yearOfBirth, double monthlySalary)
    {
        super(name, surname, yearOfBirth);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    abstract protected double getSpecificMonthlyPayment(double baseMonthlyPayment);

    protected double getBaseMonthlyPayment()
    {
        return this.monthlySalary;
    }

    @Override
    public double getMonthlyPayment()
    {
        return getSpecificMonthlyPayment(getBaseMonthlyPayment());
    }
}
