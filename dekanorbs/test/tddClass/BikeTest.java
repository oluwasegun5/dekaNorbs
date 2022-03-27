package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test
    public void bikeOnTest(){
        //given
        Bike powerBike = new Bike();
        powerBike.turnOff();
        //when
        powerBike.turnOn();
        //assert
        assertEquals("ON", powerBike.turnOn());
    }

    @Test
    public void bikeOffTest(){
        //given
        Bike powerBike = new Bike();
        powerBike.turnOn();
        //when
        powerBike.turnOff();
        //assert
        assertEquals("OFF", powerBike.turnOff());
    }

    @Test
    public void accelerateGearOneTest(){
        //given
        Bike powerBike = new Bike();

       //when
        powerBike.accelerate();

        //assert
        assertEquals(1,powerBike.speedometer());
    }

    @Test
    @DisplayName("Test if gear will change to gear two if speed exceed 20")
    public void accelerateGearTwoTest(){
        //given
        Bike powerBike = new Bike();

        for(int num =0; num < 20; num++){
            powerBike.accelerate();
        }
        //when
        powerBike.accelerate();
        //assert
        assertEquals(22, powerBike.speedometer());
    }
    @Test
    @DisplayName("Test if gear will change to gear three if speed exceed 30")
    public void accelerateGearThreeTest(){
        //given
        Bike powerBike = new Bike();

        for(int num =0; num < 25; num++){
            powerBike.accelerate();
        }
        //when
        powerBike.accelerate();
        //assert
        assertEquals(33, powerBike.speedometer());
    }

    @Test
    @DisplayName("Test if gear will change to gear four if speed exceed 40")
    public void accelerateGearFourTest(){
        //given
        Bike powerBike = new Bike();

        for(int num =0; num < 29; num++){
            powerBike.accelerate();
        }

        //when
        powerBike.accelerate();
        //assert
        assertEquals(46, powerBike.speedometer());
    }

    @Test
    public void decelerateGearFourTest(){
        //given
        Bike powerBike = new Bike();

        for(int num =0; num < 30; num++){
            powerBike.accelerate();
        }

        //when
        powerBike.decelerate();
        powerBike.decelerate();
        //assert
        assertEquals(38,powerBike.speedometer());

    }

    @Test
    public void decelerateGearThreeTest(){
        //given
        Bike powerBike = new Bike();

        for (int i = 0; i < 26; i++) {
            powerBike.accelerate();
        }


        //when
        powerBike.decelerate();
        powerBike.decelerate();
        //assert
        assertEquals(28,powerBike.speedometer());

    }
    @Test
    public void decelerateGearTwoTest(){
        //given
        Bike powerBike = new Bike();

        for(int num =0; num < 21; num++){
            powerBike.accelerate();
        }
        //when
        powerBike.decelerate();
        powerBike.decelerate();
        //assert
        assertEquals(19,powerBike.speedometer());

    }

    @Test
    public void decelerateGearOneTest(){
        //given
        Bike powerBike = new Bike();

        for(int num =0; num < 29; num++){
            powerBike.accelerate();
        }

        //when
        powerBike.decelerate();
        //assert
        assertEquals(38,powerBike.speedometer());
        assertEquals("gear three",powerBike.getGear());

    }

    @Test
    public void getGearOneTest(){
        //given
        Bike powerBike = new Bike();
        //when
    }
}