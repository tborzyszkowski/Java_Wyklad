package lab3.Workers;

import java.util.StringJoiner;

public class Intern extends Worker
{
    private final static double scholarshipAmount = 1200.3;
    private final Worker guardian;
    private final boolean isReceiveScholarship;

    @Override
    protected void toStringDetails(StringJoiner stringJoiner)
    {
        stringJoiner
            .add("guardian=" + this.getGuardian())
            .add("isReceiveScholarship=" + this.isReceiveScholarship())
        ;
    }

    @Override
    public double getMonthlyPayment()
    {
        return isReceiveScholarship ? scholarshipAmount : 0;
    }

    public Intern(String name, String surname, int yearOfBirth, Worker guardian, boolean isReceiveScholarship) throws IllegalArgumentException
    {
        super(name, surname, yearOfBirth);
        this.isReceiveScholarship = isReceiveScholarship;

        if (guardian instanceof Intern)
        {
            throw new IllegalArgumentException();
        }

        this.guardian = guardian;
    }

    public Worker getGuardian()
    {
        return guardian;
    }

    public boolean isReceiveScholarship()
    {
        return isReceiveScholarship;
    }
}
