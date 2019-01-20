public class BoardMember extends Worker {
    private double salaryMonthly;
    private OfficeWorker assistant;
    private int meetingsNumber;

    public double getSalaryMonthly() {
        return salaryMonthly;
    }

    public void setSalaryMonthly(double salaryMonthly) {
        this.salaryMonthly = salaryMonthly;
    }

    public OfficeWorker getAssistant() {
        return assistant;
    }

    public void setAssistant(OfficeWorker assistant) {
        this.assistant = assistant;
    }

    public int getMeetingsNumber() {
        return meetingsNumber;
    }

    public void setMeetingsNumber(int meetingsNumber) {
        this.meetingsNumber = meetingsNumber;
    }

    public BoardMember(String name, String surname, int yearBorn) {
        super(name, surname, yearBorn);
    }

    public String getInfo() {
        return super.getInfo() +
                "Pensja miesięczna: " + this.getSalaryMonthly() + "\n" +
                "Asystent: " + this.assistant.getName() + " " + this.assistant.getSurname() + "%\n" +
                "Liczba spotkań rady nazdorczej: " + this.getMeetingsNumber() + "\n";
    }

    public double getSalary() {
        return this.getSalaryMonthly() + this.getMeetingsNumber() * 1000;
    }


}
