package pagamentos;

public class ContratoDeTrabalho {
	
	
	public int valorHoraNormal;
	public int ValorHoraExtra;
	
	Trabalhador trabalhador;

	public double verificarSeFuncionarioPossuiFilhos(Trabalhador trabalhador) {
		if(trabalhador.qtdFilhos > 0) {
			for (int i = 0; i < trabalhador.qtdFilhos; i++) {
				double cal1 = (trabalhador.salario / 100) * 10;
				
				 trabalhador.salario  = trabalhador.salario + cal1;
			}
		}
		
		return  trabalhador.salario;
	}
}
