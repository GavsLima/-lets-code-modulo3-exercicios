package jogo_de_cartas;

public class PartyBoard extends Board {

    public PartyBoard(Deck[] decks) {
        decks = new Deck[5];
        players = new Player[5];

        for (int i = 0; i < players.length; i++){
            players[i] = new Player(i);
        }

        if (decks.length == 5){
            for (int i = 0; i < decks.length; i++){
                if (decks[i].getCards().length == 80){
                    insertDeck(decks[i], i);
                }
            }
        }
    }

    @Override
    public boolean canPlayACard(Player player, Card card) {
        int totalCards = 0;

        for (Player p : players){
            totalCards += p.playerBoard.length;
        }

        return (totalCards < 34);
    }
}
