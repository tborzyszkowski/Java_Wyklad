package HR;

import java.util.Arrays;

public class Worker extends OfficeWorker{
    private double perHour;
    private int numHour;
    private int overtime;
    private Manager manager;
    private String[] abilities;

    public Worker(){}

    public Worker(double perHour, int numHour, int overtime, Manager manager, String abilities[]) {
        this.perHour = perHour;
        this.numHour = numHour;
        this.overtime = overtime;
        this.manager = manager;
        this.abilities = abilities;
    }

    String workerData() {
        return  getPersonalData() + "\n" +
                "hourpayment=" + perHour + "\n" +
                "number of working hours=" + numHour + "\n" +
                "overtime=" + overtime + "\n" +
                "Manager=" + manager.getSurname() + manager.getName() + "\n" +
                "abilities=" + Arrays.toString(abilities) + "\n" +
                "totalMonthSalary=" + totalMonthSalary;
    }

    public Double getTotalSalaryWorker() {
        this.totalMonthSalary = perHour * numHour + 1.5 * perHour * overtime;
        return totalMonthSalary;
    }

    public void setWorkerData(double perHour, int numHour, int overtime, Manager manager, String[] abilities) {
        this.perHour = perHour;
        this.numHour = numHour;
        this.overtime = overtime;
        this.manager = manager;
        this.abilities = abilities;
    }

    public String promotetoWorker(double payhour, int numhours, int overtime, Manager manager, String[] abilities){
        setPosition("Worker");
        setWorkerData(payhour, numhours, overtime, manager, abilities);
        getTotalSalaryWorker();
        return workerData();
    }
}
