package exercicio3;

public class Temperatura {
	public double ValorC;
	public double ValorF;

	public double ConverterTemperaturaC(double ValorC) {
		ValorF = (9 * ValorC + 160) / 5;

		System.out.print("\n A temperatura convertida � " + ValorF + "�F\n");

		return ValorF;

	}

}
