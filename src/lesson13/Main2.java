package lesson13;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        HashMap<String, Integer> refrigerator = new HashMap<>();
        refrigerator.put("Яблоко", 5);
        refrigerator.put("Груша", 2);
        refrigerator.put("Слива", 3);
        refrigerator.put("Ананас", 7);

        System.out.println(refrigerator);

        int summa = 0;
        for (Integer currentProduct : refrigerator.values()) {
            summa = summa + refrigerator.get(currentProduct);

        }
        System.out.println(summa);

        refrigerator.put("Груша", 3 + refrigerator.get("Груша"));
        System.out.println(refrigerator);
    }
}
