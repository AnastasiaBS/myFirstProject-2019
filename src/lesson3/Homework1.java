package lesson3;

//2) Есть массив {a,b,c,d}. Нужно его "перевернуть задом наперед". По итогу получится другой массив.
// И после этого, напечатать второй массив на консоль для демонстрации.
public class Homework1 {
    public static void main(String[] args) {
//        char[] massive = {'a','b','c','d'};
//        for (int i = massive.length - 1; i >= 0; i--) {
//            System.out.print(massive[i] + ", ");
//        }


        char[] massive = {'a', 'b', 'c', 'd'};
        for (int i = 0; i <= 3; i++) {
            System.out.print(massive[i] + ", ");
        }

        char[] m2 = massive.clone();
        System.out.print("\n");
        for (int i = m2.length - 1; i >= 0; i--) {
            System.out.print(m2[i] + ", ");
        }

    }


}
