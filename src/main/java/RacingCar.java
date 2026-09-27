package src.main.java;

public class RacingCar {

    // Константы автомобиля
    private static final int MAX_SPEED = 200;
    private static final int ACCELERATION_STEP = 10;
    private static final int BRAKING_STEP = 10;

    // Состояние автомобиля
    private int speed;
    private boolean engineOn;

    // Запуск двигателя
    public void start() {
        engineOn = true;
    }

    // Остановка двигателя
    public void stop() {
        engineOn = false;
        speed = 0;
    }

    // Ускорение
    public void accelerate() {
        if (!canMove()) {
            return;
        }

        speed = Math.min(
                speed + ACCELERATION_STEP,
                MAX_SPEED
        );
    }

    // Торможение
    public void brake() {
        if (!canMove()) {
            return;
        }

        speed = Math.max(
                speed - BRAKING_STEP,
                0
        );
    }

    // Проверка возможности движения
    private boolean canMove() {
        return engineOn;
    }

    // Получение текущей скорости
    public int getSpeed() {
        return speed;
    }

    // Проверка состояния двигателя
    public boolean isEngineRunning() {
        return engineOn;
    }
}