package HR;

public class MemberOfTheBoard extends Employee{
    private double monthP;
    private Intern assistant;
    private int numMeetings;
    public double totalMonthSalary;

    public MemberOfTheBoard(){}

    public MemberOfTheBoard(double monthP, Intern assistant, int numMeetings) {
        this.monthP = monthP;
        this.assistant = assistant;
        this.numMeetings = numMeetings;
    }

    String MOTBData(){
        return getPersonalData() + "\n" +
                "Monthh Payment=" + monthP + "\n" +
                "Assistant=" + assistant.getSurname() + assistant.getName() + "\n" +
                "Number of Board Meetings=" + numMeetings;
    }
    public Double getTotalSalaryMOTB(){
        totalMonthSalary = monthP + numMeetings * 150;
        return totalMonthSalary;
    }

    public void setMOTBData(double monthP, Intern assistant, int numMeetings) {
        this.monthP = monthP;
        this.assistant = assistant;
        this.numMeetings = numMeetings;
    }

    public String promoteToMemberofTheBoard(double montPay, Intern assistant, int meetings){
        setPosition("Member of the Board");
        setMOTBData(montPay, assistant, meetings);
        getTotalSalaryMOTB();
        return MOTBData();
    }
}
