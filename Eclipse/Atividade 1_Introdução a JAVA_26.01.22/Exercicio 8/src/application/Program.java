
// Exercicio 8
// O custo ao consumidor de um carro novo � a soma do custo de f�brica com 
// a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
// Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
// escrever um sistema que leia o custo de f�brica de um carro e escreva o 
// custo ao consumidor. 

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double custoFabrica, custoConsumidor;		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInsira o valor de Fabrica do veiculo em R$: ");
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = (custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45));
	// Custo do Consumidor =((custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45)), 2)
	// Escrever ("O custo para o consumidor � de R$" + custoConsumidor)
		System.out.printf("O custo para o consumidor � de R$ %.2f",custoConsumidor);
		
		leia.close();
	}

}
