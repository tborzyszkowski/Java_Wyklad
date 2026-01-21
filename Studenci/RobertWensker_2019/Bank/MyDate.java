import java.util.Date;

public class MyDate {

    MyDate(int year,int month, int day){
        Date data = new Date(year-1900, month-1,day);
    }
}
