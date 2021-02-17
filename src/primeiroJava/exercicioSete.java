package primeiroJava;
import java.util.Scanner;

public class exercicioSete {

	public static void main(String[] args) {
		/*
		 * Crie um programa em Java que, utilizando a classe Scanner, pergunte ao
		 * usuário seu sobrenome, depois seu nome, e então escreva na tela, em uma única
		 * “string”, o nome completo do usuário.
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome:");
		String nome = entrada.nextLine();
		System.out.print("Digite seu sobrenome:");
		String sobrenome  = entrada.nextLine();
		System.out.format("olá %s %s!", nome, sobrenome);		

	}

}
