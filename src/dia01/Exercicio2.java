package dia01;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor para mostrar seu antecessor");
        int valor = in.nextInt();

        System.out.println("O antecessor de " + valor + "é " + (valor-1) );
        in.close();

        //TODO tratar erros de inputs diferentes de um inteiro;
    }

}
