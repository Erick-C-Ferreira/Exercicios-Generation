/*
 * Exercicio 2
 * Fa�a um sistema que leia a idade de uma pessoa expressa em dias e 
 * mostre-a expressa em anos, meses e dias. 
 */

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anos, meses, dias, totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a Quantidade de dias: ");
		
		totalDias = (int) leia.nextFloat();
		
		anos = totalDias / 365;
		meses = (totalDias % 365) / 30;
		dias = (totalDias % 365) % 30;
		
		System.out.println("Voc� tem: "+anos+" ano(s)");
		System.out.println("Voc� tem: "+meses+" meses");
		System.out.println("Voc� tem: "+dias+" dia(s)");
				
		leia.close();
		

	}

}
