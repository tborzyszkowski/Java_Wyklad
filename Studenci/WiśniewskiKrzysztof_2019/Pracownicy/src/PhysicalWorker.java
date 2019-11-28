import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class PhysicalWorker extends Worker {
    private double strength;

    @Override
    public String toString() {
        return "PhysicalWorker{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", address=" + address +
                ", officeId=" + officeId +
                ", value=" + value +
                "strength=" + strength +
                '}';
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength > 100 || strength < 1) throw new ValueException("Invalid strength");
        this.strength = strength;
    }

    public PhysicalWorker(int id, String name, String surname, int age,
                        int experience, Address address, int officeId, int strength) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experience = experience;
        this.address = address;
        this.officeId = officeId;
        if (strength > 100 || strength < 1) throw new ValueException("Invalid strength");
        this.strength = strength;
        this.value = experience * strength / age;
    }
}
