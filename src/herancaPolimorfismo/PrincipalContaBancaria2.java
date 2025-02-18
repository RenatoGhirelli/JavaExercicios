package herancaPolimorfismo;

public class PrincipalContaBancaria2 {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.saldo = 100;
        conta.consultarSaldo();
        conta.depositar(2000);
        conta.sacar(2000);
        conta.consultarSaldo();
        conta.cobraTarifaMensal();

    }

}
