package HR;

public class Manager extends MemberOfTheBoard{
    private double monthPayment;
    private double bonus;
    private double addition;
    private int phoneNumber;
    private int mobileNumber;
    private int roomNumber;
    private String departmentName;


    public Manager(){}

    public Manager(double monthPayment, double bonus, double addition, int phoneNumber, int mobileNumber, int roomNumber, String departmentName) {
        this.monthPayment = monthPayment;
        this.bonus = bonus;
        this.addition = addition;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.roomNumber = roomNumber;
        this.departmentName = departmentName;
    }

    String managerData() {
        return  getPersonalData() + "\n" +
                "monthPayment=" + monthPayment + "\n" +
                "bonus=" + bonus + "\n" +
                "addition=" + addition + "\n" +
                "phoneNumber=" + phoneNumber + "\n" +
                "mobileNumber=" + mobileNumber + "\n" +
                "roomNumber=" + roomNumber + "\n" +
                "departmentName='" + departmentName + "\n" +
                "totalMonthSalary=" + totalMonthSalary;
    }
    public Double getTotalSalaryManager(){
        totalMonthSalary = monthPayment + bonus * monthPayment + addition;
        return totalMonthSalary;
    }

    public void setManagerData(
            double monthPayment,
            double bonus,
            double addition,
            int phoneNumber,
            int mobileNumber,
            int roomNumber,
            String departmentName) {
        this.monthPayment = monthPayment;
        this.bonus = bonus;
        this.addition = addition;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.roomNumber = roomNumber;
        this.departmentName = departmentName;
    }
    public String promotetoManager(
            double monthPayment,
            double bonus,
            double addition,
            int phoneNumber,
            int mobileNumber,
            int roomNumber,
            String departmentName){
        setPosition("Manager");
        setManagerData(
                monthPayment,
                bonus,
                addition,
                phoneNumber,
                mobileNumber,
                roomNumber,
                departmentName);
        getTotalSalaryManager();
        return managerData();
    }
}
