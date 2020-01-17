package lesson1;

import java.sql.SQLOutput;

public class Main1 {
    public static void main(String[] args) {
        int tourCost = 20000;
        int money = 10000;
        int monthToTrip = 4;
        int salary = 5000;

        int savedMoneyAtThisPeriod = salary * monthToTrip;
        int totalMoneyBeforeTrip = money + savedMoneyAtThisPeriod;

        if (tourCost > totalMoneyBeforeTrip) {
            System.out.println("Мы в тур не едем!!!");
        } else if (tourCost == totalMoneyBeforeTrip) {
            System.out.println("Денег ровно столько, сколько стоит поездка.");
        } else {
            System.out.println("Мы в тур едем!!!");
        }
    }
}
