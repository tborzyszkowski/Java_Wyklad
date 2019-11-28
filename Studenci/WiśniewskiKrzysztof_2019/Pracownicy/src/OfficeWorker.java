import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class OfficeWorker extends Worker {
    private int iq;


    @Override
    public String toString() {
        return "OfficeWorker{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", address=" + address +
                ", officeId=" + officeId +
                ", value=" + value +
                "iq=" + iq +
                '}';
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        if (iq < 69 || iq > 149) throw new ValueException("Invalid iq");
        this.iq = iq;
    }

    public OfficeWorker(int id, String name, String surname, int age,
                        int experience, Address address, int officeId, int iq) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experience = experience;
        this.address = address;
        this.officeId = officeId;
        this.iq = iq;
        if (iq < 69 || iq > 149) throw new ValueException("Invalid iq");
        this.value = experience * iq;
    }
}
