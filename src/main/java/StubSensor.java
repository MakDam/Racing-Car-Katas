public class StubSensor implements PressureSensor {

    private final double value;

    public StubSensor(double value) {
        this.value = value;
    }

    @Override
    public double popNextPressurePsiValue() {
        return value;
    }
}