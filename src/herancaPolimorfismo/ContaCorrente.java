package herancaPolimorfismo;

public class ContaCorrente extends ContaBancaria2{

    public void cobraTarifaMensal(){
        saldo = saldo - (saldo * 0.05);
        System.out.println("Saldo após a tarifa cobrada: " + saldo);
    }

}
