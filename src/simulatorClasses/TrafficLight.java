package simulatorClasses;

import java.util.Random;

public class TrafficLight {
    private Random random;
    private int position;
    private boolean signalToGo;

    public TrafficLight(int roadSegment) {
        position = roadSegment;
        signalToGo = true;
    }

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
        if (chance < changeRate) {
            signalToGo = !signalToGo;
        }
        else  {
            signalToGo = signalToGo;
        }
    }
}
