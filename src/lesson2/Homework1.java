package lesson2;

//        б) вывести на числа в диапазоне от 500 до 1000, которые делятся без остатка на 7 и на 19
public class Homework1 {

    public static void main(String[] args) {

        for (int a = 500; a <= 1000; a++) {
            if (a % 7 == 0) {
                System.out.println(a);
            } else if (a % 19 == 0) {
                System.out.println(a);
            }
        }
    }

}
