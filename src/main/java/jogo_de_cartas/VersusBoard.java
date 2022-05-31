package jogo_de_cartas;

public class VersusBoard extends Board {

    public VersusBoard(Deck[] decks){
        decks = new Deck[2];
        players = new Player[2];

        for (int i = 0; i < players.length; i++){
            players[i] = new Player(i);
        }

        if (decks.length == 2){
            for (int i = 0; i < decks.length; i++){
                if (decks[i].getCards().length == 50){
                    insertDeck(decks[i], i);
                }
            }
        }
    }

    @Override
    public boolean canPlayACard(Player player, Card card) {
        int blankFieldAttackCard = 5;
        int blankFieldSpecialAttackCard = 2;

        Card[] cardsFields = player.playerBoard;

        for (Card c : cardsFields){
            if (c instanceof AttackCard){
                blankFieldAttackCard--;
            }else if (c instanceof SpecialAttackCard){
                blankFieldSpecialAttackCard--;
            }
        }

        if (card instanceof AttackCard && blankFieldAttackCard > 0){
            return true;
        }else if (card instanceof SpecialAttackCard && blankFieldSpecialAttackCard > 0){

            return true;
        }
        return false;
    }
}
