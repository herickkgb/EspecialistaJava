package Produto;

public class Principal {

	public static void main(String[] args) {
		//calcualr porcentagem do produto

		ServicoDePresificacao servicoDePresificacao = new ServicoDePresificacao();
		
		
		Produto feijao = new Produto();
		feijao.produtoCusto = 985;
		
	//	feijao.preçoVenda = servicoDePresificacao.definirPrecoDeVenda(feijao, 20);
		
		System.err.println(servicoDePresificacao.definirPrecoDeVenda(feijao, 25));

	}
	
	

}

