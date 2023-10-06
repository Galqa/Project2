/* Cтворити проект, пакет.
 Створити клас MyArea, в ньому оголосити константу PI = 3.14 та статичний метод areaOfCircle,
 який повинен приймати радіус та використовуючи PI порахувати площу кола.
 Створити клас Main, де запустити цей метод.
 */

package project4;

public class MyArea {
    public static final double PI = 3.14;

    public static double areaOfCircle(double radius) {
        return PI * radius * radius;
    }
}

class Main {
    public static void main(String[] args) {
        double area = MyArea.areaOfCircle(888);
        System.out.println("Площа кола:" + area);
    }
}

