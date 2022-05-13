package main.java.banco;
import java.math.BigDecimal;
import java.util.Scanner;

/*
 * Programa que pida por pantalla introducir una cantidad en euros y devuelva la conversion
 * en US Dolares
 * El mensaje con el resultado será: *** euros equivalen a *** US Dolares
 */

public class Conversor {
	public static void main(String[] args) {
		
		System.out.println("Bienvenido al conversor de moneda");
		System.out.println("por favor, introduzca una cantidad en euros y el programa le devolverá la converisón es US dolares");
		
		Scanner scanner = new Scanner(System.in);
		double euros = scanner.nextDouble();
		
		double dolares = 1.09 * euros;
		
		System.out.println(euros + " euros equivalen a " + dolares + " US Dolares");
		
		String eurosString = Double.toString(euros);
		BigDecimal eurosBigDecimal = new BigDecimal(eurosString);
		double tasaDeCambio = 1.09;
		String tasaDeCambioString = Double.toString(tasaDeCambio);
		BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);
		
		BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);
		System.out.println(euros + " euros equivalen a " + dolaresBigDecimal.toString() + " US Dolares");
		
		
		
	}

}
