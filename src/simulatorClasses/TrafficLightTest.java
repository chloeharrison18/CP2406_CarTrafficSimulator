package simulatorClasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {
    @Test void checkConstructor() {
        /* Test constructor values.
        A road object is initialised where the last road segment is set to be the traffic light's position.
        */
        Road road = new Road();
        TrafficLight trafficLight = new TrafficLight(road);

        //Road
        Road currentRoad = trafficLight.getRoad();
        assertEquals(road, currentRoad);

        // Position
        int trafficLightPosition = trafficLight.getPosition();
        assertEquals(10, trafficLightPosition);

        // Signal to go
        boolean trafficSignal = trafficLight.getSignalToGo();
        assertEquals(true, trafficSignal);
    }

    @Test void basicTest() {
        // Test setter and getter methods.
        Road road = new Road();
        Road road2 = new Road();
        TrafficLight trafficLight = new TrafficLight(road);

        // Road
        trafficLight.setRoad(road2);
        Road currentRoad = trafficLight.getRoad();
        assertEquals(road2, currentRoad);

        // Position
        int setPosition = road.getLength();
        trafficLight.setPosition(setPosition);
        int trafficLightPosition = trafficLight.getPosition();
        assertEquals(10, trafficLightPosition);

        // Signal
        boolean trafficSignal = true;
        trafficLight.setSignalToGo(trafficSignal);
        boolean testSignal = trafficLight.getSignalToGo();
        assertEquals(trafficSignal, testSignal);
    }

    @Test void checkChangingSignal() {
        // Test random change of stop and go (boolean true or false) by counting down each road segment.
        Road road = new Road();
        TrafficLight trafficLight = new TrafficLight(road);

        int segmentCount = road.getLength();
        int startingSegment = 1;
        String trafficStatus;
        String overallMessage = "The traffic signal is set to ";

        while (startingSegment != segmentCount) {
            boolean trafficSignal = trafficLight.getSignalToGo();
            startingSegment += 1;
            if (trafficSignal == true) {
                trafficStatus = "go";
                System.out.println(overallMessage + trafficStatus + ".");
            }
            else {
                trafficStatus = "stop";
                System.out.println(overallMessage + trafficStatus + ".");
            }
            trafficLight.changeSignalChance();
        }
    }

    @Test void checkSignalColour() {
        // Test output for traffic light colour (true is green, false is red).
        Road road = new Road();
        TrafficLight trafficLight = new TrafficLight(road);
        trafficLight.signalColour();
        trafficLight.setSignalToGo(false);
        trafficLight.signalColour();
    }
}