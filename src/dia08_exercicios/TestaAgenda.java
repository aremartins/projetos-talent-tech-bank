package dia08_exercicios;

public class TestaAgenda {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		Pessoa aretha = new Pessoa("Aretha", 1.73, 1999);
		Pessoa mauricio = new Pessoa("Mauricio", 1.88,  1984);
		Pessoa rebecca = new Pessoa("Rebecca", 1.74, 2008);
		Pessoa isabele = new Pessoa("Isabele", 1.73, 1995);
		Pessoa mateus = new Pessoa("Matheus", 1.89, 2007);
		Pessoa carol = new Pessoa("Caroline", 1.67, 2001);
		Pessoa luan = new Pessoa("Luan", 1.89, 2005);
		Pessoa aline = new Pessoa("Aline", 1.59, 1987);
		Pessoa rafa = new Pessoa("Rafaela", 1.67, 2015);
		Pessoa gabriel = new Pessoa("Gabriel", 1.90, 2000);
		
		agenda.armazenaPessoa(aretha);
		agenda.armazenaPessoa(mauricio);
		agenda.armazenaPessoa(rebecca);
		agenda.armazenaPessoa(isabele);
		agenda.armazenaPessoa(mateus);	
		agenda.armazenaPessoa(carol);
		agenda.armazenaPessoa(luan);
		agenda.armazenaPessoa(aline);
		agenda.armazenaPessoa(rafa);
		agenda.armazenaPessoa(gabriel);	
		
		System.out.println("Buscar contato");
		agenda.buscaPessoa("Aretha"); 
		
		System.out.println("******************************");
		
		
		System.out.println("Imprime por indice");
		agenda.imprimePessoa(0);
		System.out.println("*****************************");
		agenda.imprimePessoa(1);
		System.out.println("*****************************");
		agenda.imprimePessoa(3);
		System.out.println("*****************************");
		agenda.imprimePessoa(2);
		System.out.println("*****************************");
		agenda.imprimePessoa(4);
		System.out.println("*****************************");
		agenda.imprimePessoa(5);
		System.out.println("*****************************");
		agenda.imprimePessoa(6);
		System.out.println("*****************************");
		agenda.imprimePessoa(7);
		System.out.println("*****************************");
		agenda.imprimePessoa(8);
		System.out.println("*****************************");
		agenda.imprimePessoa(9);
		System.out.println("*****************************");
		agenda.imprimePessoa(10);
		System.out.println("*****************************");
		
		System.out.println("*****************************");
		System.out.println("Método para remover contato");
		agenda.removePessoa("Matheus");
		
		System.out.println("*****************************");
		System.out.println("Imprime todos os contatos");
		agenda.imprimeAgenda();
		
	}
}
