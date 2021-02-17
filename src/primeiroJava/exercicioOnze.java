package primeiroJava;

import java.util.Scanner;

public class exercicioOnze {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite sua idade com numerais: ");
		String idade = entrada.nextLine();
		int idadeNumeral = Integer.parseInt(idade);
		String status = (idadeNumeral >= 18) ? "adulto" : "menor de idade";
		System.out.format("você é : %s ", status);
		
	}

}
