/* Cтворити проект, пакет.
 Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
 Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
 Перевантажити конструктори викликаючи конструктор із конструктора.
 Створити клас Main, де створити екземляри класу Машина з різними параметрами.
 */
package projectcar3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this.year = 0;
        this.speed = 0.0;
        this.weight = 0;
        this.color = "Unknown";
    }

    public Car(int year) {
        this();
        this.year = year;
    }

    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ",speed=" + speed +
                ",weight =" + weight +
                ",colour='" + color + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1.toString());

        Car car2 = new Car(2000);
        System.out.println(car2.toString());

        Car car3 = new Car(2111, 500);
        System.out.println(car3.toString());

        Car car4 = new Car(1015, 30.0, 15000);
        System.out.println(car4.toString());

        Car car5 = new Car(4444, 0.0, 1, "colorless");
        System.out.println(car5.toString());
    }
}


