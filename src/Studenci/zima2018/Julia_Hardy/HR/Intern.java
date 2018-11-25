package HR;

public class Intern extends Worker{
    public double scholarshipValue = 1000;
    private Employee buddy;
    private boolean scholarship;

    public Intern(Employee buddy, boolean scholarship){
        this.buddy = buddy;
        this.scholarship = scholarship;
    }

    String InternData(){
        return getPersonalData() + "\n" +
                "Buddy=" + buddy.getSurname() +  buddy.getName() + "\n" +
                "scholarship=" + getScholarship();
    }

    public double getScholarship(){
        if(this.scholarship){
            return scholarshipValue;
        }else {
            return 0;
        }
    }
}
