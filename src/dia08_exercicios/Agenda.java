package dia08_exercicios;

import java.util.ArrayList;

//Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes operações:

//void armazenaPessoa(String nome, int idade, float altura);
//void removePessoa(String nome);
//int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
//void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
//void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.

public class Agenda {
	private ArrayList<Pessoa> contatos;

	@Override
	public String toString() {
		return "Agenda [contatos=" + contatos + "]";
	}

	public Agenda() {
		contatos = new ArrayList<Pessoa>();
	}

	public void armazenaPessoa(Pessoa contato) {
		this.contatos.add(contato);
	}

	public void removePessoa(String nome) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getNome().equals(nome)) {
				this.contatos.remove(i);
			}
		}
	}

	public int buscaPessoa(String nome) {
		int posicao = 0;
		for (int i = 0; i < contatos.size(); i++) {
			if (this.contatos.get(i).getNome().equals(nome)) {
				System.out.println("A posição do contato que você procura é " + i);
				;
				posicao = i;
			}
		}

		return posicao;
	}

	public void imprimeAgenda() {
		for (Pessoa pessoa : contatos) {
			System.out.println(pessoa);
		}

	}

	public void imprimePessoa(int posicao) {
		for (int i = 0; i < contatos.size(); i++) {
			int indice = i;
			if (posicao == indice) {
				System.out.println("Nome: " + this.contatos.get(i).getNome() + "\n" + "Idade: "
						+ this.contatos.get(i).idade() + "\n" + "Altura:" + this.contatos.get(i).getAltura());

			}
		}
	}

}
