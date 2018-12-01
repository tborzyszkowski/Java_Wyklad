package PersonalSystem.Modele;

import java.util.ArrayList;

public class SkillList {
    ArrayList<Skills> skillList = new ArrayList<>();

    public SkillList addSkill(String skillName){
        skillList.add(new Skills(skillName));
        return this;
    }

    @Override
    public String toString() {
        return "Umiejętności: " + skillList;
    }
}
