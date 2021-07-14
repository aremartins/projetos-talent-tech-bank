package dia06;

public class Exercicios {
	// Dado um array com 20 números, imprimir seus valores de trás para frente.
	// O array começa com 0, logo a última posição sempre será o tamanho do array -1

	public static void exercicio1() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 16, 17, 18, 19, 20 };
		for (int i = array.length; i > 0; i--) {
			System.out.println(array[i - 1]);
		}

	}

	public static void imprimeSoPares() {
		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < vetor.length - 1; i++) {
			System.out.println(vetor[i += 1]);
		}
	}

	// Minha versão pós correção
	public static void ordenacaoDeValores() {
		int[] numeros = { 11, 20, 25, 34, 45, 6, 17, 87, 9 };
		int aux = 0;
		for (int i = 1; i < numeros.length; i++) {
			for (int j = 0; j < i; j++) {
				if (numeros[i] < numeros[j]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}

		}
		for (int k = 0; k < numeros.length; k++) {
			System.out.print(numeros[k] + " - ");
		}
	}

	// resolução feita com o grupo
	public static void resolucaoOrdenacaoGrupo() {
		// valores a serem ordenados
		int vetor[] = { 3, 5, 10, 1, 3 };
		// armazenam o menor valor e o índice do menor valor
		int menor, indiceMenor;

		for (int i = 0; i < vetor.length - 1; i++) {
			// antes de comparar, considera-se menor o valor atual do loop
			menor = vetor[i];
			indiceMenor = i;

			// compara com os outros valores do vetor
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < menor) {
					menor = vetor[j];
					indiceMenor = j;
				}
			}

			// troca os valores menor e maior
			vetor[indiceMenor] = vetor[i];
			vetor[i] = menor;
		}

		// exibe os números na tela
		// String numerosOrdenados = "";
		// for (int n : vetor) {
		// numerosOrdenados += n+"-";
		// }
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "-");

		}
	}

	public static void main(String[] args) {
		ordenacaoDeValores();
	}
}
