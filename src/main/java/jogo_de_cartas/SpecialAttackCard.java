package jogo_de_cartas;

public class SpecialAttackCard extends AttackCard{
    SpecialEffects specialEffect;

    public SpecialAttackCard(String name, String type, int cost, int power, int resistence, SpecialEffects specialEffect) {
        super(name, type, cost, power, resistence);
        this.specialEffect = specialEffect;
    }

    public SpecialEffects getSpecialEffect() {
        return specialEffect;
    }
}
