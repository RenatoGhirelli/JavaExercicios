package arrayCollection;

import java.util.ArrayList;


public class ContaBancariaArrayList {

    private String numeroDaConta;
    private double saldo;

    public ContaBancariaArrayList(String numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;

    }

    @Override
    public String toString() {
        return "Número da conta: " + numeroDaConta + "\nSaldo: " + saldo + "\n";
    }

    public static void main(String[] args) {

        ContaBancariaArrayList conta1 = new ContaBancariaArrayList("123456", 500);
        ContaBancariaArrayList conta2 = new ContaBancariaArrayList("789789", 999);
        ContaBancariaArrayList conta3 = new ContaBancariaArrayList("666666", 2500);
        ContaBancariaArrayList conta4 = new ContaBancariaArrayList("987654", 100);
        ContaBancariaArrayList conta5 = new ContaBancariaArrayList("567563", 1000);
        ContaBancariaArrayList conta6 = new ContaBancariaArrayList("787851", 0);



        ArrayList<ContaBancariaArrayList> lista = new ArrayList<ContaBancariaArrayList>();
        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);
        lista.add(conta4);
        lista.add(conta5);
        lista.add(conta6);

        ContaBancariaArrayList contaMaiorSaldo = lista.get(0);

        for (ContaBancariaArrayList conta : lista) {

            if (conta.saldo > contaMaiorSaldo.saldo ) {

                contaMaiorSaldo = conta;

            }
        }

        System.out.println("Conta com o maior saldo:");
        System.out.println(contaMaiorSaldo);
    }

}

