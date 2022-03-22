package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentTest {
    @Test

    public void minutesToDays(){
        //given
        Minutes input = new Minutes();

        //when
        long day = input.years(1000000000);

        //check
        assertEquals(1902,day);
    }


}
