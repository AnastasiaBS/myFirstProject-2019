package lesson2;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int c = 4;

        if (a == b && b == c) {
            System.out.println("Это равносторонний треугольник");
        }
        if ((a == b && a != c) || (b == c && b != a) || (c == a && b != c)) {
            System.out.println("Это равнобедренный треугольник");
        }
        if (a != b && b != c && a != c) {
            System.out.println("Это разносторонний треугольник");

        }
    }
}
