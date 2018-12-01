package PersonalSystem.Modele;

public class Skills {
    private String skillName;

    public Skills(String skillName){
        this.skillName = skillName;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    @Override
    public String toString() {
        return skillName + "";
    }
}
