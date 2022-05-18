package chapter3Test;

import chapter3.car.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    Car car;
    @BeforeEach
    private void  setup(){
        car = new Car("Rx350","2013",150.0);
    }

    @Test
    public void testThatClassIsNotEmpty(){
        assertNotNull(car);
    }
    @Test
    public void setCarModel(){
        car.setModel("Rx370");
        assertEquals("Rx370",car.model());
    }

    @Test
    public void setCarYear(){
        car.setYear("2022");
        assertEquals("2022",car.year());
    }

    @Test
    public void setCarPriced(){
        car.setPrice(12345.76);
        assertEquals(12345.76, car.price());
    }
}
