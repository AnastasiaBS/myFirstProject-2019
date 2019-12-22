package lesson3;

//3) Есть массив чисел (задайте его сами).
// Задача - посчитать и напечатать на консоль сумму всех четных цифр внутри этого массива.
public class Homework2 {
    public static void main(String[] args) {
        int[] massive = {7, 8, 4, 5, 6, 3, 2, 2};
        int summa = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                summa += massive[i];
            }

        }
        System.out.println(summa);

    }
}
