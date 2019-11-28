import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.HashMap;
import java.util.Map;


public class Dealer extends Worker {
    private String effectiveness;
    private int commision;
    private static Map<String, Integer> effect = new HashMap<String, Integer>(){
        {
            put("NISKA", 30);
            put("SREDNIA", 90);
            put("WYSOKA", 120);
        }
    };

    public String getEffectiveness(){
        return effectiveness;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", address=" + address +
                ", officeId=" + officeId +
                ", value=" + value +
                "effectiveness='" + effectiveness + '\'' +
                ", commision=" + commision +
                '}';
    }

    public void setEffectiveness(String effectiveness) {
        if (!(effectiveness.equals("NISKA") || effectiveness.equals("SREDNIA") ||effectiveness.equals("WYSOKA"))) throw new ValueException("Invalid strength");
        this.effectiveness = effectiveness;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        this.commision = commision;
    }

    public Dealer(int id, String name, String surname, int age,
                  int experience, Address address, int officeId, String effectiveness, int commision) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experience = experience;
        this.address = address;
        this.officeId = officeId;
        this.commision = commision;
        if (!(effectiveness.equals("NISKA") || effectiveness.equals("SREDNIA") ||effectiveness.equals("WYSOKA"))) throw new ValueException("Invalid strength");
        this.effectiveness = effectiveness;
        this.value = effect.get(this.effectiveness) * this.experience;
    }
}
