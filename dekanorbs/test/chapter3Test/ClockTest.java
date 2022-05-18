package chapter3Test;

import chapter3.clock.Clock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClockTest {
    Clock clock;
    @BeforeEach
    public void setUp(){
        clock = new Clock(23,59,59);
    }

    @Test
    public void testThatClockIsNotEmpty() {
        assertNotNull(clock);
    }

    @Test
    public void setHour(){
        assertEquals(23, clock.getHour());
        clock.setHour(24);
        assertEquals(0,clock.getHour());
    }

    @Test
    public void setMinute(){
        assertEquals(59, clock.getMinute());
        clock.setMinute(60);
        assertEquals(0,clock.getMinute());
    }

    @Test
    public void setSecond(){
        assertEquals(59, clock.getSecond());
        clock.setSecond(60);
        assertEquals(0,clock.getSecond());
    }
}
