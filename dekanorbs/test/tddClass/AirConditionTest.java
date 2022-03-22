package tddClass;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {
@Test
    public void airConditionerPowerOnTest(){
    //given
    AirConditioner myAirconditioner = new AirConditioner();
    //when
    myAirconditioner.powerOn();
    //assert
    assertEquals("on",myAirconditioner.getPower());

}
    @Test
    public void airConditionerPowerOffTest(){
        //given
        AirConditioner myAirconditioner = new AirConditioner();
        //when
        myAirconditioner.powerOff();
        //assert
        assertEquals("off",myAirconditioner.getPower());

    }
    @Test
    public void initialTemperature(){
        //given
        AirConditioner myAirconditioner = new AirConditioner();
        //when
        int initial = myAirconditioner.getTemp();
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
        myAirconditioner.increase();
        myAirconditioner.increase();
        myAirconditioner.increase();
        myAirconditioner.increase();
        myAirconditioner.increase();
        myAirconditioner.increase();
        myAirconditioner.increase();
        myAirconditioner.increase();
        myAirconditioner.increase();
        myAirconditioner.increase();
        myAirconditioner.increase();
        myAirconditioner.increase();
        myAirconditioner.increase();
        myAirconditioner.increase();
        //when
        myAirconditioner.increase();
        //assert
        assertEquals(30, myAirconditioner.getTemp());
    }
}
