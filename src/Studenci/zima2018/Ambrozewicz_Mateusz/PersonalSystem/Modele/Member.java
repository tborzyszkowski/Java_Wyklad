package PersonalSystem.Modele;

public class Member extends Employee {
    private String assistant;
    private int howManyTimes;

    public Member(String firstName, String lastName, int year, int month, int day, double salary, String assistant, int howManyTimes){
        super(firstName, lastName, year, month, day, salary);
        this.assistant = assistant;
        this.howManyTimes = howManyTimes;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + (howManyTimes * 500);
    }
}
