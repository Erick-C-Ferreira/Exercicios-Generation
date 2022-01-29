
// Exercicio 3
// Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

package Exercicio3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int [][] matriz = new int[3][3];
				
		for (int i=0; i<2;i++) {
			for (int j=0;j<2;j++) {
				System.out.print("Entre com o valor da posição ["+i+"] ["+j+"]: ");
				matriz[i][j] = leia.nextInt();
				}
		}
		int cont=0;
		for (int i=0; i<2;i++) {
			for (int j=0;j<2;j++) {
			if(matriz[i][j] > 10) {	
				cont++;
				}
			}
		}
		System.out.println(cont+" valores sao maior que 10");
		leia.close();	
	}
	
}
