package simulatorClasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoadTest {
    @Test void checkConstructor() {
        // Test constructor values.
        Road road = new Road();

        // Length
        int roadLength = road.getLength();
        assertEquals(10, roadLength);

        // Metres
        int roadMetres = road.getMetres();
        assertEquals(20, roadMetres);
    }

    @Test void basicTest() {
        // Test setter and getter methods.
        Road road = new Road();

        // Length
        int roadLength = 5;
        road.setLength(roadLength);
        int testLength = road.getLength();
        assertEquals(roadLength, testLength);

        // Metres
        int roadMetres = 4;
        road.setMetres(roadMetres);
        int testMetres = road.getMetres();
        assertEquals(roadMetres, testMetres);
    }
}