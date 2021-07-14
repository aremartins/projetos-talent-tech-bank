package dia04;

import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
		caracteresiv();
	}

	public static void calculoPotencias() {

		Scanner in = new Scanner(System.in);
		System.out.println("Calculadora de potênciação");

		System.out.println("Digite o valor da base");
		int base = in.nextInt();

		System.out.println("Digite o valor do expoente");
		int expoente = in.nextInt();

		int resultado = 1;

		for (int i = 1; i <= expoente; i++) {
			resultado = base * resultado;
		}

		System.out.println(base + " elevado " + "a " + expoente + "=" + resultado);
		in.close();
	}

	public static void caracteresii() {

		System.out.println("ii");

		for (int linha = 0; linha <= 10; linha++) {
			for (int coluna = 0; coluna <= 10; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void caracteresiii() {

		System.out.println("iii");

		for (int linha = 0; linha <= 10; linha++) {
			for (int coluna = 0; coluna <= 10; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void caracteresiv() {

		System.out.println("iv");

		int linhas = 5;
		for (int j = 1; j <= linhas; j++) {
			int k = linhas - 1;
			while (k > 0) {
				System.out.print("*");
				k += 1;
			}
		}
	}
}

