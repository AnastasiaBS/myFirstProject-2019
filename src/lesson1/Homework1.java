package lesson1;

public class Homework1 {
    public static void main(String[] args) {
        double a = 3;
        double b = 6;
        double c = 4;
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Площадь треугольника = " + s + ".");
    }
}
