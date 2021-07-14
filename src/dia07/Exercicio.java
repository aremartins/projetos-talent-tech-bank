package dia07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		exercicio6();
	}

	// Escreva um algoritmo que leia números insira em um array e após mostre os
	// números informados na tela.

	public static void exercicio1() {

		Scanner in = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um número:");
			lista.add(in.nextInt());
		}
		System.out.println(lista);

		in.close();

	}

	public static void exercicio1ComArray() {

		Scanner in = new Scanner(System.in);

		System.out.println("Exercício 1 criado com array ao invés de lista.");

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número:");
			numeros[i] = in.nextInt();
		}

		System.out.println("Posso imprimir convertendo para String");
		System.out.println(Arrays.toString(numeros));

		System.out.println("Posso imprimir usando o forEach ou de outras formas");
		for (int numero : numeros) {
			System.out.println(numero);
		}

		in.close();

	}
//Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números negativos.	

	public static void exercicio2() {

		Scanner in = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um número:");
			int num = in.nextInt();
			if (num < 0) {
				lista.add(num);
			}

		}

		System.out.println("Temos " + lista.size() + " negativos");

		in.close();
	}

	public static void exercicio2ComArray() {
		Scanner in = new Scanner(System.in);

		int[] numeros = new int[5];
		int contador = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um número:");
			numeros[i] = in.nextInt();
			if (numeros[i] < 0) {
				contador++;
			}
		}
		System.out.println("Temos " + contador + " números negativos");
		in.close();
	}

	public static void exercicio2ListVariacao() {
		Scanner in = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número");
			lista.add(in.nextInt());
		}

		int quantidade = 0;
		for (Integer numero : lista) {
			if (numero < 0) {
				quantidade++;
			}
		}
		System.out.println(quantidade);
		// Outra forma de imprimir (Java mais moderno)
		System.out.println(lista.stream().filter(numero -> numero < 0).count());
		in.close();
	}

//Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares

	public static void exercicio3() {
		Scanner in = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um número:");
			int num = in.nextInt();
			if (num % 2 == 0) {
				lista.add(num);
			}

		}

		System.out.println("Temos " + lista.size() + " pares");

		// Outra forma de fazer o exercício:
		for (int j = 0; j < 5; j++) {
			System.out.println("Digite um número");
			lista.add(in.nextInt());

		}

		int quantidade = 0;
		for (Integer numero : lista) {
			if (numero % 2 == 0) {
				quantidade++;
			}
		}
		System.out.println(quantidade);
		// Imprimindo com lambda:
		System.out.println(lista.stream().filter(numero -> numero % 2 == 0).count());
	}

//Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor
	public static void exercicio4() {
		Scanner in = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();
		int maior = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um número:");
			lista.add(in.nextInt());
			if (lista.get(i) > maior) {
				maior = lista.get(i);
			}
		}
		System.out.println("O maior número é " + maior);

		// Outras formas de fazer:
		int maiorValor = lista.get(0);
		for (Integer numero : lista) {
			if (numero > maiorValor) {
				maiorValor = numero;
			}
		}
		System.out.println(maiorValor);
		// Outra forma de imprimir:
		System.out.println(Collections.max(lista));

		// imprimindo com lambda:
		System.out.println(lista.stream().max(Integer::compare).get());

		// mapToInt
		System.out.println(lista.stream().mapToInt(v -> v).max().getAsInt());
		in.close();

	}

//Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar uma 
//palavra chutando cada letra em no máximo 10 chutes, caso o usuario acerte a letra o jogo dirá 
//que ele acertou, caso tenha errado, o numero de tentativas vai diminuindo. Caso o numero de
//tentativas chegue a 0 o usuário perde.

	public static void exercicio5() {

		String[] palavra = { "b", "i", "c", "i", "c", "l", "e", "t", "a" };

		Scanner in = new Scanner(System.in);

		int forca = 1, vencer = 0, perder = 0, contador = 0;

		String letra;
		String[] letrasDigitadas = new String[20];

		while (true) {
			int existePalavra = 0;
			System.out.println("Digite a letra:");
			letra = in.next();
			letrasDigitadas[contador] = letra;
			for (String letrasDigitada : letrasDigitadas) {
				if (letrasDigitada != null) {
					if (letrasDigitada.equals(letra)) {
						existePalavra++;
					}
				}
			}

			if (!(existePalavra > 1)) {
				for (int i = 0; i < palavra.length; i++) {
					if (palavra[i].equals(letra)) {
						System.out.println("Letra correta.");
						vencer++;
						break;
					} else {
						if (i == 4) {
							System.out.println("Letra inexistente.");
							perder++;
						}
					}
				}
				if (perder == 10) {
					System.out.println("Você perdeu.");
					System.exit(1);
				} else if (vencer == 7) {
					System.out.println("Voce venceu.");
					System.exit(1);
				}
			} else {
				System.out.println("Essa letra já foi digitada.");
			}
			contador++;
			in.close();
		}
	}

	// Exercicio 5 Corrigido
	public static void exercicio5Corrigido() {
		// Escreva um algoritmo que simula um jogo da forca simples.
		// o usuario precisara adivinhar uma palavra chutando cada letra em no máximo 10
		// chutes,
		// caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado,
		// o numero de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0
		// o usuário perde.

		Scanner in = new Scanner(System.in).useDelimiter("\n");

		System.out.println("Jogador 1, escolha a palavra que deverá ser adivinhada!");
		String palavraParaSerAdivinhadaInput = in.next();

		System.out.println("Jogador 1, dê uma dica sobre a palavra");
		String dicaDaPalavraParaSerAdivinhada = in.next();

		palavraParaSerAdivinhadaInput = palavraParaSerAdivinhadaInput.trim();

		int maximoDeChutes = 10;

		char[] palavraParaSerAdivinhada = palavraParaSerAdivinhadaInput.toCharArray();

		List<Boolean> listaDeLetrasAcertadas = new ArrayList<>();
		for (char x : palavraParaSerAdivinhada) {
			listaDeLetrasAcertadas.add(false);
		}

		System.out.println("Agora é a vez do jogador 2...");
		System.out.printf("Sua dica é %s\n", dicaDaPalavraParaSerAdivinhada);

		while (maximoDeChutes > 0 && listaDeLetrasAcertadas.contains(false)) {
			System.out.println("Jogador 2, chute uma letra");
			char chute = in.next().charAt(0);

			boolean errouOhChute = true;
			for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
				if (chute == palavraParaSerAdivinhada[i]) {
					listaDeLetrasAcertadas.set(i, true);
					errouOhChute = false;
				}
			}

			if (errouOhChute) {
				maximoDeChutes--;
				System.out.printf("Agora você só tem %s chutes\n", maximoDeChutes);
			}

			for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
				if (listaDeLetrasAcertadas.get(i)) {
					System.out.printf("%s ", palavraParaSerAdivinhada[i]);
				} else {
					System.out.print("_ ");
				}
			}
			System.out.println();

		}

		System.out.println("------------------------------");
		if (!listaDeLetrasAcertadas.contains(false)) {
			System.out.println("Jogador 2 ganhou o jogo");
		} else {
			System.out.println("Jogador 1 ganhou o jogo");
		}

		in.close();
	}

	public static void exercicio5CorrecaoProfessor() {
		// Escreva um algoritmo que simula um jogo da forca simples.
		// o usuario precisara adivinhar uma palavra chutando cada letra em no máximo 10
		// chutes,
		// caso o usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado,
		// o numero de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0
		// o usuário perde.

		Scanner in = new Scanner(System.in).useDelimiter("\n");

		System.out.println("Jogador 1, escolha a palavra que deverá ser adivinhada!");
		String palavraParaSerAdivinhadaInput = in.next();

		System.out.println("Jogador 1, dê uma dica sobre a palavra");
		String dicaDaPalavraParaSerAdivinhada = in.next();

		palavraParaSerAdivinhadaInput = palavraParaSerAdivinhadaInput.trim();

		int maximoDeChutes = 10;

		char[] palavraParaSerAdivinhada = palavraParaSerAdivinhadaInput.toCharArray();

		List<Boolean> listaDeLetrasAcertadas = new ArrayList<>(
				Collections.nCopies(palavraParaSerAdivinhada.length, false));

		System.out.println("Agora é a vez do jogador 2...");
		System.out.printf("Sua dica é %s\n", dicaDaPalavraParaSerAdivinhada);

		while (maximoDeChutes > 0 && listaDeLetrasAcertadas.contains(false)) {
			System.out.println("Jogador 2, chute uma letra");
			char chute = in.next().charAt(0);

			boolean errouOhChute = true;
			for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
				if (chute == palavraParaSerAdivinhada[i]) {
					listaDeLetrasAcertadas.set(i, true);
					errouOhChute = false;
				}
			}

			if (errouOhChute) {
				maximoDeChutes--;
				System.out.printf("Agora você só tem %s chutes\n", maximoDeChutes);
			}

			for (int i = 0; i < palavraParaSerAdivinhada.length; i++) {
				if (listaDeLetrasAcertadas.get(i)) {
					System.out.printf("%s ", palavraParaSerAdivinhada[i]);
				} else {
					System.out.print("_ ");
				}
			}
			System.out.println();

		}

		System.out.println("------------------------------");
		if (!listaDeLetrasAcertadas.contains(false)) {
			System.out.println("Jogador 2 ganhou o jogo");
		} else {
			System.out.println("Jogador 1 ganhou o jogo");
		}

		in.close();
	}

	// Dado um array de números inteiros com valores negativos e positivos, encontro
	// o número mais próximo de zero.
	// Se ouver valores como 2 e -2, considere o número positivo.

	public static void exercicio6() {
		Scanner in = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();
		for (int j = 0; j < 5; j++) {
			System.out.println("Informe um número:");
			int num = in.nextInt();
			lista.add(num);
		}

		int menor = lista.get(0);
		int menorPositivo = Integer.MAX_VALUE;
		int menorNegativo = Integer.MIN_VALUE;
		for (int k = 0; k < lista.size(); k++) {
			if (lista.get(k) < menorPositivo && lista.get(k) > 0) {
				menorPositivo = lista.get(k);
			}
			if (lista.get(k) > menorNegativo && lista.get(k) < 0) {
				menorNegativo = lista.get(k);
			}

		}

		System.out.println("O número mais proximo de zero é: ");
		System.out.println((menorPositivo <= Math.abs(menorNegativo) ? menorPositivo : menorNegativo));
		in.close();

	}

	public static void desafio() {
		// Dado um array de números inteiros com valores negativos e positivos, encontro
		// o número mais próximo de zero.
		// Se houver valores como 2 e -2, considere o número positivo.

		int[] vetor = { 3, 4, 5, 6, 2, 3, 4, 5, 6, 8, 100, -1, -9, 1 };
		// int[] vetor = {3, 4, 5, 6, 2, 3, 4, 5, 6, 8, 100};
		int indiceDoMenorValor = 0;

		for (int i = 0; i < vetor.length; i++) {
			boolean oValorEMaisPertoDeZero = Math.abs(vetor[i]) < Math.abs(vetor[indiceDoMenorValor]);
			boolean oValorEMaisPertoDeZeroEPositivo = Math.abs(vetor[i]) == Math.abs(vetor[indiceDoMenorValor])
					&& vetor[i] > vetor[indiceDoMenorValor];

			if (oValorEMaisPertoDeZero || oValorEMaisPertoDeZeroEPositivo) {
				indiceDoMenorValor = i;
			}
		}

		System.out.printf("O valor mais próximo de zero é : %d", vetor[indiceDoMenorValor]);

	}

}
