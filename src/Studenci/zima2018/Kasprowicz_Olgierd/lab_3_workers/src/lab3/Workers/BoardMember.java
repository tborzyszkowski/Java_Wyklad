package lab3.Workers;

import java.util.StringJoiner;

public class BoardMember extends SalariedWorker
{
    private final static double perBoardMeetingPayment = 200;

    private final int boardMeetingsCount;
    private final WhiteCollarWorker assistant;

    @Override
    protected double getSpecificMonthlyPayment(double baseMonthlyPayment)
    {
        return baseMonthlyPayment + boardMeetingsCount * perBoardMeetingPayment;
    }

    @Override
    protected void toStringDetails(StringJoiner stringJoiner)
    {
        stringJoiner
            .add("boardMeetingsCount=" + getBoardMeetingsCount())
            .add("assistant=" + getAssistant())
        ;
    }

    public BoardMember(String name, String surname, int yearOfBirth, double monthlySalary, int boardMeetingsCount, WhiteCollarWorker assistant)
    {
        super(name, surname, yearOfBirth, monthlySalary);
        this.boardMeetingsCount = boardMeetingsCount;
        this.assistant = assistant;
    }

    public int getBoardMeetingsCount()
    {
        return boardMeetingsCount;
    }

    public WhiteCollarWorker getAssistant()
    {
        return assistant;
    }
}
