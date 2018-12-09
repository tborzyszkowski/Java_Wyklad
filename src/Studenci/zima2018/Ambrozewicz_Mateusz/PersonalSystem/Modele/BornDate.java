package PersonalSystem.Modele;

import java.time.LocalDate;

public class BornDate {
    private int year;
    private int month;
    private int day;

    public BornDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public LocalDate getBornDate(){
        LocalDate bornDate = LocalDate.of(year,month,day);
        return bornDate;
    }

    @Override
    public String toString() {
        return getBornDate() + "";
    }
}
