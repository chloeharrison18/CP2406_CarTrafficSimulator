package simulatorClasses;

public class Road {
    private int[] segments;
    private int segmentLength;
    private int segmentBreadth;

    public Road() {
        segments = new int [8];
        segmentLength = 2;
        segmentBreadth = 1;
    }

    public void setSegments(int[] segments) {
        this.segments = segments;
    }

    public int[] getSegments() {
        return segments;
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
