package calcularIMC;

public class CalculadoraIMC {
	double altura;
	int peso;
	
	public IndiceMassaCorporal calcularMassaCorporal(Pasciente pasciente) {
		IndiceMassaCorporal corporal = new IndiceMassaCorporal();
		corporal.resultado = pasciente.peso / (pasciente.altura * pasciente.altura);
		corporal.peso = pasciente.peso;
		corporal.altura = pasciente.altura;
		
		return  corporal;
		
	}
	
	public double getAltura() {
		return altura;
	}
	public int getPeso() {
		return peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
}
