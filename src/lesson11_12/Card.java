package lesson11_12;

public class Card {
    private String suit;
    private String nominal;
    private int value;

    public Card() {
    }

    public Card(String suit, String nominal, int value) {
        this.suit = suit;
        this.nominal = nominal;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (getValue() != card.getValue()) return false;
        if (getSuit() != null ? !getSuit().equals(card.getSuit()) : card.getSuit() != null) return false;
        return getNominal() != null ? getNominal().equals(card.getNominal()) : card.getNominal() == null;
    }

    @Override
    public int hashCode() {
        int result = getSuit() != null ? getSuit().hashCode() : 0;
        result = 31 * result + (getNominal() != null ? getNominal().hashCode() : 0);
        result = 31 * result + getValue();
        return result;
    }

    @Override
    public String toString() {
        return "Карта: " + nominal + " " + suit;
    }
}
