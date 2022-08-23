package exercises;

import java.lang.constant.Constable;

public class NumberOfDays {
    private  int days;
    private  int month;
    private  int years;

    public String calculateDays(int days){
        month = (days % 360) /30;
        years = days/360;
        this.days = (days % 360) %30;
        return String.format("%d->years %d->months %d->days",years,month,this.days);
    }

    public String calculateForHours(int hours){
        int perDay = hours/24;
        System.out.println(perDay);
        return calculateDays(perDay);
    }

    public static void main(String[] args) {
        NumberOfDays numberOfDays = new NumberOfDays();
        System.out.print(numberOfDays.calculateForHours(10000));
    }

}
