public class TradesmanEmployee extends Employee {
    private static String effectivnessType[] = {"LOW", "MEDIUM", "HIGH"};
    private double provision;
    private int effectiveness; //0-low, 1-medium, 2-high
    TradesmanEmployee(String name, String surname, int age, int experience,String city, String street, int buildNum, int localNum, double provision, int effectiveness){
        validateProvision(provision);
        this.provision=provision;
        validateEffectiveness(effectiveness);
        this.effectiveness=effectiveness;
        this.addEmployeeList(this);
        this.setCityName(city);
        this.setEmpName(name);
        this.setEmpSurname(surname);
        this.setEmpAge(age);
        this.setEmpExperience(experience);
        this.setStreetName(street);
        this.setBuildNumber(buildNum);
        this.setLocalNumber(localNum);
    }

    int corporationValue(){
        int convertedEffectivnes=0;
        switch(this.effectiveness){
            case 0:
                convertedEffectivnes=60;
                break;
            case 1:
                convertedEffectivnes=90;
                break;
            case 2:
                convertedEffectivnes=120;
                break;
        }
        return this.getEmpExperience() * convertedEffectivnes;
    }

    public double getProvision() {
        return provision;
    }

    public void setProvision(double provision) {
        validateProvision(provision);
        this.provision = provision;
    }

    public int getEffectiveness() {
        return effectiveness;
    }

    public void setEffectiveness(int effectiveness) {
        validateEffectiveness(effectiveness);
        this.effectiveness = effectiveness;
    }


    void validateProvision(double provision){
        if(!(provision >= 0.0 && provision <= 100.0)){
            throw new IllegalArgumentException("Provision is not valid!");
        }
    }

    void validateEffectiveness(int effectiveness){
        if(!(effectiveness==0 || effectiveness==1 || effectiveness==2)){
            throw new IllegalArgumentException("Value for effectiveness is not valid!");
        }
    }
}
