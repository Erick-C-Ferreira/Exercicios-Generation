package Exercicio1;

public class Cavalo extends Animal { // 1--Criando SubClasse

	private String corCavalo; // 2--Criando Atributos

	// 3-- Criando m�todo Construtor com heran�as.
	public Cavalo(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento, String corCavalo) {
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		this.corCavalo = corCavalo;
	}
	//4--Criando m�todo Simples
	public void infoCavalo() {
		System.out.print(getNomeAnimal() + " � um cavalo de corrida que tem " + getIdadeAnimal() + " anos, ");
		if (isEmiteSom()) {
			System.out.print("Emite um Relincho");
		}else {
			System.out.print("N�o emite som");
		}
		System.out.println(", "+getDeslocamento()+" o tempo todo, e ele � de cor "+corCavalo);
	}
	//5--Criando Getters and Setters
	public String getCorCavalo() {
		return corCavalo;
	}
	public void setCorCavalo(String corCavalo) {
		this.corCavalo = corCavalo;
	}
	
}
