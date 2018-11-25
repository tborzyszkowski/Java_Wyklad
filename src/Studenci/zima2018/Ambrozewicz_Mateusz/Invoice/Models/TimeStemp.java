package Invoice.Models;

import java.time.*;

public class TimeStemp {
    private LocalDate timeStemp;

    public TimeStemp(){
        this.timeStemp = LocalDate.now();
    }

    public TimeStemp(int year, int month, int day){
        this.timeStemp = LocalDate.of(year,month,day);
    }

    @Override
    public String toString() {
        return ""+timeStemp;
    }
}
