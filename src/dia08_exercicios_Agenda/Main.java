package dia08_exercicios_Agenda;

import java.time.Year;
import java.util.Objects;

import java.util.Scanner;

public class Main {


    public static void exercicio1() {
        Pessoa pessoa = new Pessoa("Anderson Rocha", 1990, 1.80, "19 9 9999 0000");
        pessoa.imprimiTodosOsDadosDaPessoa();
        pessoa.mostrarQuantosAnosAhPessoaTeraNoAnoCorrente();

        System.out.println("-----------------");

        Pessoa pessoa2 = new Pessoa(null, null, null, null);
        pessoa2.imprimiTodosOsDadosDaPessoa();
        pessoa2.mostrarQuantosAnosAhPessoaTeraNoAnoCorrente();


        System.out.println("Diferenca entre == e equals");

        String asd1 = "asd";
        String asd2 = "asd";
        String asd3 = "asd";
        String asd4 = "as" + "d";

        System.out.println(System.identityHashCode(asd1));
        System.out.println(System.identityHashCode(asd2));
        System.out.println(System.identityHashCode(asd3));
        System.out.println(System.identityHashCode(asd4));

        System.out.println(1 == 1);
        System.out.println(asd1.equals(asd2));
        System.out.println(asd3.equals(asd4));


        String a = "Anderson";

        String b = " Anderson ";

        System.out.println(a.equals(b.trim()));

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b.trim()));


        // Comparação de números
        System.out.println("Comparação de números");

        Integer i1 = 10;

        Integer i2 = 20;

        Integer i3 = i2 - i1;

        System.out.println(i1 == i2);

        System.out.println(i1 == i2 - i3);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");

        Agenda agenda = new Agenda();

        System.out.println("Bem vindo a sua agenda");

        Boolean programaEmExecucao = true;

        while (programaEmExecucao) {

            System.out.println("Escolha uma das opções");
            System.out.println("(1) - Adicionar novo contato");
            System.out.println("(2) - Remover contato");
            System.out.println("(3) - Buscar pessoa pelo nome");
            System.out.println("(4) - Mostrar todos os contatos");
            System.out.println("(0) Para sair");

            Short opcao = in.nextShort();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato");
                    String nome = in.next();

                    System.out.println("Digite o ano de nascimento");
                    Integer ano = in.nextInt();

                    System.out.println("Digite a altura");
                    Double altura = in.nextDouble();

                    System.out.println("Digite o número de celular");
                    String numeroDeCelular = in.next();

                    System.out.println("-----------------------");
                    agenda.armazenaPessoa(nome, ano, altura, numeroDeCelular);
                    System.out.println("-----------------------");
                    break;
                case 2:
                    System.out.println("Digite o nome do contato para remover");
                    String nomeParaRemover = in.next();

                    System.out.println("Digite o celular da pessoa pra remover");
                    String numeroDeCelularParaRemover = in.next();
                    agenda.removePessoa(nomeParaRemover, numeroDeCelularParaRemover);
                    break;
                case 3:
                    System.out.println("Digite o nome do contato para buscar");
                    String nomeParaBuscar = in.next();


                    System.out.println("-----------------------");
                    agenda.listaBuscaDePessoasPeloNome(nomeParaBuscar);
                    System.out.println("-----------------------");


                    break;
                case 4:
                    System.out.println("-----------------------");
                    agenda.imprimeAgenda();
                    System.out.println("-----------------------");

                    break;
                case 0:
                    programaEmExecucao = false;
                    break;
            }


        }

        in.close();

    }

}