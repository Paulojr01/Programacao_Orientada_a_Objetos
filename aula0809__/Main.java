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
    
}
