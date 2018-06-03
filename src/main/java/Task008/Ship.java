package Task008;

public class Ship extends Vihicle {
    int count;
    String port;

    public Ship(int count, String port) {
        this.count = count;
        this.port = port;
    }

    @Override
    public String toString() {
        return "cost = " + cost + " speed = " + speed + " year = " + year + " count = " + count + " port = " + port;
    }
}
