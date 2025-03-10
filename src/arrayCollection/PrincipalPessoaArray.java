package arrayCollection;

import java.util.ArrayList;


public class PrincipalPessoaArray {
    public static void main(String[] args) {

        PessoaArray pessoa1 = new PessoaArray();
        PessoaArray pessoa2 = new PessoaArray();
        PessoaArray pessoa3 = new PessoaArray();

        ArrayList<PessoaArray> listaDePessoas = new ArrayList<>();

        pessoa1.setNome("Renato");
        pessoa1.setIdade(21);

        pessoa2.setNome("Bia");
        pessoa2.setIdade(18);

        pessoa3.setNome("Dora");
        pessoa3.setIdade(66);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho atual da lista de pessoas: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));

        System.out.println("Lista de Pessoas:");
        for (PessoaArray pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

    }
}
