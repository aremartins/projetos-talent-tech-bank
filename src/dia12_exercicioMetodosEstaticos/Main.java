package dia12_exercicioMetodosEstaticos;

public class Main {
public static void main(String[] args) {
	System.out.println(ConversaoDeUnidadesDeArea.converteMetrosQuadradosParaPesQuadrados(1));
	System.out.println(ConversaoDeUnidadesDeArea.converteMetrosQuadradosParaPesQuadrados(2));
	System.out.println(ConversaoDeUnidadesDeArea.converteMetrosQuadradosParaPesQuadrados(0.5));
	System.out.println(ConversaoDeUnidadesDeArea.converteMetrosQuadradosParaPesQuadrados(1.5));
    System.out.println("---------------");

    System.out.println(ConversaoDeUnidadesDeArea.convertePesQuadradosParaCentimetrosQuadrados(1));
    System.out.println(ConversaoDeUnidadesDeArea.convertePesQuadradosParaCentimetrosQuadrados(2));
    System.out.println(ConversaoDeUnidadesDeArea.convertePesQuadradosParaCentimetrosQuadrados(0.5));
    System.out.println(ConversaoDeUnidadesDeArea.convertePesQuadradosParaCentimetrosQuadrados(1.5));
    System.out.println("---------------");

    System.out.println(ConversaoDeUnidadesDeArea.converteMilhasQuadradasParaAcres(1));
    System.out.println(ConversaoDeUnidadesDeArea.converteMilhasQuadradasParaAcres(2));
    System.out.println(ConversaoDeUnidadesDeArea.converteMilhasQuadradasParaAcres(0.5));
    System.out.println(ConversaoDeUnidadesDeArea.converteMilhasQuadradasParaAcres(1.5));
    System.out.println("---------------");

    System.out.println(ConversaoDeUnidadesDeArea.converteAcresEmPesQuadrados(1));
    System.out.println(ConversaoDeUnidadesDeArea.converteAcresEmPesQuadrados(2));
    System.out.println(ConversaoDeUnidadesDeArea.converteAcresEmPesQuadrados(0.5));
    System.out.println(ConversaoDeUnidadesDeArea.converteAcresEmPesQuadrados(1.5));
}
}
