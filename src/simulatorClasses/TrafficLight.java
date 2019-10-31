package simulatorClasses;

public class TrafficLight {
    Road road;
    private int position;
    private boolean signalToGo;

    public TrafficLight(Road givenRoad) {
        road = givenRoad;
        position = road.getLength();
        signalToGo = true;
    }

    public void setRoad(Road road) {this.road = road;}

    public Road getRoad() { return road;}

    public void setPosition(int position) { this.position = position; }

    public int getPosition() {
        return position;
    }

    public void setSignalToGo(boolean signalToGo) {
        this.signalToGo = signalToGo;
    }

    public boolean getSignalToGo() {
        return signalToGo;
    }

    public void changeSignalChance() {
        double changeRate = 0.3;
        double chance = Math.random();
        if (chance < changeRate)
            signalToGo = !signalToGo;
        else
            signalToGo = signalToGo;
    }

    public void signalColour() {
        String message = "The traffic light is ";
        if (signalToGo == false)
            System.out.println(message + "red.");
        else
            System.out.println(message + "green.");
    }
}
