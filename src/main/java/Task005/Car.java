package Task005;

public class Car {
    int year;
    String color;

    // Конструктор по умолчанию
    public Car(){
        year = 2013;
        color = "yellow";
    }
//    Конструктор с 1 параметром

    public Car(int year) {
        this.year = year;
    }
    //    Конструктор с 2 параметрами

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
}
