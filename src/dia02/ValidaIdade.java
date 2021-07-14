package dia02;

public class ValidaIdade {
	public static void main(String[] args) {
		int idade = 18;
		if (idade == 5 && idade ==7 ) {
			System.out.println("infantil A");
			
		}else if(idade >= 8 && idade <= 11) {
			System.out.println("infantil B");
		} else if (idade >= 12 && idade <= 13) {
			System.out.println("juvenil A");
		} else if(idade >=14 && idade <=17 ) {
			System.out.println("juvenil B");
		} else {
			System.out.println("Maiores de 18 anos");
		}
		
	}

}

