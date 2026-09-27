public class Alarm {

    private static final double LOW_PRESSURE_THRESHOLD = 17;
    private static final double HIGH_PRESSURE_THRESHOLD = 21;

    private final PressureSensor sensor;
    private boolean alarmOn = false;

    public Alarm(PressureSensor sensor) {
        this.sensor = sensor;
    }

    public void check() {
        double psi = sensor.popNextPressurePsiValue();

        if (psi < LOW_PRESSURE_THRESHOLD ||
                psi > HIGH_PRESSURE_THRESHOLD) {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn() {
        return alarmOn;
    }
}