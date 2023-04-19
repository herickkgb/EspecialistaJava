
public class Pessoa {
	public String nome;
	public String cpf;
	public int anoNascimento;
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", anoNascimento=" + anoNascimento + "]";
	}
	
	
	
}
