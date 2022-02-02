package Exercicio1;

public class Main {

	public static void main(String[] args) {
		Cachorro dog1 = new Cachorro("Mel", 15, true, "anda", "Pitcher");
		Cavalo cav1 = new Cavalo("EG é um ", 20, true, " e gosta de galopar", "Preta");
		Preguica pg1 = new Preguica("Alt é uma ", 5, true, " e sobe na arvore", "madagascar");

		dog1.infoCachorro();
		System.out.println("-----------------------------------------------------------");
		cav1.infoCavalo();
		System.out.println("-----------------------------------------------------------");
		pg1.infoPreguica();
	}
}
