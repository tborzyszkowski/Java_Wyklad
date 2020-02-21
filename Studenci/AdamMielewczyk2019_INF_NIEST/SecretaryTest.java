import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SecretaryTest {

    @Test
    void getChanges() {
        List<Soldier> general1Soldiers=new ArrayList<>();
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,1));
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,2));
        General general1=new General("Jacek", 500, general1Soldiers);

        List<Soldier> general2Soldiers=new ArrayList<>();
        general2Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,1));
        general2Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,2));
        general2Soldiers.add(new Soldier(Soldier.MilitaryDegree.PRIVATE,4));
        General general2=new General("Jan", 500, general2Soldiers);

        List<General> generals=new ArrayList<>();
        generals.add(general1);
        generals.add(general2);
        Secretary secretary=new Secretary(generals);
        general1.buySoldier(Soldier.MilitaryDegree.CAPTAIN);
        general1.training(general1Soldiers);
        general1.goToWar(general2);
        assertEquals("------------------------------------------------------\n" +
                "ZMIANY U GENERALA:   Jacek\n" +
                "BEFORE:  Gold: 500\n" +
                "AFTER:  Gold: 511\n" +
                "BEFORE:  Power: 9\n" +
                "AFTER:  Power: 30\n" +
                "BEFORE:  Soldier number 0 - Degree: CAPTAIN  Experience: 1\n" +
                "AFTER:  Soldier number 0 - Degree: CAPTAIN  Experience: 3\n" +
                "BEFORE:  Soldier number 1 - Degree: CAPTAIN  Experience: 2\n" +
                "AFTER:  Soldier number 1 - Degree: CAPTAIN  Experience: 4\n" +
                "AFTER:  Soldier number 2 - Degree: CAPTAIN  Experience: 3\n" +
                "\n" +
                "\n" +
                "PODJĘTE DZIALANIA OD POCZĄTKU:\n" +
                "\n" +
                "Zakup żołnierza CAPTAIN\n" +
                "Szkolenie żołnierzy 3\n" +
                "Wojna z generałem Jan\n" +
                "------------------------------------------------------\n" +
                "\n" +
                "------------------------------------------------------\n" +
                "ZMIANY U GENERALA:   Jan\n" +
                "BEFORE:  Gold: 500\n" +
                "AFTER:  Gold: 450\n" +
                "BEFORE:  Power: 13\n" +
                "AFTER:  Power: 6\n" +
                "BEFORE:  Soldier number 0 - Degree: CAPTAIN  Experience: 1\n" +
                "AFTER:  Soldier number 0 - DEAD\n" +
                "BEFORE:  Soldier number 1 - Degree: CAPTAIN  Experience: 2\n" +
                "AFTER:  Soldier number 1 - Degree: CAPTAIN  Experience: 1\n" +
                "BEFORE:  Soldier number 2 - Degree: PRIVATE  Experience: 4\n" +
                "AFTER:  Soldier number 2 - Degree: PRIVATE  Experience: 3\n" +
                "\n" +
                "\n" +
                "PODJĘTE DZIALANIA OD POCZĄTKU:\n" +
                "\n" +
                "Wojna z generałem Jan\n" +
                "------------------------------------------------------\n" +
                "\n",secretary.getChanges(),"Drukowanie zmian i podjętych działań");
    }
}