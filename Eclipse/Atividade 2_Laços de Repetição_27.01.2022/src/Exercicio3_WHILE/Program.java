
// Exericio 3_WHILE
// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
// 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
// idade for =-99.
package Exercicio3_WHILE;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner leia = new Scanner(System.in);
			int idade,tp50=0, tp21=0;
			System.out.println("Informe a Idade: ");
			idade = leia.nextInt();
			
			while(idade !=99) {
				if(idade >=50) {
					tp50++;
				}else if(idade <= 21) {
					tp21++;
					
				} System.out.println("Informe a Idade: ");
				idade = leia.nextInt();
			} System.out.println("\tO numero de pessoas com 50 anos ou mais foi de: "+tp50);
				System.out.println("\tE o número de pessoas com 21 anos ou menos foi de: "+tp21);
			leia.close();
		}
				
}
