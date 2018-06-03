package Task008;

public class Plane extends Vihicle {
    double height;
    int count;

    public Plane(double height, int count) {
        this.height = height;
        this.count = count;
    }
    // Перегрузка toString();
    @Override
    public String toString() {
        return "cost = " + cost + " speed = " + speed + " year = " + year + " count = " + count + " height = " + height;
    }
}
