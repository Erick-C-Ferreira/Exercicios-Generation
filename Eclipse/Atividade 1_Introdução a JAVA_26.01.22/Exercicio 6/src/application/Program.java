
// Exercicio 6
// Construa um programa em c que, tendo como dados de entrada 
// dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
// escreva a distância entre eles. A fórmula que efetua tal cálculo é:
// D = Raiz(X2-X1)^2 + (Y2 - Y1)^2

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d, x1, x2, y1, y2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com X1: ");
		x1 = leia.nextDouble();
		System.out.println("Entre com X2: ");
		x2 = leia.nextDouble();
		System.out.println("Entre com Y1: ");
		y1 = leia.nextDouble();
		System.out.println("Entre com Y2: ");
		y2 = leia.nextDouble();
		
		d = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.println("Distancia entre dois pontos é: "+d);
	
		leia.close();

	}

}
