package dia13_projeto_codersBank;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente titular, double saldo) throws Exception {
		super(titular, saldo);

	}

	public void saca(double valorSaque) throws Exception {
		if (valorSaque <= 0) {
			System.out.println("Valor deve ser maior do que 0.");
		} else {
			if (this.getSaldo() < valorSaque && valorSaque <= 1000) {
				this.saldo -= valorSaque;
				System.out.println("***************************************");
				System.out.println("Você entrou no cheque especial. Valor: " + Math.abs(getSaldo()));
			} else if (valorSaque > this.saldo && valorSaque > 1000) {
				System.out.println("***************************************");
				System.out.println("Limite indisponível");
			} else if (this.saldo >= valorSaque) {
				this.saldo -= valorSaque;
				System.out.println("Saque realizado com sucesso!");
			}

		}
	}
	

}
