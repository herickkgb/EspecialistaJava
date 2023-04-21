package pagamentos;

public class FolhaDePagamento {
	
	double CalcularSalario(int qtdHorasTrabalhadas,int qtdHorasExtras, int valorNormal, int valorHoraExtra) {
		int calculoporHoraNormal = qtdHorasTrabalhadas * valorNormal;
		int calculoHoraExtra = qtdHorasExtras * valorHoraExtra;
		
		return calculoporHoraNormal + calculoHoraExtra;
		
	}
	
	
	double CalcularSalario(Trabalhador trabalhador) {
		int calculoporHoraNormal = trabalhador.horasTrabalhadas * trabalhador.contratoDeTrabalho.valorHoraNormal;
		int calculoHoraExtra = trabalhador.hoarsExtrasTrabalhadas * trabalhador.contratoDeTrabalho.ValorHoraExtra;
		
		return calculoporHoraNormal + calculoHoraExtra;
		
	}
	
	
	
}
