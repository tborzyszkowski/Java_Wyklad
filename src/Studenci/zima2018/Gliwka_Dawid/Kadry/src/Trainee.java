public class Trainee extends Worker{
    private boolean hasScholarship;
    private Worker overseer;

    public boolean getHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

    public Worker getOverseer() {
        return overseer;
    }

    public void setOverseer(Worker overseer) {
        this.overseer = overseer;
    }

    public Trainee(String name, String surname, int yearBorn) {
        super(name, surname, yearBorn);
    }

    public double getSalary() {
        if (this.getHasScholarship()){
            return 1000;
        }
        else {
            return 0;
        }
    }

    public String getInfo() {
        return super.getInfo() +
                "Ma stypendium: " + (this.getHasScholarship() ? "Tak" : "Nie") + "\n" +
                "Opiekun: " + this.getOverseer().getName() + " " + this.getOverseer().getSurname() + "%\n";
    }


}
