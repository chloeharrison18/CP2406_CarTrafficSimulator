package simulatorClasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test void constructor() {
        // Test constructor values.
        Road road = new Road();
        Car car = new Car(road);

        //Road
        Road currentRoad = car.getRoad();
        assertEquals(road, currentRoad);

        // Position
        int currentPosition = car.getPosition();
        assertEquals(0, currentPosition);
    }

    @Test void basicTest() {
        // Test setter and getter methods
        Road road = new Road();
        Road road2 = new Road();
        Car car = new Car(road);

        // Road
        car.setRoad(road2);
        Road currentRoad = car.getRoad();
        assertEquals(road2, currentRoad);

        // Position
        int setPosition = 1;
        car.setPosition(setPosition);
        int carPosition = car.getPosition();
        assertEquals(1, carPosition);
    }

    @Test void drive() {
        // Test drive method.
        Road road = new Road();
        Car car = new Car(road);

        car.drive();
        int carPosition = car.getPosition();
        assertEquals(1, carPosition);
    }
}