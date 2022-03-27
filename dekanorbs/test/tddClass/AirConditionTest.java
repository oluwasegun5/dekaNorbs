package tddClass;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {
@Test
    public void acIsOffInitiallyTest(){
    //given
    AirConditioner myAirconditioner = new AirConditioner();

    //assert
    assertFalse(myAirconditioner.isOn());

}
    @Test
    public void airConditionerPowerOnTest(){
        //given
        AirConditioner myAirconditioner = new AirConditioner();
        assertFalse(myAirconditioner.isOn());
        //when
        myAirconditioner.power();
        //assert
        assertTrue(myAirconditioner.isOn());
    }

    @Test
    public void acCanBeTurnedOffTest(){
    //given
        AirConditioner myAirconditioner = new AirConditioner();
        myAirconditioner.power();
        assertTrue(myAirconditioner.isOn());
        //when
        myAirconditioner.power();
        assertFalse(myAirconditioner.isOn());
    }

    @Test
    public void initialTemperature(){
        //given
        AirConditioner myAircondition = new AirConditioner();
        //when
        int initial = myAircondition.getTemp();
        //assert
        assertEquals(16,initial);

    }

    @Test
    public void increaseTemperature(){
    //given
        AirConditioner myAirconditioner = new AirConditioner();
        //when
        myAirconditioner.increase();
        //assert
        assertEquals(17,myAirconditioner.getTemp());

    }
    @Test
    public void decreaseTemperature(){
        //given
        AirConditioner myAirconditioner = new AirConditioner();
        myAirconditioner.increase();
        //when
        myAirconditioner.decrease();
        //assert
        assertEquals(16,myAirconditioner.getTemp());

    }
    @Test
    public void decreaseTemperatureLimit(){
        //given
        AirConditioner myAirconditioner = new AirConditioner();
        //when
        myAirconditioner.decrease();
        //assert
        assertEquals(16,myAirconditioner.getTemp());

    }
    @Test
    public void increaseTemperatureLimit() {
        //given
        AirConditioner myAirconditioner = new AirConditioner();

        int count = 0;
        while (count < 14){
            myAirconditioner.increase();
            count++;
        }
        //when
        myAirconditioner.increase();
        //assert
        assertEquals(30, myAirconditioner.getTemp());
    }
}
