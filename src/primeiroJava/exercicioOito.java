package primeiroJava;
import java.util.Scanner;

public class exercicioOito {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero com casas decimais");
		float numeroEntrada= entrada.nextFloat();
		int convertidoInteiro = Math.round(numeroEntrada);
		
		//System.out.print(numeroEntrada);
		System.out.print(convertidoInteiro);

	}

}
