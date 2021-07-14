package dia08_exercicios;

import java.time.Year;

//Crie uma classe para representar uma pessoa, com os atributos de nome, ano de nascimento e altura. 
//Crie e também um método para imprimir todos dados de uma pessoa. Crie um método para mostrar quantos anos a pessoa fará/terá neste ano.

public class Pessoa {
	private int anoNascimento;
	private double altura;
	private String nome;

	// Construtor
	public Pessoa(String nome, double altura, int anoNascimento) {
		this.nome = nome;
		this.altura = altura;
		this.anoNascimento = anoNascimento;
	}

	// toString
	@Override
	public String toString() {
		return "Pessoa [anoNascimento=" + anoNascimento + ", altura=" + altura + ", nome=" + nome + "]";
	}

	// método para imprimir
	public void imprimePessoa() {
		System.out.println("Nome: " + this.nome + "\n" + "Altura: " + this.altura + "\n" + "Ano de nascimento: "
				+ this.anoNascimento + "\n" + "Idade: " + idade() + " anos");
	}	
	
	
			

	// calculo idade
	public int idade() {
		Integer anoAtual = Year.now().getValue();
		return anoAtual - this.anoNascimento;
	}

	// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
