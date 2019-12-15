import java.util.Date;

public class Labourer extends Employee {
    private int strength;

    public Labourer(String name, String surname, Date birthDate, Date hireDate, Address address, int strength) throws IllegalArgumentException {
        super(name, surname, birthDate, hireDate, address);
        if(strength<1 || strength>100)
            throw new IllegalArgumentException("Nie poprawna wartosc sily");
        this.strength = strength;
    }

    @Override
    public String toString() {
        return super.toString()+"  STRENGTH: "+strength+"\n\n";
    }

    @Override
    int getValue() { return getExperience() * strength / getAge();}

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
