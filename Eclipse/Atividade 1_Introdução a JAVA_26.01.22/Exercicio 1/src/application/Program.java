
 // Exercicio 1
 // Fa�a um sistema que leia a idade de uma pessoa 
 // expressa em anos, meses e dias e 
 // mostre-a expressa apenas em dias.

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anos, meses, dias, totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nQuantos anos voc� tem: "); // Entre com a idade.
		anos = (int) leia.nextFloat();
		System.out.print("\nQuantos meses voc� tem: "); // Quantos meses.
		meses = (int) leia.nextFloat();		
		System.out.print("\nQuantos dias voc� tem: "); // Entre dias.
		dias = (int) leia.nextFloat();
		
		totalDias = ((anos * 365) + (meses * 30) + dias);
				System.out.println("\nVoc� tem "+totalDias+" dias de vida"); 
				
		leia.close();	
		
	}

}
