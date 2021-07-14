package dia02;

import java.util.Scanner;

public class ImprimeMaiorMenor {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número inteiro");

		int num = in.nextInt();
		System.out.println("Digite um número inteiro");

		int num2 = in.nextInt();
		if (!in.hasNextInt()) {
			System.out.println("Digite um número inteiro");
			in.close();
		}
		
		int maior;
		int menor;

		if (num > num2) {
			maior = num;
			menor = num2;
			System.out.println("O número maior é o " + maior);
			System.out.println("O número menor é o " + menor);

		}

	}

}
