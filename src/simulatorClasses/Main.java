package simulatorClasses;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Set up console variables.
        Road road = new Road();
        Road road2 = new Road();
        TrafficLight trafficLight = new TrafficLight(road);
        Car car = new Car(road);

        int endOfRoad = road.getLength();
        int endOfRoad2 = road2.getLength();
        int carPosition = car.getPosition();
        boolean trafficSignal = trafficLight.getSignalToGo();

        // Set up GUI components.
        Frame frame = new Frame();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addExit(event -> System.exit(0));
        frame.addAbout(event -> JOptionPane.showMessageDialog(frame, "A car simulator. Made by Chloe Harrison."));

        CarRectangle carRectangle = new CarRectangle(100, 100);
        RoadRectangle roadRectangle = new RoadRectangle(100, 100);
        TrafficLightRectangle trafficLightRectangle = new TrafficLightRectangle(100, 30);

        frame.add(roadRectangle);
        frame.add(trafficLightRectangle);
        frame.add(carRectangle);
        frame.pack();

        firstRoad(road2, trafficLight, car, endOfRoad, endOfRoad2, carPosition, trafficSignal, carRectangle);

    }

    public static void firstRoad(Road road2, TrafficLight trafficLight, Car car, int endOfRoad, int endOfRoad2, int carPosition, boolean trafficSignal, CarRectangle carRectangle) throws InterruptedException {
        // Drive car on first road.
        while (carPosition != endOfRoad) {
            System.out.println("Car Position: " + carPosition + ", Road: 1");
            if (carPosition == 6 && trafficSignal == true) {
                car.setPosition(endOfRoad);
                car.setRoad(road2);
                System.out.println("Car Position: 7, Road: 1\n" +
                        "Car Position: 8, Road: 1\n" +
                        "Car Position: 9, Road: 1");
                secondRoad(car, endOfRoad2, carRectangle);
            }
            else if (carPosition == 6 && trafficSignal == false)
                carPosition = carPosition;
            else
                car.drive();
                carPosition = car.getPosition();
                trafficLight.changeSignalChance();
                trafficSignal = trafficLight.getSignalToGo();
                trafficLight.signalColour();
                carRectangle.move();
                Thread.sleep(1000);
        }
    }

    public static void secondRoad(Car car, int endOfRoad2, CarRectangle carRectangle) throws InterruptedException {
        // Drive car on second road.
        car.setPosition(0);
        int carPosition = car.getPosition();

        while (carPosition != endOfRoad2) {
            System.out.println("Car Position: " + carPosition + ", Road: 2");
            car.drive();
            carPosition = car.getPosition();
            carRectangle.move();
            Thread.sleep(1000);
        }
    }
}
