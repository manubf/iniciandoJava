package primeiroJava;

import java.util.Scanner;

public class exercicioNove {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.print("Digite um nome qualquer: ");
	String nome = entrada.nextLine();
	int contagemNome = nome.length();
	System.out.print(contagemNome);
	}
}
