package jogo_de_cartas;

public abstract class Card {
    private String name;
    private String type;
    private int cost;

    public Card(String name, String type, int cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }
}
