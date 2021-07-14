package dia12_exercicio_Elevadores;

//Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
//Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
//Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
//Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
//Sobe : para subir um andar (não deve subir se já estiver no último andar);
//Desce : para descer um andar (não deve descer se já estiver no térreo);

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int terreo = 0;
	private int totalPessoas;

	public Elevador(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares - this.terreo;
		this.andarAtual = 0;
		this.totalPessoas = 0;
	}

	public void statusElevador() {
		System.out.println("Capacidade: " + this.capacidade);
		System.out.println("Total de andares:" + this.totalAndares);
		System.out.println("Andar atual: " + this.andarAtual);

	}

	public int getTotalPessoas() {
		return totalPessoas;
	}

	public void setTotalPessoas(int totalPessoas) {
		this.totalPessoas = totalPessoas;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getTerreo() {
		return terreo;
	}

	public void setTerreo(int terreo) {
		this.terreo = terreo;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares - 1;
	}

	public void entra() {
		if (this.totalPessoas < this.capacidade) {
			this.totalPessoas += 50;
			System.out.println("Pode entrar");
		} else {
			System.out.println("Elevador lotado. Aguarde o próximo!");
		}
	}

	public void sai() {
		if (this.totalPessoas > 0) {
			this.capacidade -= this.totalPessoas;
			System.out.println("Saindo.");
		} else {
			System.out.println("Elevador vazio.");
		}
	}

	public void sobe() {
		if(this.andarAtual <= this.totalAndares ) {
			this.andarAtual += 1;
			System.out.println("subindo");
		}else {
			System.out.println("Último andar");

		}
	}

	public void desce() {
		if (this.andarAtual > 0) {
			this.andarAtual -= 1;
			System.out.println("Descendo");
		} else {

			System.out.println("Estamos no térreo");

		}
	}

}
