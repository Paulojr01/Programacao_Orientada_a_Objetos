// quando criar a classe devesse criar os atributos de forma privada ou protegido
// //static possibilita visibilidade da classe ou metodo dentro do packge.
// public static seria o metodo ou contrutor e aceita somente oq e defindo dentro dos ()
// Os parametros vem aonde o objeto está sendo estanciado  
// Wrappers os tipos primitivos convertido para classe
// 

package aula0809;

public class Aula {

	public static void main(String[] args) {
		boolean b = true;
	    byte bt = 5;
	    char c = 'k';
	    short s = 10;
	    long l = 50;
	    int i = 20;
	    float f = 3.4f;
	    double d = 5.8;
	      
	    Boolean B = new Boolean(b);
	    Byte BT = new Byte(bt);
	    Character C = new Character(c);
	    Short S = new Short(s);
	    Long L = new Long(l);
	    Integer I = new Integer(i);
	    Float F = new Float(f);
	    Double D = new Double(d);
	    
	  //imprime o valor inteiro armazenado em I
	    System.out.println("Valor inteiro de I: " + I.intValue()); 
	      
	     //imprime o valor inteiro armazenado em I2
	    Integer I2 = Integer.valueOf("700");
	    System.out.println("Valor inteiro de I2: " + I2.intValue()); 
	      
	      //imprime o valor de i3
	    int i3 = Integer.parseInt("500");
	    System.out.println("Valor de i3: " + i3); 
	      
	    try{
	          int i4 = Integer.parseInt("cinco");
	          System.out.println("Valor de i4: " + i4); 
	      }
	      catch (NumberFormatException e){
	        System.out.println("Formato numérico inválido");

	      }
	}
}