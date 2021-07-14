package dia12_exercicio_Elevadores;

public class Main {
	public static void main(String[] args) {
		Elevador el = new Elevador(500, 10);

		el.statusElevador();
		System.out.println("--------------------");

		el.sobe();
		el.sobe();
		el.sobe();
		el.sobe();
		el.sobe();
		el.sobe();
		el.sobe();
		el.sobe();
		el.sobe();
		el.sobe();
		el.sobe();

		System.out.println("--------------------");

		el.desce();
		el.desce();
		el.desce();
		el.desce();
		System.out.println("--------------------");
		el.statusElevador();

		el.entra();
		el.entra();
		el.entra();
		el.entra();
		el.entra();
		el.entra();
		el.entra();
		el.entra();
		el.entra();
		el.entra();
		el.entra();
		System.out.println("--------------------");

		
		el.statusElevador();

	}

}
