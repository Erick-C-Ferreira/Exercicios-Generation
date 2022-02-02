/*
 Exercicio 1 
 Crie uma classe cliente e apresente os atributos
 e métodos referentes esta classe, em seguida crie um objeto cliente,
 defina as instancias deste objeto e apresente as informações deste 
 objeto no console.
 */

package Exercicio1;

public class ClienteMain {

		public static void main(String[] args) {
				
		Cliente text = new Cliente("Text", 1.75, 79);		
		System.out.println("O seu peso é: "+text.getPeso()+"Kg e o IMC é: "+text.imc());

	}
	}