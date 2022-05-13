package main.java.cajero;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import main.java.banco.CuentaAhorro;
import main.java.banco.CuentaBancaria;
import main.java.mock.GeneradorAleatorioDeMovimiento;

public class CajeroAutomatico {
	
	private CuentaBancaria cuentaBancariaActual;
	
	protected CajeroAutomatico (String identificador, String contraseña) {
		double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50000);
		cuentaBancariaActual = new CuentaAhorro("Nombre cualquiera", cantidadAleatoria);
	}
	
	protected void mostrarSaldo() {
		System.out.println("Su saldo es " + cuentaBancariaActual.obtenerSaldo());
	} 	// método mostrar saldo
	
	protected void ingresarDinero() {
		System.out.println("¿Cuánto dinero quiere ingresar?");
		Scanner scanner = new Scanner(System.in);
		double cantidad = scanner.nextDouble();
		cuentaBancariaActual.ingresarDinero(cantidad);
	} 	// método ingresar dinero
	
	protected void sacarDinero() {
		System.out.println("¿Cuánto dinero quiere sacar?");
		Scanner scanner = new Scanner(System.in);
		double cantidad = scanner.nextDouble();
		cuentaBancariaActual.sacarDinero(cantidad);
	}	// método sacar dinero
	
	protected void consultarUltimosMovimientos() {
		GeneradorAleatorioDeMovimiento generadorAleatorioDeMovimiento = new GeneradorAleatorioDeMovimiento();
		System.out.println("¿Cuántos movimientos quiere consultar?");
		Scanner scanner = new Scanner(System.in);
		int numeroDeMovimientos = scanner.nextInt();
		ArrayList<String> movimientos = generadorAleatorioDeMovimiento.obtenerMovimientos(numeroDeMovimientos, "euros");
		mostrarMovimientos(movimientos);
		
	} 	// método consultar ultimos movimientos
	
	protected void mostrarMovimientos(ArrayList<String> movimientos) {
		for(String movimiento: movimientos) {
			System.out.println(movimiento);
		}
	}
	
	protected void salir() {
		System.out.println("Muchas gracias por utilizar nuestros servicios");
	}	// método para salir
	
}

