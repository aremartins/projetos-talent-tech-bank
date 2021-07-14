package dia12_exercicioMetodosEstaticos;

public class ConversaoDeUnidadesDeArea {

	public static final double UM_METRO_QUADRADO_EM_PES_QUADRADOS = 10.76;
	public static final double UM_PE_QUADRADO_EM_CENTIMETROS_QUADRADOS = 929.0;
	public static final double UMA_MILHA_QUADRA_EM_ACRES = 640.0;
	public static final double UM_ACRE_EM_PES_QUADRADOS = 43.560;

	public static Double converteMetrosQuadradosParaPesQuadrados(double metros) {
		return metros * UM_METRO_QUADRADO_EM_PES_QUADRADOS ;
	}
	
	public static Double convertePesQuadradosParaCentimetrosQuadrados(double pes) {
		return pes * UM_PE_QUADRADO_EM_CENTIMETROS_QUADRADOS;
	}
	
	public static Double converteMilhasQuadradasParaAcres (double milha) {
		return milha * UMA_MILHA_QUADRA_EM_ACRES;
	}
	
	public static Double converteAcresEmPesQuadrados (double acres) {
		return acres * UM_ACRE_EM_PES_QUADRADOS;
	}
	

}
