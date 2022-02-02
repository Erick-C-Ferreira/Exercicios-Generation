package Exercicio2;

public class Aviao {
	// atributos
	private String modelo;
	private int passageiros;
	private int ano;
	private String tipo;
	
	//construtor
	public Aviao(String modelo, int passageiros, int ano, String tipo) {
		super();
		this.modelo = modelo;
		this.passageiros = passageiros;
		this.ano = ano;
		this.tipo = tipo;
	}
	public void imprimir() {
		System.out.println("O modelo deste aviao é "+modelo+" do ano de "+ano+" e com capacidade de transportar até "
				+passageiros+" passageiros e é de tipo "+tipo);
	}
	
	// Getters and Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
