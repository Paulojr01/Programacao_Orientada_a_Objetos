package aula0809__;

public class ContaPoupança extends Conta {
    private double rendimento;

    

    public ContaPoupança(String conta, double saldo, double rendimento) {
        super(conta, saldo);
        this.rendimento = rendimento;
    }

    public void atualizarRendimento (){
        setSaldo(this.getSaldo() * rendimento / 100 + getSaldo());

    }

    public double getRendimento() {
        return rendimento;
    }



    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

}
