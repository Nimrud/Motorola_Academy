package pl.jaczewski;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import pl.jaczewski.clock_angles.ClockAngles;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ClockAnglesTests {

    ClockAngles clockAngles = new ClockAngles();

    @Test
    public void same_angles_produces_zero() {
        assertEquals(0, clockAngles.calcAngle(0, 0));
    }

    @Test
    public void minute_after_midnight_produces_six() {
        assertEquals(6, clockAngles.calcAngle(0, 1));
    }

    @Test
    public void noon_hours_produce_morning_hours() {
        assertEquals(5, clockAngles.calcAngle(23, 59));
    }

    @Test
    public void sixty_minutes_produce_full_hour() {
        assertEquals(30, clockAngles.calcAngle(0, 60));
    }

    @Test(expected = NumberFormatException.class)
    public void non_number_input_throws_exception() {
        clockAngles.calcAngle(Integer.parseInt("aaa"), Integer.parseInt("12m"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrong_input_throws_exception() {
        clockAngles.calcAngle(27, 72);
    }
}
