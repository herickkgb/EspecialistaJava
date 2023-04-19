package Clinica;

public class MainClinica {

	public static void main(String[] args) {
		Cachorro side = new Cachorro("side", "Preto", "Base", 7);
		Cachorro tazan = side;
		
		System.out.println(side.toString());
		tazan.setNome("Caramelo");
		System.out.println(tazan.getNome());
		System.out.println(side.toString());
	}

}
