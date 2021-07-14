package dia08;

public class CanetaBic extends Caneta {

    String tampaTraseira;

    CanetaBic() {
        this.tubo = "Transparente";
        this.quantidadeDeTinta = 1.0;
        this.anoPatente = 2000;
    }

    @Override
    public String toString() {
        return "CanetaBic{" +
                "tampaTraseira='" + tampaTraseira + '\'' +
                '}' + "\n" + super.toString();
    }

    public String minhaToString() {
        return "Conte�do da caneta BIC\n" + this.toString();
    }

    public String paiToString() {
        return "Conte�do da caneta\n" + super.toString();
    }
}
