import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class OfficeEmployee extends Employee {
    static Set<Integer> boxNumbers = new HashSet<>();
    private int boxNumber;
    private int iq;

    public OfficeEmployee(String name, String surname, Date birthDate, Date hireDate, Address address, int iq) throws RuntimeException, IllegalArgumentException {
        super(name, surname, birthDate, hireDate, address);
        boxNumber=-1;
        setBoxNumber();
        setIq(iq);
    }

    @Override
    public String toString() {
        return super.toString()+"  BOX_NUMBER: "+boxNumber+"  IQ: "+iq+"\n\n";
    }

    public void unregister() {
        boxNumbers.remove(boxNumber);
        boxNumber=-1;
    }

    @Override
    int getValue() { return getExperience() * iq; }

    public int getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber() {
        unregister();
        for(int i=0; i<1000; i++) {
            if(!boxNumbers.contains(i)) {
                boxNumbers.add(i);
                boxNumber=i;
                break;
            }
        }
        if(boxNumber==-1)
            throw new RuntimeException("Skonczyly sie miejsca dla pracownikow biura");
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        if (iq < 70 || iq > 150)
            throw new IllegalArgumentException("Albo ekstremalny geniusz albo ...");
        this.iq = iq;
    }
}
