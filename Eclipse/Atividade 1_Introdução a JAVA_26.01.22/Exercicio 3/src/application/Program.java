
/* 
 * Exericio 3
 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica
 * expressa em segundos e 
 * mostre-o expresso em 
 * horas, minutos e segundos
 */
package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int totalSegundos, horas, minutos, segundos; 
		
		System.out.println("Entre com o total de segundos: ");
		totalSegundos = leia.nextInt();
		
		horas = totalSegundos / 3600;
		minutos = (totalSegundos % 3600) / 60;
		segundos = (totalSegundos % 3600) % 60;
		
		System.out.printf("\nO evento durou: "+horas+" Hora");
		System.out.printf("\nO evento durou: "+minutos+" minutos");
		System.out.printf("\nO evento durou: "+segundos+" Segundos");
			
		leia.close();
	}
	

}
