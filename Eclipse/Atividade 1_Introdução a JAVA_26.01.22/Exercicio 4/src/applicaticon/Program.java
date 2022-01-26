
// Exercicio 4
// Escreva um sistema que leia três números inteiros e positivos (A, B, C) e 
// calcule a seguinte expressão: 
// D = R + S / 2 , 
// onde,  R = (A+B)^2 e S = (B+C)^2 


package applicaticon;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A, B, C, D, R, S;
		
		Scanner leia =  new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		A = leia.nextFloat();
		System.out.println("Entre com o valor de B: ");
		B = leia.nextFloat();
		System.out.println("Entre com o valor de C: ");
		C = leia.nextFloat();	
		
		R = Math.pow((A + B),2);
		System.out.println("R = "+R);	
		
		S = Math.pow((B + C),2);
		System.out.println("S = "+S);
		
		D = (R + S) /2;
		System.out.println("D = "+D);
		
		leia.close();
		

	}

}
