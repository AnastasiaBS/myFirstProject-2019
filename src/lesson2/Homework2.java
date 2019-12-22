package lesson2;

// в) вывести на консоль сумму чисел в диапазоне от 50 до 1000, которые делятся без остатка на 7 и на 19
public class Homework2 {
    public static void main(String[] args) {
        int summa = 0;
        for (int i = 50; i <= 1000; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                summa = summa + i;

            }
        }
        System.out.println(summa);

    }

}
