package aula0809__;

public class ContaCorrente extends Conta {

    private Double limite;

    public ContaCorrente(String conta, double saldo, double limite) {
        super(conta, saldo);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double consultarSaldoTotal (){
        return limite + getSaldo();
        
    }

    public double consultarLimite(){
        return limite;
    }

    public void alterarLimite(double alterar){

    }
}
