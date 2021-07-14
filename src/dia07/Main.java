package dia07;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] vetor = { 1, 2, 3, 4 };
		
		Arrays.sort(vetor);

		// Integer i = 0;//int
		// Short s=0 //short
		// Long l =0l //long
		// Float f=0f //float
		// Double d=0.0 //double
		// Character c='a'//char
		// String str = "";

		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.remove(0);
		System.out.println(lista);

		List<Integer> lista2 = new ArrayList<>();

		for (int v : vetor) {
			lista2.add(v);
		}

		System.out.println("Lista convertida de int para Integer"); // boxing
		System.out.println(lista2);
		
		
		
		List<Double> notas = new ArrayList<>(Arrays.asList(2d, 3d, 4d));

		notas.remove(2);
		
		System.out.println("Utilizando método remove em um List");
		System.out.println(notas);
		

		System.out.println("for each");
		for (Double nota : notas) {
			System.out.println(nota);
		}
		
		System.out.println("for i");
		for(int j = 0; j < notas.size(); j++) {
			System.out.println(notas.get(j));
		}
		
		System.out.println("For lambda");
		notas.stream().forEach(nota -> System.out.println(nota));
		
		System.out.println("For lambda reduzido");
		notas.forEach(System.out::println);
		
		System.out.println("Tentando converter uma lista de Integer em um array");
		List<Integer> listaDeIntegers = new ArrayList<>();
		listaDeIntegers.add(1);
		listaDeIntegers.add(2);
		listaDeIntegers.add(3);
		
		//Integer[] novoArrayDeObjetos =(Integer[])listaDeIntegers.toArray();
		//não é possível
		
		//Exemplo split
		char[] palavraSplitada = "paljgasfnsan".toCharArray();
		System.out.println(Arrays.toString(palavraSplitada));
		
		// Criando array de dias da semana
		String[] diasDaSemanaArray = new String[7];
		// Outra forma de criarmos um array é
		// Desta forma criamos o array ja inicializando com valores.
		String[] diasDaSemanaArrayAtribuido = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };
		
		// Criando ArrayList de dias da semana
		ArrayList<String> diasDaSemana = new ArrayList<>();
		// ou
		ArrayList<String> diasDaSemanaAtribuido = new ArrayList<>(Arrays.asList("Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"));
		
		for (int indiceArray = 0; indiceArray < diasDaSemanaAtribuido.size(); indiceArray++) {
		    System.out.println(diasDaSemanaAtribuido.get(indiceArray));
		}

	}
}
