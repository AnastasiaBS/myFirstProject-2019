package lesson2;

import lesson4.FiguresUtils;

public class Main4 {
    public static void main(String[] args) {
        int summa = 0;
        for (int i = 10; i <= 20; i++) {
            summa = summa + i;
        }
        System.out.println(summa);

       int code = 1;
        for (int i = 100; i >= 20; i -= 5) {
            code = code + i;
        }
        System.out.println(code);


    }

}
