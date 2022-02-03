package Exercicio2;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade, String som) {
		super (nome, idade, som);
	}
	public void cachorroPasseia() {
		System.out.println(getNome()+" é uma cadelinha bem animada quando esta passeando ela fica abanando o seu rabinho,");
	}
	@Override
	public void emiteSom() {
		System.out.println("e ela está muito feliz e "+getSom()+"durante o passeio pelo parque.");
	}
}
