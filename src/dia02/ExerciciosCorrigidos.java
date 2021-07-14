package dia02;

import java.util.Scanner;

public class ExerciciosCorrigidos {


    public static void exercicio1() {
        // 1. Escreva um algoritmo que armazene o valor 99 em uma vari�vel Y e o valor 11 em uma vari�vel Z.
        // A seguir (utilizando apenas atribui��es entre vari�veis) troque os seus conte�dos fazendo com que o valor
        // que est� em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram armazenados nas vari�veis.

        short y = 99; // Anderson
        short z = 11; // Leonardo
        short coringa; // Geane


        // short resultado = (short) (y - z);
        // Pesquisar mais sobre arithmetic entre shorts

        System.out.printf("O valor da vari�vel y antes da troca � = %d\n", y);
        System.out.printf("O valor da vari�vel Z antes da troca � = %d\n", z);

        coringa = y;
        y = z;
        z = coringa;

        System.out.println("O valor da vari�vel y depois da troca � = " + y);
        System.out.println("O valor da vari�vel Z depois da troca � = " + z);
    }

    public static void exercicio2() {
        // Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor para mostrar seu antecessor");
        int valor = in.nextInt();

        // int antecessor = valor - 1;
        // tratar erros de inputs diferentes de inteiros

        System.out.println("O Antecessor de " + valor + " �: " + --valor);
        System.out.println(valor);
        in.close();
    }

    public static void exercicio3() {
        // Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura),
        // calcular e escrever a �rea do ret�ngulo.

        // A = b x h
        Scanner in = new Scanner(System.in);
        System.out.println("Qual a base do ret�ngulo?");
        double base = in.nextDouble();
        System.out.println("Qual a altura do ret�ngulo?");
        double altura = in.nextDouble();

        double area = base * altura;

        System.out.println("A �rea desse ret�ngulo �: " + area);

        in.close();
    }


    public static void exercicio4() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o total de votos brancos");

        if (!in.hasNextInt()) {
            System.out.println("Voc� n�o digitou um valor v�lido, encerrando o programa...");
            System.exit(1);
        }

        double totalDeVotosBrancos = in.nextInt();

        System.out.println("Digite o total de votos nulos");
        double totalDeVotosNulos = in.nextInt();

        System.out.println("Digite o total de votos validos");
        double totalDeVotosValidos = in.nextInt();

        double totalDeVotos = totalDeVotosBrancos + totalDeVotosValidos + totalDeVotosNulos;

        System.out.println("A quantidade de votos �: " + totalDeVotos);

        System.out.println("A quantidade de votos brancos �: " + totalDeVotosBrancos);

        System.out.println("A quantidade de votos nulos �: " + totalDeVotosNulos);

        System.out.println("A quantidade de votos v�lidos �: " + totalDeVotosValidos);

        double percentualVotosBrancos, percentualVotosNulos, percentualVotosValidos;

        percentualVotosBrancos = totalDeVotosBrancos * 100 / totalDeVotos;
        percentualVotosNulos = totalDeVotosNulos * 100 / totalDeVotos;
        percentualVotosValidos = totalDeVotosValidos * 100 / totalDeVotos;


        System.out.println("----");
        System.out.println("O percentual total de votos em branco �: " + percentualVotosBrancos + "%");
        System.out.println("O percentual total de votos nulos �: " + percentualVotosNulos + "%");
        System.out.println("O percentual total de votos v�lidos �: " + percentualVotosValidos + "%");


        in.close();
    }

    public static void main(String[] args) {
        exercicio4();

    }

}
