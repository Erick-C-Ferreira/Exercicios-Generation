package Exercicio1;

public class Preguica extends Animal{

	private String viveFloresta;
	
	public Preguica(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento, String viveFloresta) {
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		this.setViveFloresta(viveFloresta);
	}
	public void infoPreguica() {
		System.out.print(getNomeAnimal() + " é uma Preguiça com idade de " + getIdadeAnimal() + " anos, ");
		if (isEmiteSom()) {
			System.out.print("Emite um Suspiro");
		}else {
			System.out.print("Não emite som");
		}
		System.out.println(", "+getDeslocamento()+" o tempo todo, ela vive na floresta de "+viveFloresta);
	}

	public String getViveFloresta() {
		return viveFloresta;
	}

	public void setViveFloresta(String viveFloresta) {
		this.viveFloresta = viveFloresta;
	}

}
