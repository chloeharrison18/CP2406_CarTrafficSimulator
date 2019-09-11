package simulatorClasses;

public class Main {
    public static void main(String[] args) {
        Road road = new Road();
        Road road2 = new Road();
        TrafficLight trafficLight = new TrafficLight(road);
        Car car = new Car(road);
        int endOfRoad = road.getLength();
        int endOfRoad2 = road2.getLength();
        int carPosition = car.getPosition();
        boolean trafficSignal = trafficLight.getSignalToGo();

        while (carPosition != endOfRoad) {
            System.out.println("Car Position: " + carPosition + ", Road: 1");
            if (carPosition == 6 && trafficSignal == true) {
                car.setPosition(endOfRoad);
                car.setRoad(road2);
                System.out.println("Car Position: 7, Road: 1\n" +
                        "Car Position: 8, Road: 1\n" +
                        "Car Position: 9, Road: 1");
                secondRoad(car, carPosition, endOfRoad2);
            }
            else if (carPosition == 6 && trafficSignal == false)
                carPosition = carPosition;
            else
                car.drive();
                carPosition = car.getPosition();
                trafficLight.changeSignalChance();
                trafficSignal = trafficLight.getSignalToGo();
        }

    }
    public static void secondRoad(Car car, int carPosition, int endOfRoad2) {
        car.setPosition(0);
        carPosition = car.getPosition();

        while (carPosition != endOfRoad2) {
            System.out.println("Car Position: " + carPosition + ", Road: 2");
            car.drive();
            carPosition = car.getPosition();
        }
    }
}
