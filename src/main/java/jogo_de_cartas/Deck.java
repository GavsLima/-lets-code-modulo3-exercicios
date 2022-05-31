package jogo_de_cartas;

public class Deck {
    private Card[] cards;

    public Deck(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }
}
