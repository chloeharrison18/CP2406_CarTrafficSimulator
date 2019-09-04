package simulatorClasses;

public class Road {
    private int length;
    private int metres;

    public Road() {
        length = 10;
        metres = length * 2;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setMetres(int metres) {
        this.metres = metres;
    }

    public int getMetres() {
        return metres;
    }
}
