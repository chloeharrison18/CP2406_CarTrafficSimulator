package simulatorClasses;

public class Car {
    Road road;
    private int position;

    public Car(Road givenRoad) {
        road = givenRoad;
        position = 0;
    }

    public void setRoad(Road road) {this.road = road;}

    public Road getRoad() { return road;}

    public void setPosition(int position) { this.position = position; }

    public int getPosition() { return position; }

    public void drive() {
        position += 1;
    }
}
