package lesson11_12;

public class Croupier extends Player {
    @Override
    public void takeCard(Deck cards) {
        int valuesCards = this.getValueHand();
        if (valuesCards < 18) {
            this.addCardToHad(cards.getRandomCard());
            this.takeCard(cards);
        }

    }
}
