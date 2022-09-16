package aula0809__;

public class Conta {
    private String conta;
    private Double saldo;

    public Conta(String conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(Double valor){
        this.saldo += valor;
        
    }
    public void sacar (Double valor){
        if (valor <= this.saldo)
            this.saldo -= valor;
    }

    public double consultarSaldo(){
        return saldo;

    }

    public double obterNumero (){
        return saldo;

    }
}

// extends + nome da classe principal ex conta so assim entende que a classe herda da classe mae