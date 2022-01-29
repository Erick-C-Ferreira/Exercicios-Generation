
// Exercicio 2
// Faça um programa que receba 6 números inteiros e mostre: 
// • Os números pares digitados;  
// • A soma dos números pares digitados; 
// • Os números ímpares digitados; 
// • A quantidade de números ímpares digitados.

package Exercicio2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[6];
		int somaPar=0, somaImpar=0;
		Scanner leia = new Scanner(System.in);

		for (int n = 0; n < 6; n++) {
			System.out.print("Informe um numero: ");
			num[n] = leia.nextInt();
			if (num[n] % 2 == 0) {
				somaPar += num[n];
			} else {
				somaImpar++;
			}
		}
		System.out.println("\nOs numeros pares foram: ");
		for (int n = 0; n < 6; n++) {
			if (num[n] % 2 == 0) {
				System.out.print(num[n] + ", ");
			}
		}
		System.out.println("\nA soma dos numeros pares é: " + somaPar);
		System.out.println("\nOs numeros impares foram: ");
		for (int n = 0; n < 6; n++) {
			if (num[n] % 2 != 0) {
				System.out.print(num[n] + ", ");
			}
		}
		System.out.println("\nA quantidade de numeros Impares foi: " + somaImpar);
		leia.close();
	}
}
