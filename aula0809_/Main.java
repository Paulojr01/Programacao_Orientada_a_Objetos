package aula0809_;

public class Main {
    // teste com dados mocados
    // dados mocados e feito direto no parametros () do construtor
    public static void main(String[] args) {
        // primeira variavel estoque1
        Estoque estoque1 = new  Estoque("caneta", 100,1);
        estoque1.setNome("Caneta Azul");
        System.out.println(estoque1.getNome());
        // os get devemos chamada dentro do print se não ele não roda
        // System.out.println(estoque1.getNome()+"\nestoque atual:" + estoque1.getQtdAtual() + "\nestoque min: " + estoque1.getQtdMinima());

        //segunda variavel estoque2
        Estoque estoque2 = new Estoque();
        estoque2.setNome("Apagador");
        estoque2.setQtdAtual(10);
        estoque2.setQtdMinima(2);

        System.out.println(estoque2.getNome () + " Estoque atual " + estoque2.getQtdAtual());



    }
}
