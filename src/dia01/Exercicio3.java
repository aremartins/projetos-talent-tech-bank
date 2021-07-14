package dia01;

import java.util.Scanner;
// calculo da área de um retângulo
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor da base");
        double base = in.nextDouble();
        System.out.println("Digite o valor da altura");
        double altura = in.nextDouble();
        double retangulo  = (base * altura);
        System.out.printf("O valor da área do retângulo é " +  retangulo);

        in.close();

    }
}
