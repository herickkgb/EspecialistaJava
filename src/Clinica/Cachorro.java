package Clinica;

public class Cachorro {
	public String nome;
	public String cor;
	public String raça;
	public int idade;
	
	
	public Cachorro(String nome, String cor, String raça, int idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.raça = raça;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public String getCor() {
		return cor;
	}
	public String getRaça() {
		return raça;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String toString() {
		return "Cachorro [nome=" + nome + ", cor=" + cor + ", raça=" + raça + ", idade=" + idade + "]";
	}
	
	
	
}
