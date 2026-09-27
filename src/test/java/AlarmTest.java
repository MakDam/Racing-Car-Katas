import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlarmTest {

    @Test
    void alarmOnWhenPressureBelowThreshold() {
        Alarm alarm = new Alarm(new StubSensor(15));
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }

    @Test
    void alarmOffWhenPressureInRange() {
        Alarm alarm = new Alarm(new StubSensor(19));
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    void alarmOffAtLowBoundary() {
        Alarm alarm = new Alarm(new StubSensor(17));
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    void alarmOffAtHighBoundary() {
        Alarm alarm = new Alarm(new StubSensor(21));
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    void alarmOnWhenPressureAboveThreshold() {
        Alarm alarm = new Alarm(new StubSensor(22));
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }
}