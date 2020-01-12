import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GeneralTest {

    @Test
    void string(){
        List<Soldier> general1Soldiers=new ArrayList<>();
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,1));
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,2));
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.PRIVATE,4));
        General general1=new General("Jacek", 500, general1Soldiers);
        assertEquals("Name: Jacek\n" +
                        "Gold: 500\n" +
                        "Power: 13\n" +
                        "Soldiers:\n" +
                        "\n" +
                        "Soldier number 0 - Degree: CAPTAIN  Experience: 1\n" +
                        "Soldier number 1 - Degree: CAPTAIN  Experience: 2\n" +
                        "Soldier number 2 - Degree: PRIVATE  Experience: 4\n",
                general1.toString(),"toString");
    }

    @Test
    void buySoldier() {
        List<Soldier> general1Soldiers=new ArrayList<>();
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,1));
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,2));
        General general1=new General("Jacek", 500, general1Soldiers);

        general1.buySoldier(Soldier.MilitaryDegree.CAPTAIN);
        assertTrue(general1.getSoldiers().get(2).getDegree()==Soldier.MilitaryDegree.CAPTAIN && general1.getGold()==470, "zakup żołnierza");
    }

    @Test
    void training() {
        List<Soldier> general1Soldiers=new ArrayList<>();
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,1));
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,2));
        General general1=new General("Jacek", 500, general1Soldiers);

        general1.training(general1Soldiers);
        assertTrue(general1.getSoldiers().get(0).getExperience()==2 && general1.getGold()==494, "szkolenie swoich żołnierzy");
    }

    @Test
    void goToWar_EqualStrength() {
        List<Soldier> general1Soldiers=new ArrayList<>();
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,1));
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,2));
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.PRIVATE,4));
        General general1=new General("Jacek", 500, general1Soldiers);

        List<Soldier> general2Soldiers=new ArrayList<>();
        general2Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,1));
        general2Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,2));
        general2Soldiers.add(new Soldier(Soldier.MilitaryDegree.PRIVATE,4));
        General general2=new General("Jan", 500, general2Soldiers);

        general1.goToWar(general2);
        assertTrue(general1.getLivingSoldiers().size()==2 && general2.getLivingSoldiers().size()==2, "ilość żywych żołnierzy po remisie na wojnie");
    }

    @Test
    void goToWar_OneStronger() {
        List<Soldier> general1Soldiers=new ArrayList<>();
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,1));
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,2));
        General general1=new General("Jacek", 500, general1Soldiers);

        List<Soldier> general2Soldiers=new ArrayList<>();
        general2Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,1));
        general2Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,2));
        general2Soldiers.add(new Soldier(Soldier.MilitaryDegree.PRIVATE,4));
        General general2=new General("Jan", 500, general2Soldiers);

        general1.goToWar(general2);
        assertTrue(general1.getLivingSoldiers().size()==1
                && general2.getGold()==550
                && general1.getGold()==450
                && general2.getSoldiers().get(1).getExperience()==3
                && general1.getSoldiers().get(1).getExperience()==1,"skutek wojny z silnieszym generałem");
    }

    @Test
    void testClone() {
        List<Soldier> general1Soldiers=new ArrayList<>();
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,1));
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,2));
        General general1=new General("Jacek", 500, general1Soldiers);

        General general2=(General) general1.clone();
        general1.training(general1Soldiers);
        assertTrue(general1.getSoldiers().get(0).getExperience()==2 && general2.getSoldiers().get(0).getExperience()==1, "głęboka kopia");
    }
}