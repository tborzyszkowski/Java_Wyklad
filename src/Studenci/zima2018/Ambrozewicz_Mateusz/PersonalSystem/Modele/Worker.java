package PersonalSystem.Modele;

public class Worker extends Employee{
    private double payment;
    private double hourSum;
    private double overtimeSum;

    public Worker(String firstName, String lastName, int year, int month, int day, Double payment, double hourSum, Double overtimeSum) {
        super(firstName, lastName, year, month, day);
        this.payment = payment;
        this.hourSum = hourSum;
        this.overtimeSum = overtimeSum;
    }

    public double getSalary(){
        double salary = payment * (hourSum + overtimeSum * 1.5) ;
        return salary;
    }


    public void setNewPayment(double newPayment){
        this.payment = newPayment;
    }

    public SkillList addToSkillList(String skillName){
        return super.getSkillList().addSkill(skillName);
    }

}
