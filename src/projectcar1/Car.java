/* Cтворити проект, пакет.
Створити клас Машина з полями рік(int), колір(String).
 Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами.
 Створити клас Main в якому створити екземпляри, викликаючи різні конструктори.
 */

package projectcar1;

public class Car {
    // поля класу
    private int year;
    private String color;

    // конструктор за замовчуванням
    public Car() {
        this.year = 0;
        this.color = "Unknown";
    }

    // конструктор з одним параметром
    public Car(int year) {
        this.year = year;
        this.color = "Unknown";
    }

    // конструктор з двома параметрами
    public Car(int year, String colour) {
        this.year = year;
        this.color = colour;
    }

    public String toString() {
        return "Car{" +
                "year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        //  створення екземплярів класу
        Car car1 = new Car();
        System.out.println(car1.toString());

        Car car2 = new Car(1877);
        System.out.println(car2.toString());

        Car car3 = new Car(2222, "Gold");
        System.out.println(car3.toString());

    }
}