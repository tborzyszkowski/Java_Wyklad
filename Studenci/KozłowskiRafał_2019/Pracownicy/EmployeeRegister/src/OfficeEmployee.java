public class OfficeEmployee extends Employee {
    private int officeId;
    private static int lastOfficeId=0;
    private int intelect;

    OfficeEmployee(String name, String surname, int age, int experience,String city, String street, int buildNum, int localNum, int intelect){
        validateIntelect(intelect);
        this.intelect = intelect;
        this.setCityName(city);
        this.officeId = ++lastOfficeId;
        this.setEmpName(name);
        this.setEmpSurname(surname);
        this.setEmpAge(age);
        this.setStreetName(street);
        this.setEmpExperience(experience);
        this.setBuildNumber(buildNum);
        this.setLocalNumber(localNum);
    }

    public int corporationValue(){
        return this.intelect * this.getEmpExperience();
    }

    public int getOfficeId() {
        return officeId;
    }

    public int getIntelect() {
        return intelect;
    }

    public void setIntelect(int intelect) {
        validateIntelect(intelect);
        this.intelect = intelect;
    }

    private void validateIntelect(int value){
        if(!(value >= 70 && value <= 150)){
            throw new IllegalArgumentException("Intelect is not valid!");
        }
    }


}
