package aula0809__;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            int n = ler.nextInt();
            int i = 1;
            int soma;

            for ( i = 1; i<8; i++ ){
                soma = n / 2 % 0;
                System.out.println(i + "x"+ n + " = " + soma); 
            }

            ler.close();
    }
    

    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("123-8", 1000, 5000);
        System.out.println("saldo:" + cc1.getSaldo() );
        System.out.println("saldo total:" + cc1.consultarSaldoTotal());
        
        ContaPoupança cp1 = new ContaPoupança("789-0", 1000, 2);

        System.out.println("Saldo: " +cp1.getSaldo());
        cp1.atualizarRendimento();
        System.out.println("Saldo após o primeiro rendimento" + cp1.getSaldo());
    }

}













// - seria privado e + public 