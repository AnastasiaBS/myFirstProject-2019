package lesson2;

//  г) напечатать на консоль числа от 10 до 30, при этом не печатать числа: 21,22,23,24
public class Homework3 {
    public static void main(String[] args) {
        for (int i = 10; i <= 30; i++) {
            if (i != 21 && i != 22 && i != 23 && i != 24) {
                System.out.println(i);
            }

        }
    }
}
