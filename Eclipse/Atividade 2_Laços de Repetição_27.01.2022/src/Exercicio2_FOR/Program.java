
// Exercicio 2 - (FOR)
// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
package Exercicio2_FOR;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num, cI=0, cP=0;
		
		for (int n=1; n<10;n++); {
			System.out.println("Informe os N�meros: ");
			num = leia.nextInt();
			
			if (num % 2 != 0) {
			cI++;
			} else {
			cP++;
		}			
		}
		System.out.println(cI+" numeros sao impar(es) e "+cP+" numero(s) s�o par(es).");
		leia.close();
	}

}
