import java.util.Random;

public class Sensor implements PressureSensor {

    private final Random random = new Random();

    @Override
    public double popNextPressurePsiValue() {
        return 6.0 * random.nextDouble() * random.nextDouble();
    }
}