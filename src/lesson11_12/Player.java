package lesson11_12;

import java.util.LinkedList;
import java.util.Scanner;

public class Player {
    private LinkedList<Card> hand = new LinkedList<>();
    private boolean isCroupier = false;
    private boolean isNeedCard = true;
    private boolean isWinner = true;

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }


    public boolean isNeedCard() {
        return isNeedCard;
    }

    public void setNeedCard(boolean needCard) {
        isNeedCard = needCard;
    }


    public boolean isCroupier() {
        return isCroupier;
    }

    public void setCroupier(boolean croupier) {
        isCroupier = croupier;
    }


    public void addCardToHad(Card card) {
        hand.add(card);
    }

    public void printHand() {
        System.out.println("---------Это крупье?------" + isCroupier);
        System.out.println("-------- Карты ----------");
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println("----------------------------");
    }

    public void takeCard(Deck cards) {
        System.out.println("Берете ли вы карту?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("да")) {
            this.addCardToHad(cards.getRandomCard());
        } else if (answer.equals("нет")) {
            this.setNeedCard(false);
        } else {
            System.out.println("---------Повторите ввод!!!");
            this.takeCard(cards);
        }
    }

    public int getValueHand() {
        int summa = 0;
        for (Card card : hand) {
            summa = summa + card.getValue();
        }
        return summa;
    }
}
