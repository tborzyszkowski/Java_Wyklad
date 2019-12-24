import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {
    @Test
    void train_ExperienceChange() {
        Soldier testSoldier1 = new Soldier(Soldier.MilitaryDegree.CAPTAIN,12);
        testSoldier1.train();
        assertEquals(13, testSoldier1.getExperience(),"reset doświadczenia po awansie");
    }

    @Test
    void train_DegreeChange() {
        Soldier testSoldier1 = new Soldier(Soldier.MilitaryDegree.CAPTAIN,14);
        testSoldier1.train();
        assertEquals(Soldier.MilitaryDegree.MAJOR, testSoldier1.getDegree(),"zamiana stopnia po awansie");
    }

    @Test
    void train_ExperienceReset() {
        Soldier testSoldier1 = new Soldier(Soldier.MilitaryDegree.CAPTAIN,14);
        testSoldier1.train();
        assertEquals(1, testSoldier1.getExperience(),"reset doświadczenia po awansie");
    }

    @Test
    void testClone() {
        Soldier testSoldier1 = new Soldier(Soldier.MilitaryDegree.CAPTAIN,14);
        Soldier testSoldier2 = (Soldier)testSoldier1.clone();
        testSoldier2.train();
        assertEquals(14, testSoldier1.getExperience(),"głęboka kopia");
    }
}