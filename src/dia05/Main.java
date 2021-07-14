package dia05;

import java.util.Scanner;

public class Main {

    // Revisão e exercícios de fixação loops


    public static void exercicio1() {
        // Faça um programa que calcula o exponencial a partir de sua base e sua potencia
        // Por exemplo, 2 elevado a 3 = 8

        Scanner in = new Scanner(System.in);

        int base;
        int potencia;
        int resultado = 1;

        System.out.println("Informe o valor da base");
        base = in.nextInt();

        System.out.println("Informe o valor da potencia");
        potencia = in.nextInt();

        for (int i = 1; i <= potencia; i++) {
            // resultado = resultado * base;
            resultado *= base;
        }

        System.out.println("Resultado: " + resultado);

        System.out.println(Math.pow(base, potencia));

        in.close();


    }

    public static void exercicio2I() {
        int i = 4;
        while (i > 0) {
            System.out.println("**********");
            i--;
        }

        System.out.println("");
    }

    public static void exercicio2II() {

        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void exercicio2III() {

        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int k = linhas - i;

            while (k > 0) {
                System.out.print("  ");
                k--;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}