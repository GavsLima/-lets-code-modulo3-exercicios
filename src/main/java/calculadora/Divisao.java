package calculadora;

public class Divisao implements Calculo{
    @Override
    public float calcular(float num1, float num2) {
        if (num2 != 0){
            return num1 - num2;
        }else {
            System.out.println("Não é possível dividir um número por 0");
            return 0;
        }
    }

}
