package jogo_de_cartas;

public class Player {
    private int life;
    private int id;
    private boolean isAlive;
    public Card[] playerBoard;

    public Player(int id) {
        this.id = id;
        this.life = 100;
        this.isAlive = true;
    }

    public int getLife() {
        return life;
    }

    public int getId() {
        return id;
    }

    public boolean checkIsAlive() {
        if (this.life <= 0){
           this.isAlive = false;
        }
        return this.isAlive;
    }

    public void setLife(int damage) {
        this.life -= damage;
    }
}
