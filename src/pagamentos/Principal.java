package pagamentos;

public class Principal {

	public static void main(String[] args) {
		Trabalhador trabalhador = new Trabalhador();
		FolhaDePagamento dePagamento = new FolhaDePagamento();
	//	ContratoDeTrabalho contratoDeTrabalho = new ContratoDeTrabalho();
		
		trabalhador.hoarsExtrasTrabalhadas = 20;
		trabalhador.horasTrabalhadas = 10;
		trabalhador.contratoDeTrabalho.ValorHoraExtra = 25;
		trabalhador.contratoDeTrabalho.valorHoraNormal = 20;
		trabalhador.qtdFilhos = 1;
		trabalhador.salario = dePagamento.CalcularSalario(trabalhador);
		
		System.out.println(dePagamento.CalcularSalario(trabalhador));
		
		System.out.print(trabalhador.contratoDeTrabalho.verificarSeFuncionarioPossuiFilhos(trabalhador));

	}

}
