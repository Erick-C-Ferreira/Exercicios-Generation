/* 
   Exercicio 3-	
   Crie uma um programa para trabalhar com estoque de uma loja, 
   o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, 
   o programa deverá atender as seguintes funcionalidades:

		Armazenar dados da List
		Remover dados da list;
		Atualizar dados da list.
		Apresentar todos os dados da list. 
 */
package Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner (System.in);
		
		ArrayList<String> estoque = new ArrayList<>();
		
		do {
			System.out.println("----Controle de Estoque----");			
			System.out.println("\nSelecione uma das seguintes opções abaixo para: ");
			System.out.println("\n(1) Adicionar um produto ao estoque.");
			System.out.println("\n(2) Remover um produto do estoque.");
			System.out.println("\n(3) Atualizar um produto do estoque.");
			System.out.println("\n(4) Mostrar todos os produtos do estoque.");
			System.out.println("\n(0) Encerrar o programa!");
			System.out.println("--------------------------------------------------");
			System.out.println("Digite sua opção: ");
			op = leia.nextInt();
			
			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o nome do produto para adicionar ao estoque: ");
				String produtoAdc = leia.nextLine();
				estoque.add(produtoAdc);
				System.out.println("----Adição de produto realizada com sucesso!----");
				break;

			case 2:
				leia.nextLine();
				System.out.println("Digite o nome do produto que deseja remover: ");
				String produtoRemove = leia.nextLine();
				if (estoque.contains(produtoRemove)) {
					estoque.remove(produtoRemove);
					System.out.println("----Produto Removido----");
				} else {
					System.out.println("\nProduto não encontrado, Favor dar entrada no mesmo..");
				} System.out.println(estoque);
				
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				String prodAtualizado = leia.nextLine();
				System.out.println("\nDigite o produto que entrará no lugar do(a) "+prodAtualizado+" :");
				String prodnovo = leia.nextLine();				
				if (estoque.contains(prodAtualizado)) {
					estoque.remove(prodAtualizado);
					estoque.add(prodnovo);
					System.out.println("----Produto Atualizado----");					
				} else {
					System.out.println("\n----Produto não Encontrado----");
				} System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nOs produtos que temos no estoque são: ");
				System.out.println(estoque);
				break;
				
			default:
				if(op == 0) {
				System.out.println("\nObrigado por utilizar o nosso sistema, Agradecemos a Prefrencia.");
				} else {
					System.out.println("\n----Opção Invalida! Tente novamente----");
				}					
			}
		} while (op != 0);
		leia.close();
	}
}
		