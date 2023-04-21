package pagamentos;

public class Trabalhador {
	int horasTrabalhadas;
	int hoarsExtrasTrabalhadas;
	int valorHoraNormal;
	int ValorHoraExtra;
	public String nome;
	public int qtdFilhos;
	
	double salario;
	
	ContratoDeTrabalho contratoDeTrabalho = new ContratoDeTrabalho();
	
	public Trabalhador(int horasTrabalhadas, int hoarsExtrasTrabalhadas, int valorHoraNormal, int valorHoraExtra) {
		this.horasTrabalhadas = horasTrabalhadas;
		this.hoarsExtrasTrabalhadas = hoarsExtrasTrabalhadas;
		this.valorHoraNormal = valorHoraNormal;
		ValorHoraExtra = valorHoraExtra;
	}

	public Trabalhador() {
	}
	
	
	
	
}
