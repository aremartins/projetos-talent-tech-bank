package dia03;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[]args){
        fatorial();
    }

    public static void validaSystemInteiro(Scanner in) {
        if (!in.hasNextInt()) {
            System.out.println("Você precisa informar um número do tipo inteiro");
            in.close();
            System.exit(1);
        }
    }

    //Construa um algoritmo que leia 10 valores inteiros e positivos e:
    //Encontre o maior valor
    //Encontre o menor valor
    //Calcule a média dos números lidos Esse exercício foi dado na aula 3 e agora vamos otimizar ele
    // utilizando o while e for
    public static void maiorMenor(){
        Scanner in = new Scanner(System.in);
        int i = 0;
        int maior = 0;
        int menor = 0;
        int soma = 0;
        while( i < 10) {
            System.out.println("Digite um número inteiro:");
            validaSystemInteiro(in);
            int num = in.nextInt();
            if (num > maior){
                maior = num;
            }
            menor = maior;
            if (num < menor) {
                menor = num;
            }
            soma = soma + num;
            i++;

        }
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(soma);

        in.close();
    }



    public static void fatorial() {
        // Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        validaSystemInteiro(in);
        int fatorial = in.nextInt();
        int resultado = fatorial;

        for(int i = 1; i < fatorial; i ++){
            resultado = resultado * i;
        }
        System.out.println(resultado);
    }

}

