package HR;

public class Staff {
    public static void main(String[] args){
        Manager person1 = new Manager(
                2000,
                20.5,
                500,
                657845,
                567890677,
                15,
                "bridge construction");

        person1.setPersonalData("Tom", "Hardy", 1985, "Manager");
        person1.getTotalSalaryManager();
        System.out.println(person1.managerData() + "\n");

        Worker person2 = new Worker(
                15.25,
                50,
                10,
                person1,
                new String[]{"forklift", "welder"});
        person2.setPersonalData("Kamil", "Kowalski", 1992, "worker");
        person2.getTotalSalaryWorker();
        System.out.println(person2.workerData()+ "\n");

        Intern person3 = new Intern(person2, true);
        person3.setPersonalData("Jakub", "Nowak", 1990, "Intern");
        System.out.println(person3.InternData()+ "\n");

        person2.promotetoManager(
                3890,
                0.20,
                200,
                678906788,
                577790786,
                12,
                "construction manager");
        System.out.println(person2.managerData()+ "\n");
    }
}
