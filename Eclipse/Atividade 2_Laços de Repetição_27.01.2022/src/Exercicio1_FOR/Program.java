
// Exercicio 1 - (FOR)
// Informar todos os números de 1000 a 1999 que quando divididos por 11
// obtemos resto = 5.

package Exercicio1_FOR;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num = 1000; num <= 1999; num++){
			if(num%11 == 5){
				System.out.println(num+"\n");
		}			
		}		
	}
}
