package Exercicio2;

public class Preguica extends Animal {

	public Preguica(String nome, int idade, String som) {
		super(nome, idade, som);		
	} 
	public void preguicaComeFolhas() {
		System.out.println("E "+getNome()+" gosta bastante de ficar se pendurando na árvore");
	}	
	@Override
	public void emiteSom() {
		System.out.println("A preguiça "+getNome()+" esta comendo folhas e "+getSom());		
	}
}
