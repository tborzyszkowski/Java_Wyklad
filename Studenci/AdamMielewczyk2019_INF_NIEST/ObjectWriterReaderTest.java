import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ObjectWriterReaderTest {

    @Test
    void write() {
        List<Soldier> general1Soldiers=new ArrayList<>();
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,1));
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,2));
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.PRIVATE,4));
        General general1=new General("Jacek", 500, general1Soldiers);
        assertTrue(ObjectWriterReader.Write(general1,"One"), "Zapis do pliku");
    }

    @Test
    void writeAndRead() {
        List<Soldier> general1Soldiers=new ArrayList<>();
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,1));
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.CAPTAIN,2));
        general1Soldiers.add(new Soldier(Soldier.MilitaryDegree.PRIVATE,4));
        General general1=new General("Jacek", 500, general1Soldiers);
        ObjectWriterReader.Write(general1,"one");
        assertTrue(((General)ObjectWriterReader.Read("one")).equals(general1), "Zapis i odczyt pliku");
    }
}