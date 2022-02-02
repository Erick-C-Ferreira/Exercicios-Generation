package Exercicio1;

public class Cachorro extends Animal { // 1--Criar a SubClasse

	private String racaCachorro; // 2--Criar Atributos

	// 3--Criando método construtor puxando da superClasse e criando da subClasse
	public Cachorro(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento, String racaCachorro) {
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento); // apenas os paramentros das superclass
		this.racaCachorro = racaCachorro;
	}

	// 4-- Criando método para mostar info do cachorro
	public void infoCachorro() {
		System.out.print(getNomeAnimal() + " tem " + getIdadeAnimal() + " anos, ");
		if (isEmiteSom()) {
			System.out.print("Emite um Latido");
		}else {
			System.out.print("Não emite som");
		}
		System.out.println(", "+getDeslocamento()+" o tempo todo, é de raça "+racaCachorro);
	} // 5--Criando Getters e Setters

	public String getRacaCachorro() {
		return racaCachorro;
	}

	public void setRacaCachorro(String racaCachorro) {
		this.racaCachorro = racaCachorro;
	}

}
