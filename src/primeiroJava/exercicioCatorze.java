package primeiroJava;
import java.util.Scanner;

public class exercicioCatorze {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Digite um numero: ");
		int primeiroNumero = scanner.nextInt();
		
		System.out.println("Digite outro numero: ");
		int segundoNumero = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Digite a operacao: “somar”, “subtrair”, “multiplicar” ou \"dividir\" ");
		String operacao = scanner.nextLine();
		
		int resultado = 0;
		
		switch(operacao) {
		  case "somar":
			  resultado = primeiroNumero + segundoNumero;
		    break;
		  case "subtrair":
			  resultado = primeiroNumero - segundoNumero;
		    break;
		  case "multiplicar":
			  resultado = primeiroNumero * segundoNumero;
			break;
		  case "dividir":
			  resultado = primeiroNumero / segundoNumero;
		    break;
		  default:
			  System.out.println("Infelizmente ocorreu um erro ..... ");
		}
		System.out.printf("resultado = %d", resultado);
	}

}
