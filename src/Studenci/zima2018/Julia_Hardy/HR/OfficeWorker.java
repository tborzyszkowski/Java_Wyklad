package HR;

public class OfficeWorker extends Manager{
    private double payment;
    private double paymentBonus;
    private Manager manager;
    private int phone;
    private int room;

    public OfficeWorker(){}

    public OfficeWorker(double payment, double paymentBonus, Manager manager, int phone, int room) {
        this.payment = payment;
        this.paymentBonus = paymentBonus;
        this.manager = manager;
        this.phone = phone;
        this.room = room;
    }

    String officeWorkerData() {
        return  getPersonalData() + "\n" +
                "month payment=" + payment + "\n" +
                "bonus=" + paymentBonus + "\n" +
                "Manager=" + manager.getSurname() + manager.getName() + "\n" +
                "phone number=" + phone + "\n" +
                "room=" + room + "\n" +
                "totalMonthSalary=" + totalMonthSalary;
    }

    public Double getTotalSalaryOfficeWorker() {
        this.totalMonthSalary = payment + paymentBonus * payment;
        return totalMonthSalary;
    }

    public void setOfficeWorkerData(double payment, int paymentBonus, Manager manager, int phone, int room) {
        this.payment = payment;
        this.paymentBonus = paymentBonus;
        this.manager = manager;
        this.phone = phone;
        this.room = room;
    }

    public String promotetoOfficeWorker(double payment, int paymentBonus, Manager manager, int phone, int room){
        setPosition("Office Worker");
        setOfficeWorkerData(payment, paymentBonus, manager, phone, room);
        getTotalSalaryOfficeWorker();
        return officeWorkerData();
    }
}
