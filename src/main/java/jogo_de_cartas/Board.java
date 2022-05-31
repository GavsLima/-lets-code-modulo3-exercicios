package jogo_de_cartas;

public abstract class Board {

    protected Player[] players;
    protected Deck[] decks;

    public void insertDeck(Deck deck, int id) {
        decks[id] = deck;
    }

    public abstract boolean canPlayACard(Player player, Card card);

    public boolean checkisWinner(Player player) {
        boolean allPlayersDead = true;
        for (Player anotherPlayer : players){
            if (anotherPlayer.getId() != player.getId() && anotherPlayer.checkIsAlive()){
                allPlayersDead = false;
            }
        }

        return  allPlayersDead;
    }
}
