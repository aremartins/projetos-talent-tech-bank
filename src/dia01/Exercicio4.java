package dia01;

import java.util.Scanner;

//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
// Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero de eleitores:");
        int totalEleitores = in.nextInt();
        System.out.println("Digite o numero de votos brancos:");
        int votosBrancos = in.nextInt();
        System.out.println("Digite o numero de votos nulos:");
        int votosNulos = in.nextInt();
        System.out.println("Digite o numero de votos válidos:");
        int votosValidos = in.nextInt();

        System.out.println("Total eleitores:" + totalEleitores);
        System.out.println("Votos brancos:" + votosBrancos);
        System.out.println("Votos nulos:" + votosNulos);
        System.out.println("Votos válidos" + votosValidos);

        double percentualVotosBrancos = votosBrancos * 100 / totalEleitores;
        double percentualVotosNulos = votosNulos * 100 / totalEleitores;
        double percentualVotosValidos = votosValidos * 100 / totalEleitores;

        System.out.println("O percentual de votos brancos é:" + percentualVotosBrancos +"%");
        System.out.println("O percentual de votos nulos é:" + percentualVotosNulos+"%");
        System.out.println("O percentual de votos válidos é:" + percentualVotosValidos+"%");

        in.close();


    }
}
