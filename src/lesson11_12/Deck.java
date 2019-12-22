package lesson11_12;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
    }

    public void initDeck() {
        cards.add(new Card("Пика", "2", 2));
        cards.add(new Card("Трефа", "2", 2));
        cards.add(new Card("Бубна", "2", 2));
        cards.add(new Card("Черви", "2", 2));

        cards.add(new Card("Пика", "3", 3));
        cards.add(new Card("Трефа", "3", 3));
        cards.add(new Card("Бубна", "3", 3));
        cards.add(new Card("Черви", "3", 3));

        cards.add(new Card("Пика", "4", 4));
        cards.add(new Card("Трефа", "4", 4));
        cards.add(new Card("Бубна", "4", 4));
        cards.add(new Card("Черви", "4", 4));

        cards.add(new Card("Пика", "5", 5));
        cards.add(new Card("Трефа", "5", 5));
        cards.add(new Card("Бубна", "5", 5));
        cards.add(new Card("Черви", "5", 5));

        cards.add(new Card("Пика", "6", 6));
        cards.add(new Card("Трефа", "6", 6));
        cards.add(new Card("Бубна", "6", 6));
        cards.add(new Card("Черви", "6", 6));

        cards.add(new Card("Пика", "7", 7));
        cards.add(new Card("Трефа", "7", 7));
        cards.add(new Card("Бубна", "7", 7));
        cards.add(new Card("Черви", "7", 7));

        cards.add(new Card("Пика", "8", 8));
        cards.add(new Card("Трефа", "8", 8));
        cards.add(new Card("Бубна", "8", 8));
        cards.add(new Card("Черви", "8", 8));

        cards.add(new Card("Пика", "9", 9));
        cards.add(new Card("Трефа", "9", 9));
        cards.add(new Card("Бубна", "9", 9));
        cards.add(new Card("Черви", "9", 9));

        cards.add(new Card("Пика", "10", 10));
        cards.add(new Card("Трефа", "10", 10));
        cards.add(new Card("Бубна", "10", 10));
        cards.add(new Card("Черви", "10", 10));

        cards.add(new Card("Пика", "Валет", 10));
        cards.add(new Card("Трефа", "Валет", 10));
        cards.add(new Card("Бубна", "Валет", 10));
        cards.add(new Card("Черви", "Валет", 10));

        cards.add(new Card("Пика", "Дама", 10));
        cards.add(new Card("Трефа", "Дама", 10));
        cards.add(new Card("Бубна", "Дама", 10));
        cards.add(new Card("Черви", "Дама", 10));

        cards.add(new Card("Пика", "Король", 10));
        cards.add(new Card("Трефа", "Король", 10));
        cards.add(new Card("Бубна", "Король", 10));
        cards.add(new Card("Черви", "Король", 10));

        cards.add(new Card("Пика", "Туз", 11));
        cards.add(new Card("Трефа", "Туз", 11));
        cards.add(new Card("Бубна", "Туз", 11));
        cards.add(new Card("Черви", "Туз", 11));
    }

    public Card getRandomCard() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 51 + 1);
        return cards.get(randomNum);

    }
}
