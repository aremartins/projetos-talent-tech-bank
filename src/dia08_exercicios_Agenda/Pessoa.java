package dia08_exercicios_Agenda;

import java.time.Year;
import java.util.Objects;

public class Pessoa {

    private String nome;

    private Integer anoDeNascimento;

    private Double altura;

    private String numeroDeCelular;

    public Pessoa(String nome, Integer anoDeNascimento, Double altura, String numeroDeCelular) {

        this.setNome(nome);
        this.setAnoDeNascimento(anoDeNascimento);
        this.setAltura(altura);
        this.setNumeroDeCelular(numeroDeCelular);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(Integer anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getNumeroDeCelular() {
        return numeroDeCelular;
    }

    public void setNumeroDeCelular(String numeroDeCelular) {
        this.numeroDeCelular = numeroDeCelular;
    }

    public void imprimiTodosOsDadosDaPessoa() {
        System.out.println(this);
    }

    public void mostrarQuantosAnosAhPessoaTeraNoAnoCorrente() {
        if (this.getAnoDeNascimento() == null) {
            System.out.println("Ano de nascimento não informado");
            return;
        }


        Integer anoAtual = Year.now().getValue();
        Integer anosQueAhPessoaTera = anoAtual - this.getAnoDeNascimento();
        System.out.println(anosQueAhPessoaTera);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.getNome() + '\'' +
                ", anoDeNascimento=" + this.getAnoDeNascimento() +
                ", altura=" + this.getAltura() +
                ", numeroDeCelular='" + this.getNumeroDeCelular() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(getNome(), pessoa.getNome()) && Objects.equals(getNumeroDeCelular(), pessoa.getNumeroDeCelular());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumeroDeCelular());
    }
}