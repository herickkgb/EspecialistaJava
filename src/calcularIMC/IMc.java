package calcularIMC;

public class IMc {

	public static void main(String[] args) {
		CalculadoraIMC paciente = new CalculadoraIMC();
		paciente.altura = 1.82;
		paciente.peso = 175;
		Pasciente JOAO = new Pasciente();
		JOAO.altura = 1.82;
		JOAO.peso = 60;

		IndiceMassaCorporal imc = paciente.calcularMassaCorporal(JOAO);

		if (imc.resultado >= 30) {
			System.out.println("Altura " + imc.altura + " peso " + imc.peso + " esta com obesidade ");
		}

		System.out.println("o IMC da pessoa é: " + imc.resultado);

	}

}
