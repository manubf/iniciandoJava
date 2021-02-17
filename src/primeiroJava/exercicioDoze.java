package primeiroJava;

import java.util.Scanner;

public class exercicioDoze {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numeral: ");
		String numeralStr = entrada.nextLine();
		int numero = Integer.parseInt(numeralStr);
		String verificaPar = (numero%2 == 0 ) ? "par" : "impar";
		System.out.format("você digitou um numeral: %s ", verificaPar);
		
	}

}
