package tddClass;

public class Minutes {


    public int years( int digit){
        int year = 0;
        int days = 0;

        if (digit / 525600 >= 1) {
            year = digit / 525600;
        }
        if (digit / 525600 >= 1) {
            days = digit % 525600;
        }
        return days;
    }
}
