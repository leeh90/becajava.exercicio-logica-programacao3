package exercicio3;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		Temperatura temperatura1 = new Temperatura();
		
		System.out.print("Digite a temperatura em Celsius: ");
		temperatura1.ValorC = ler.nextDouble();
		temperatura1.ConverterTemperaturaC(temperatura1.ValorC);


		

		
	}

}