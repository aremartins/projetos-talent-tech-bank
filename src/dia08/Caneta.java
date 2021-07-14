package dia08;

public class Caneta {

    String cor;

    String tubo;

    String ponteira;

    String carga;

    Double tamanhoDaCaneta;

    Double quantidadeDeTinta = 0.5;

    Double peso;

    Integer anoPatente = 1923;

    @Override
    public String toString() {
        return "Caneta{" +
                "cor='" + cor + '\'' +
                ", tubo='" + tubo + '\'' +
                ", ponteira='" + ponteira + '\'' +
                ", carga='" + carga + '\'' +
                ", tamanhoDaCaneta=" + tamanhoDaCaneta +
                ", quantidadeDeTinta=" + quantidadeDeTinta +
                ", peso=" + peso +
                '}';

    }

    public void imprimiQuantidadeDeTinta() {
        System.out.println("Quantidade de tinta = " + this.quantidadeDeTinta);
    }
}


