package Produto;

public class ServicoDePresificacao {
	
	double definirPrecoDeVenda(Produto produto, double percentualMargemLucro) {
		
		double cal1 = (produto.produtoCusto/100) * percentualMargemLucro;
		double resultado = produto.produtoCusto + cal1;
		return  resultado;
	}
}
