package lesson11_12;

import java.util.LinkedList;

public class Game {
    private Deck cards;
    private LinkedList<Player> players = new LinkedList<>();

    public Game() {
        Deck cards = new Deck();
        cards.initDeck();
        this.setDeck(cards);
    }


    public void setDeck(Deck cards) {
        this.cards = cards;
    }

    public void addPlayer(Player player) {
        players.add(player);

    }

    public void doFirstRound() {
        for (int i = 0; i < 2; i++) {
            for (Player player : players) {
                player.addCardToHad(cards.getRandomCard());

            }
        }
    }

    public void printPlayersHands() {
        for (Player player : players) {
            if (!player.isCroupier()) {
                player.printHand();
            }

        }
    }

    public void doActionPlayers() {
        for (Player player : players) {
            if (!player.isCroupier()) {
                while (player.isNeedCard()) {
                    player.takeCard(cards);
                    player.printHand();
                }
            }
        }
    }

    public void doActionCroupier() {
        for (Player player : players) {
            if (player.isCroupier()) {
                player.takeCard(cards);
            }

        }
    }

    public void printAllPlayersHands() {
        for (Player player : players) {
            if (!player.isCroupier()) {
                player.printHand();

            }
        }
    }

    public void printWinner() {
        for (Player player : players) {
            if (!player.isCroupier()) {
                int values = player.getValueHand();
                if (values > 21) {
                    player.setWinner(false);
                }
            }

        }
        if (getCountWinners() == 1) {
            System.out.println("--------------------------------");
            System.out.println("-------------WINNER-------------");
            for (Player player : players) {
                if (player.isWinner()) {
                    player.printHand();
                    return;
                }

            }
        }


        for (int i = 21; i > 4; i--) {
            int summa = 0;
            for (Player player : players) {
                if (player.getValueHand() == i) {
                    System.out.println("--------------------------------");
                    System.out.println("-------------WINNER-------------");
                    player.printHand();
                    summa++;

                }
            }
            if (summa != 0) {
                return;
            }

        }

    }

    private int getCountWinners() {
        int summa = 0;
        for (Player player : players) {
            if (player.isWinner()) {
                summa++;
            }
        }
        return summa;
    }
}

