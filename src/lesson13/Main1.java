package lesson13;

import java.util.HashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10, 1981, 5);
        Coin coin2 = new Coin(5, 1980, 4);
        Coin coin3 = new Coin(5, 1983, 4);
        Coin coin4 = new Coin(4, 1984, 1);
        Coin coin5 = new Coin(2, 1989, 9);

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin2);
        coins.add(coin1);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin coin:coins) {
            System.out.println(coin);

        }

    }
}
