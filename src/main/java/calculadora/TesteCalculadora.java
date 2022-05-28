package calculadora;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         var opcao = 0;
        System.out.println("========== CALCULADORA =============");

        do {
            System.out.println("1 - Soma");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Divisao");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();

            System.out.println("");

            switch (opcao){
                case 1:
                    Adicao adicao = new Adicao();
                    System.out.print("Digite o primeiro número: ");
                    var ad1 = scanner.nextFloat();
                    System.out.print("Digite o segundo número: ");
                    var ad2 = scanner.nextFloat();
                    System.out.printf("O resultado é %f \n\n", adicao.calcular(ad1, ad2));
                    break;
                case 2:
                    Subtracao subtracao = new Subtracao();
                    System.out.print("Digite o primeiro número: ");
                    var sub1 = scanner.nextFloat();
                    System.out.print("Digite o segundo número: ");
                    var sub2 = scanner.nextFloat();
                    System.out.printf("O resultado é %f \n\n", subtracao.calcular(sub1, sub2));
                    break;
                case 3:
                    Multiplicacao multiplicacao = new Multiplicacao();
                    System.out.print("Digite o primeiro número: ");
                    var mul1 = scanner.nextFloat();
                    System.out.print("Digite o segundo número: ");
                    var mul2 = scanner.nextFloat();
                    System.out.printf("O resultado é %f \n\n", multiplicacao.calcular(mul1, mul2));
                    break;
                case 4:
                    Divisao divisao = new Divisao();
                    System.out.print("Digite o primeiro número: ");
                    var div1 = scanner.nextFloat();
                    System.out.print("Digite o segundo número: ");
                    var div2 = scanner.nextFloat();
                    System.out.printf("O resultado é %f \n\n", divisao.calcular(div1, div2));
                    break;
            }

        }while (opcao != 0);
        System.out.println("Tchau!");
    }
}
