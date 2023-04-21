public class Carro {
	public String fabricante;
	public String modelo;
	public String cor;
	public int anoFabicacao;
	public double precoCompra;
	Pessoa propietario;
	public double ValorRevendaComDepresiação;
	//definição do termo composição em OO -> contrução de objetos que se relaciona com outros Objetos
	
	public void calcularValorRevenda() {
		int tempoDeUso =  anoFabicacao - 2022;
		double revenda = (precoCompra / 20 ) * (20 - tempoDeUso) ;
		if(revenda < 0) {
			revenda = 0;
		}
		System.out.println(revenda);

	}
}
