package lesson2;

public class Main3 {
    public static void main(String[] args) {
        // от 100 до 150 которые / 5 без остатка

        for (int i = 100; i <= 150; i++) {
            if (i % 5 == 0) {
            }
            System.out.println(i);
        }
        for (int i = 100; i <= 150; i = i + 5) {
            System.out.println(i);
        }
        for (int i = 33; i <= 66; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }
    }
}
