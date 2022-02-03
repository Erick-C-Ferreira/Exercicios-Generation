package Exercicio2;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade, String som) {
		super(nome, idade, som);
		}
	public void cavaloGalopa() {
		System.out.println("O Cavalo "+getNome()+" esta galopando pelo esbulo");
	}
	@Override
	public void emiteSom() {
		System.out.println("e ele esta bem feliz apos o seu banho e "+getSom()+" bastante");
	}

}
