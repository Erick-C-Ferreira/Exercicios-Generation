
// Exercicio 7
// Um sistema de equações lineares do tipo: 
// ax + by = c
// dx + ey = f , pode ser resolvido segundo mostrado abaixo:
// 							X = ce - bf/ ae - bd     Y = af - cd/ ae - bd
// Escreva um sistema que lê os coeficientes a,b,c,d,e e f 
// e calcula e mostra os valores de x e y
package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A, B, C, D, E, F, X, Y;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe valor de A: ");
		A = leia.nextDouble();
		System.out.println("Informe valor de B: ");
		B = leia.nextDouble();
		System.out.println("Informe valor de C: ");
		C = leia.nextDouble();
		System.out.println("Informe valor de D: ");
		D = leia.nextDouble();
		System.out.println("Informe valor de E: ");
		E = leia.nextDouble();
		System.out.println("Informe valor de F: ");
		F = leia.nextDouble();
		
		X = ((C * E) - (B * F)) / ((A * E) - (B * D)); // X = ce - bf/ ae - bd 
		Y = ((A * F) - (C * D)) / ((A * E) - (B * D)); // Y = af - cd/ ae - bd
		
		System.out.println("O valor de X é: "+X+"\nO valor de Y é: "+Y);		
		
		leia.close();

	}

}
