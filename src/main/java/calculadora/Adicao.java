package calculadora;

public class Adicao implements Calculo {

    @Override
    public float calcular(float num1, float num2) {
        return num1 + num2;
    }
}
