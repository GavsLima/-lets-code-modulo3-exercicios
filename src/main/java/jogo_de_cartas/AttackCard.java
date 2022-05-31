package jogo_de_cartas;

public class AttackCard extends Card implements IAttackCard{
    private int power;
    private int resistence;

    public AttackCard(String name, String type, int cost, int power, int resistence) {
        super(name, type, cost);
        this.power = power;
        this.resistence = resistence;
    }


    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public int getResistence() {
        return this.resistence;
    }
}
