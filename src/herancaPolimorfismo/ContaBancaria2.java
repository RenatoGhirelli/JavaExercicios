package herancaPolimorfismo;

public class ContaBancaria2 {

    protected double saldo;



    public void depositar(double valor){
            System.out.println("depositando " + valor);
            saldo += valor;
        }

    public void sacar(double valor) {
        if (saldo >= valor) {
            System.out.println("sacando " + valor);
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo: " + saldo);
    }

}






