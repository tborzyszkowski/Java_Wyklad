public class WhiteCollarWorker extends OfficeWorker {
    Boss boss;

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public WhiteCollarWorker(String name, String surname, int yearBorn) {
        super(name, surname, yearBorn);
    }

    public String getInfo() {
        return super.getInfo() +
                "Szef: " + this.boss.getName() + " " + this.boss.getSurname() + "\n";

    }


}
