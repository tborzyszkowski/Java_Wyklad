import java.util.Date;

public class Dealer extends Employee{
    private int commision;
    private Efficiency efficiency;

    public Dealer(String name, String surname, Date birthDate, Date hireDate, Address address, int commision, Efficiency efficiency) throws IllegalArgumentException {
        super(name, surname, birthDate, hireDate, address);
        if(commision<1 || commision>100)
            throw new IllegalArgumentException("Nie poprawna wartosc prowizji");
        this.commision = commision;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return super.toString()+"  COMMISION: "+commision+"  EFFICIENCY: "+efficiency+"\n\n";
    }

    @Override
    int getValue() { return getExperience() * efficiency.getValue(); }

    public void setCommision(int commision) {
        this.commision = commision;
    }

    public void setEfficiency(Efficiency efficiency) {
        this.efficiency = efficiency;
    }

    public int getCommision() {
        return commision;
    }

    public Efficiency getEfficiency() {
        return efficiency;
    }

    enum Efficiency {
        NISKA(60),
        ŚREDNIA(90),
        WYSOKA(120);

        private int value;
        public int getValue() {return  this.value;}
        Efficiency(int value) {this.value = value;}
    }
}
