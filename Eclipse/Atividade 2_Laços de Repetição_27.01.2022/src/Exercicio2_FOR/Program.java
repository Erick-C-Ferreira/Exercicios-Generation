
// Exercicio 2 - (FOR)
// Ler 10 números e imprimir quantos são pares e quantos são ímpares.
package Exercicio2_FOR;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num, cI=0, cP=0;
		
		for (int n=1; n<10;n++); {
			System.out.println("Informe os Números: ");
			num = leia.nextInt();
			
			if (num % 2 != 0) {
			cI++;
			} else {
			cP++;
		}			
		}
		System.out.println(cI+" numeros sao impar(es) e "+cP+" numero(s) são par(es).");
		leia.close();
	}

}
