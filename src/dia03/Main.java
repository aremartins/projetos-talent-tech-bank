package dia03;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static int metodoRecursivo(int i) {
        if (i <= 10) {
            return metodoRecursivo(i + 1);
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println("While");
        int contagem = 11;

        while (contagem < 11) {
            System.out.println(contagem);
            contagem++;
        }

        System.out.println("Do while");
        do {
            System.out.println(contagem);
            contagem++;
        } while (contagem < 11);

        // Testando o do while

        boolean condicao = true;

        while (condicao) {
            if (1 > 0) {
                condicao = false;
            }
        }

        do {
            if (1 > 0) {
                condicao = false;
            }
        } while (condicao);

        System.out.println("FOR");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Iterando sobre uma lista com forEach");

        List<Integer> minhaListaDeInteiros = new ArrayList<>();
        minhaListaDeInteiros.add(1);
        minhaListaDeInteiros.add(2);
        minhaListaDeInteiros.add(3);

        minhaListaDeInteiros.forEach(item -> {
            System.out.println(item);
        });

        System.out.println("Iterando sobre a lista com for convencional");

        for (int i = 0; i < minhaListaDeInteiros.size(); i++) {
            System.out.println(minhaListaDeInteiros.get(i));
        }

        int j = 0;

        System.out.println("Iterando sobre a lista com while");

        while (j < minhaListaDeInteiros.size()) {
            System.out.println(minhaListaDeInteiros.get(j));
            j++;
        }

        System.out.println("For each"); // TODO pesquisar o nome exato da técnica

        // For each
        for (int x : minhaListaDeInteiros) {
            System.out.println(x);
        }

        // Repetição com método recursivo
        // Cuidado, pode estourar a pilha de execução do Java, Stack Overflow

        System.out.println("Loop recursivo");
        System.out.println(metodoRecursivo(1));

    }

    // TODO pesquisar cenários melhores para while e do while


    // para (i = 0; i < 10; i++)


}