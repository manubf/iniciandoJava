package primeiroJava;

import java.util.Scanner;

public class exercicioDez {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aleatorio = (int) (Math.random() * (5-1) + 1);
		System.out.print("Adivinhe qual número de 1 a 5 eu estou pensando: ");
		int numeroDoUsuario = Integer.parseInt(input.nextLine());
		System.out.print(aleatorio);
		if (numeroDoUsuario != aleatorio){
			System.out.println("\nVocê errou, o número correto era = " + aleatorio);			
		}else {
			System.out.print("\nVocê acertou!");
		}
	}
}
