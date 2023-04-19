
public class Principal {

	public static void main(String[] args) {
		Pessoa eu = new Pessoa();
		eu.nome = "Herick";
		eu.cpf= "13382181746";
		eu.anoNascimento = 1996;
	
		Carro meuCarro = new Carro();
		meuCarro.modelo = "HR-V";
		meuCarro.anoFabicacao = 2021;
		meuCarro.cor = "preto";
		meuCarro.fabricante = "Honda";
		meuCarro.propietario = eu; 
	
		Pessoa voce = new Pessoa();
		voce.nome = "Jão das couves";
		voce.cpf= "999.999.999-99";
		voce.anoNascimento = 1992;
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "X6";
		seuCarro.anoFabicacao = 2022;
		seuCarro.cor = "Branco";
		seuCarro.fabricante = "BMW";
		seuCarro.propietario = voce;
		
		
		System.out.println("Meu Carro");
		System.out.println("---------");
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: "+ meuCarro.anoFabicacao);
		System.out.println("Propietario");
		System.out.println("---------");
		System.out.println("Nome: "+ meuCarro.propietario.nome);
		System.out.println("Cpf: "+ meuCarro.propietario.cpf);
		System.out.println("Ano de nascimento: "+ meuCarro.propietario.anoNascimento);
		
		System.out.println("-----######----");
		
		System.out.println("Meu Carro");
		System.out.println("---------");
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano: "+ seuCarro.anoFabicacao);
		System.out.println("Propietario");
		System.out.println("---------");
		System.out.println("Nome: "+ seuCarro.propietario.nome);
		System.out.println("Cpf: "+ seuCarro.propietario.cpf);
		System.out.println("Ano de nascimento: "+ seuCarro.propietario.anoNascimento);
		
		System.out.println();

	}

}
