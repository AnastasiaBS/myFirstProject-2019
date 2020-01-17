package lesson1;

public class Homework1 {
    public static void main(String[] args) {
        double a = 12;
        double b = 12;
        double c = 6;
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Площадь треугольника = " + s + ".");
    }
}
