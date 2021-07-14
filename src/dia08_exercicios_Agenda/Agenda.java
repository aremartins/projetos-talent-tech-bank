package dia08_exercicios_Agenda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Agenda {

    private Set<Pessoa> contatos;

    public Agenda() {
        this.contatos = new HashSet<>();
    }

    public void armazenaPessoa(String nome, int anoDeNascimento, double altura, String numeroDoCelular) {
        Pessoa pessoa = new Pessoa(nome, anoDeNascimento, altura, numeroDoCelular);
        contatos.add(pessoa);
    }

    public void removePessoa(String nome, String numeroDoCelular) {
        Pessoa pessoaPraRemover = new Pessoa(nome, null, null, numeroDoCelular);
        contatos.remove(pessoaPraRemover);
    }

    public List<Pessoa> buscaPessoa(String nome) {

        List<Pessoa> pessoasEncontradas = new ArrayList<>();

        for (Pessoa pessoa : contatos) {
            if (pessoa.getNome().contains(nome)) {
                pessoasEncontradas.add(pessoa);
            }
        }

        return pessoasEncontradas;
    }

    public void imprimeAgenda() {
        for (Pessoa pessoa : contatos) {
            System.out.println(pessoa);
        }
    }

    public void listaBuscaDePessoasPeloNome(String nome) {
        System.out.println(this.buscaPessoa(nome));
    }


}
