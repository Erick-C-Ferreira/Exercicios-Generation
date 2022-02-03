package Exercicio2;

public class AnimalMain {

	public static void main(String[] args) {
		Cachorro dog1 = new Cachorro ("Mel",12,"Latindo Au..Au..Au..");
		Cavalo cav1 = new Cavalo ("Caramelo",8,"Relichando");
		Preguica preg1 = new Preguica ("Seven",7,"Murmurando,");
		
		dog1.imprimirInfo();
		System.out.print("\n");
		cav1.imprimirInfo();
		System.out.print("\n");
		preg1.imprimirInfo();
		
		System.out.println("---------------------------------");
		
		dog1.cachorroPasseia();
		dog1.emiteSom();
		
		
		System.out.println("----------------------------------");
		
		cav1.cavaloGalopa();
		cav1.emiteSom();
		
		
		System.out.println("----------------------------------");
		
		preg1.emiteSom();
		preg1.preguicaComeFolhas();
	}

}
