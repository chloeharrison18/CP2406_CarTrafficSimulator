package simulatorClasses;

public class Road {
    private int segmentCount;
    private int segmentLength;
    private int segmentBreadth;

    public Road() {
        segmentCount = 10;
        segmentLength = 2;
        segmentBreadth = 1;
    }

    public void setSegmentCount(int segmentCount) {
        this.segmentCount = segmentCount;
    }

    public int getSegmentCount() {
        return segmentCount;
    }

    public void setSegmentLength(int segmentLength) {
        this.segmentLength = segmentLength;
    }

    public int getSegmentLength() {
        return segmentLength;
    }

    public void setSegmentBreadth(int segmentBreadth) {
        this.segmentBreadth = segmentBreadth;
    }

    public int getSegmentBreadth() {
        return segmentBreadth;
    }
}
