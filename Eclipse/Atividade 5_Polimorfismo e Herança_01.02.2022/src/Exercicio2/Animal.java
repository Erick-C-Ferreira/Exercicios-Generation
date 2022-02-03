
/*
 Exercicio 2
 Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior 
 e invoque o método que emite o som de cada um de forma polimórfica, isto é, 
 independente do tipo de animal.
 		
		
 */
package Exercicio2;

public abstract class Animal { // Criando Classe 
	//Criando os Atributos
	private String nome;
	private int idade;
	private String som;
	
	abstract public void emiteSom();
	
	public Animal (String nome, int idade, String som) { //Criando método construtor da Super Classe
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;			
	}
	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	public void imprimirInfo() { // Impressão das informações
		System.out.println("Nome: "+nome+" tem idade de "+idade+" anos(s)");
	}
}
