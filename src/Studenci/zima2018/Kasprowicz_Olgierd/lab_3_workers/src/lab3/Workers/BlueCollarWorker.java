package lab3.Workers;

import java.util.List;
import java.util.StringJoiner;

public class BlueCollarWorker extends Worker implements ManagedWorker
{
    private final double hourlyWage;
    private final int workedHours;
    private final int overtimeHours;

    private final List<String> abilities;

    private final Manager manager;

    @Override
    protected void toStringDetails(StringJoiner stringJoiner)
    {
        stringJoiner
            .add("hourlyWage=" + getHourlyWage())
            .add("workedHours=" + getWorkedHours())
            .add("overtimeHours=" + getOvertimeHours())
            .add("abilities=" + getAbilities())
            .add("manager=" + getManager())
        ;
    }

    @Override
    public double getMonthlyPayment()
    {
        return hourlyWage * workedHours + 1.5 * hourlyWage * overtimeHours;
    }

    public BlueCollarWorker(String name, String surname, int yearOfBirth, double hourlyWage, int workedHours, int overtimeHours, List<String> abilities, Manager manager)
    {
        super(name, surname, yearOfBirth);
        this.hourlyWage = hourlyWage;
        this.workedHours = workedHours;
        this.overtimeHours = overtimeHours;
        this.abilities = abilities;
        this.manager = manager;
    }

    public int getOvertimeHours()
    {
        return overtimeHours;
    }

    public double getHourlyWage()
    {
        return hourlyWage;
    }

    public int getWorkedHours()
    {
        return workedHours;
    }

    @Override
    public Manager getManager()
    {
        return manager;
    }

    public List<String> getAbilities()
    {
        return abilities;
    }

}
