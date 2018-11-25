package lab3.Workers;

import java.util.StringJoiner;

abstract public class Worker
{
    private final String name;
    private final String surname;
    private final int yearOfBirth;

    public Worker(String name, String surname, int yearOfBirth)
    {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString()
    {
        StringJoiner sj = new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]");

        sj
            .add("name='" + name + "'")
            .add("surname='" + surname + "'")
            .add("yearOfBirth=" + yearOfBirth);

        this.toStringDetails(sj);

        return sj.toString();
    }

    abstract protected void toStringDetails(StringJoiner stringJoiner);

    abstract public double getMonthlyPayment();

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getYearOfBirth()
    {
        return yearOfBirth;
    }
}
