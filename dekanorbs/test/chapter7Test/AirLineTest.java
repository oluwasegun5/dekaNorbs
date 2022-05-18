package chapter7Test;

import chapter7.airlineReservation.AirLine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AirLineTest {
    AirLine airLine;
    @BeforeEach
    public void setUp(){
        airLine = new AirLine();
    }

    @Test
    public void testThatAirLineIsNotEmpty(){
        AirLine airLine = new AirLine();
        assertNotNull(airLine);
    }

    @Test
    public void firstClassTest(){
        airLine.book(2);
        airLine.book(2);
        airLine.book(2);
        airLine.book(2);
        airLine.book(2);
        airLine.book(2);
        airLine.book(2);

    }
}
