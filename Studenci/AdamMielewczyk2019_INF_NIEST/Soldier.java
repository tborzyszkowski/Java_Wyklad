import java.io.Serializable;

public class Soldier implements Cloneable, Serializable {
    private MilitaryDegree degree;
    private int experience;

    public Soldier(MilitaryDegree degree) {
        this.setDegree(degree);
        this.experience = 1;
    }

    public Soldier(MilitaryDegree degree, int experience) {
        this.setDegree(degree);
        this.experience = experience;
    }

    public void kill(){
        experience=0;
    }

    public void demotion() {
        experience-=1;
    }

    public void train(){if(experience>0){experience+=1; checkAdvance();}}

    public void checkAdvance() {
        if(experience==degree.getValue()*5) {
            experience=1;
            switch (degree.getValue()){
                case 1:
                    degree=MilitaryDegree.CORPORAL;
                    break;
                case 2:
                    degree=MilitaryDegree.CAPTAIN;
                    break;
                case 3:
                    degree=MilitaryDegree.MAJOR;
                    break;
            }
        }
    }

    @Override
    public Object clone() {
        return new Soldier(degree, experience);
    }

    @Override
    public String toString() {
        return "Degree: "+degree+"  Experience: "+experience;
    }

    public int getStrength() {
        return degree.getValue()*experience;
    }

    public MilitaryDegree getDegree() {
        return degree;
    }

    public int getExperience() {
        return experience;
    }

    public void setDegree(MilitaryDegree degree) {
        this.degree = degree;
    }

    enum MilitaryDegree {
        PRIVATE(1),
        CORPORAL(2),
        CAPTAIN(3),
        MAJOR(4);

        private int value;
        public int getValue() {return  this.value;}
        MilitaryDegree(int value) {this.value = value;}
    }
}