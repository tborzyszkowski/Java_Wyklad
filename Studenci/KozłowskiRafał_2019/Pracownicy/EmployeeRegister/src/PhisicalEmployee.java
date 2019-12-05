public class PhisicalEmployee extends Employee {
    private int strength;

    PhisicalEmployee(String name, String surname, int age, int experience,String city, String street, int buildNum, int localNum, int strength){
        validateStrength(strength);
        this.strength = strength;
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
        return (this.getEmpExperience()*this.strength)/(this.getEmpAge());
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        validateStrength(strength);
        this.strength = strength;
    }

    void validateStrength(int value){
        if (!(value >= 1 && value <= 100)){
            throw new IllegalArgumentException("Strength is not valid!");
        }
    }

}
