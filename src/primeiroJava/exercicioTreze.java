package primeiroJava;

import java.util.Scanner;

public class exercicioTreze {
	
//	Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário para inserir as notas do semestre,
//	e deve retornar a média final. O programa deve pedir 3 notas, que devem ser números reais,
//	e retornar um número real com 2 casas depois da vírgula, com o texto “Sua média final é:” seguido do valor.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite sua primeira nota:");
		float primeiraNota = entrada.nextFloat();
		System.out.print("Digite sua segunda nota");
		float segundaNota = entrada.nextFloat();
		System.out.print("Digite sua terceira nota");
		float terceiraNota = entrada.nextFloat();
		float media = (primeiraNota + segundaNota + terceiraNota)/3;
		System.out.printf("sua média foi : %.2f",media);

	}

}
