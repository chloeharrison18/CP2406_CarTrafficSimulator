package simulatorClasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoadTest {
    @Test void initialiser() {
        // Test constructor values
        Road road = new Road();

        // Segments
        int[] roadSegments = road.getSegments();
        assertArrayEquals(new int [8], roadSegments);

        // Segments length
        int roadLength = road.getSegmentLength();
        assertEquals(2, roadLength);

        // Segments Breadth
        int roadBreadth = road.getSegmentBreadth();
        assertEquals(1, roadBreadth);
    }

    @Test void testMethods() {
        // Test setter and getter methods
        Road road = new Road();

        // Segments
        int[] roadSegments = new int[5];
        road.setSegments(roadSegments);
        int[] testSegments = road.getSegments();
        assertArrayEquals(roadSegments, testSegments);

        // Segments length
        int segmentLength = 4;
        road.setSegmentLength(segmentLength);
        int testSegmentLength = road.getSegmentLength();
        assertEquals(segmentLength, testSegmentLength);

        // Segments breadth
        int segmentBreadth = 3;
        road.setSegmentBreadth(segmentBreadth);
        int testSegmentBreadth = road.getSegmentBreadth();
        assertEquals(segmentBreadth, testSegmentBreadth);
    }
}