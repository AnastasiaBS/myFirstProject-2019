package lesson4;

import static java.lang.Thread.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int day = 0; day < 31; day++) {
            for (int hour = 0; hour < 24; hour++) {
                for (int min = 0; min < 60; min++) {
                    for (int sec = 0; sec < 60; sec++) {
                        System.out.printf("Прошло %d дня, %d часов, %d минут, %d секунд", day, hour, min, sec);
                        System.out.println();
                        Thread.sleep(1000);
                    }
                }
            }
        }
    }

}
