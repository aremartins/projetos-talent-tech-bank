package dia03;

import java.util.Scanner;

public class ExerciciosCorrecao {

    public static void exercicio1() {
        //        1.Construa um algoritmo que leia 10 valores inteiros e positivos e:
        //        -Encontre o maior valor
        //        -Encontre o menor valor
        //        -Calcule a média dos números.
        //        lidos Esse exercício foi dado na aula 3 e agora vamos otimizar ele utilizando o while e for.


        Scanner in = new Scanner(System.in);
        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;
        int somaDosValores = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número\n", i);
            int numero = in.nextInt();

            if (numero < menorValor) {
                menorValor = numero;
            } else if (numero > maiorValor) {
                maiorValor = numero;
            }
            somaDosValores += numero;
        }

        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("O menor valor é: " + menorValor);
        System.out.println("A média dos valores é: " + somaDosValores / 10.0);

        in.close();
    }

    public static void exercicio1DoWhile() {
        //        1.Construa um algoritmo que leia 10 valores inteiros e positivos e:
        //        -Encontre o maior valor
        //        -Encontre o menor valor
        //        -Calcule a média dos números.
        //        lidos Esse exercício foi dado na aula 3 e agora vamos otimizar ele utilizando o while e for.


        Scanner in = new Scanner(System.in);


        int i = 1;
        int somaDosValores = 0;
        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;
        do {

            System.out.printf("Digite o %dº número\n", i);
            int numero = in.nextInt();

            if (numero < menorValor) {
                menorValor = numero;
            } else if (numero > maiorValor) {
                maiorValor = numero;
            }
            somaDosValores += numero;
            i++;
        } while (i < 11);

        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("O menor valor é: " + menorValor);
        System.out.println("A média dos valores é: " + somaDosValores / 10.0);

        in.close();
    }

    public static void exercicio2() {
        // Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número para saber o fatorial");
        int numero = in.nextInt();
        int resultado = 1;

        for (int i = numero; i > 1; i--) {
            resultado = resultado * i;
        }

        System.out.println(resultado);


        in.close();
    }

    public static void exercicio2ComWhile() {
        // Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número para saber o fatorial");
        int numero = in.nextInt();
        int resultado = 1;

        while (numero > 1) {
            resultado = resultado * numero;
            numero--;
        }

        System.out.println(resultado);


        in.close();
    }

    public static void exercicio2ComRecursao() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número para saber o fatorial");
        int numero = in.nextInt();

        System.out.println(fatorialRecursivo(numero));

        in.close();
    }

    public static int fatorialRecursivo(int x) {
        if (x == 0) {
            return 1;
        }

        return x * fatorialRecursivo(x - 1);

    }

    public static void main(String[] args) {

        exercicio2ComRecursao();

    }
}
