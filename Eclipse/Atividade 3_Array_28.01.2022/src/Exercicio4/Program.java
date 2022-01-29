
// Exercicio 4
// 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
// Ofereça ao usuário um menu de opções:
// (1) somar as duas matrizes 
// (2) subtrair a primeira matriz da segunda 
// (3) adicionar uma constante as duas matrizes
// (4) imprimir as matrizes 
// Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
// Na terceira opção o valor da constante deve ser lido e o resultado da adição da 
// constante deve ser armazenado na própria matriz.

package Exercicio4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] mA = new float[2][2];
		float[][] mB = new float[2][2];
		float[][] mC = new float[2][2];
		int l,c,op,constante;
		Scanner leia = new Scanner(System.in);
		
		for (l=0;l<2;l++) {
			for (c=0;c<2;c++) {
				System.out.print("Entre com valores de mA: ");
				mA[l][c] = leia.nextFloat();
				System.out.print("Entre com valores de mB: ");
				mB[l][c] = leia.nextFloat();
			}
		} do {
				System.out.println("\n-----Selecione uma das opções abaixo-----");
				System.out.println("1-Para somar as duas matrizes;");
				System.out.println("2-Para subtrair a primeira matriz da segunda;");
				System.out.println("3-Adicionar uma constante as duas matrizes;");
				System.out.println("4-Imprimir as 2 matrizes;");
				System.out.println("0-Para Finalizar o programa.");
				System.out.print("Digite sua opção: ");
			
			op = leia.nextInt();
			
			switch (op) {
			case 1: 
				for (l=0;l<2;l++) {
					for(c=0;c<2;c++) {
						mC[l][c] = mA[l][c] + mB[l][c];
						System.out.println("\nSoma: "+mC[l][c]);
					}
				} 
				break;
			case 2:
				for(l=0;l<2;l++) {
					for(c=0;c<2;c++) {
						mC[l][c] = mA[l][c]-mB[l][c];
						System.out.println("\nDiferença é: "+mC[l][c]);
					}
				}
				break;
			case 3:
				System.out.println("\nEntre com o valor da constante: ");
					constante = leia.nextInt();
					for(l=0;l<2;l++) {
						for(c=0;c<2;c++) {
							mA[l][c] += constante;
							mB[l][c] += constante;
							System.out.println("\nmA mais a constante: "+mA[l][c]);
							System.out.println("\nmB mais a constante: "+mB[l][c]);									
						}
					}
				break;
			case 4: 
				for(l=0;l<2;l++) {
					for(c=0;c<2;c++) {
						System.out.println("\nMatris A: "+mA[l][c]);						
					}					
				} for (l=0;l<2;l++) {
					for(c=0;c<2;c++) {
						System.out.println("\nMatris B: "+mB[l][c]);
					}
				}
				break;
				default:
					if(op!=0) {
						System.out.println("Opção Invalida...");
					} else {
						System.out.println("\nPrograma Encerrado! ");
					}
			}
		} 
		while(op != 0);	
		leia.close();
	}
}
