package main.java.cajero;
import java.util.Scanner;

/*
 Programa que emula la interfaz de un cajero automático. El programa presentará las siguientes
 
 	Elija una de las siguientes opciones:
 		Escriba 1 para consultar su saldo
 		Escriba 2 para ingresar dinero
 		Escriba 3 para sacar dinero
 		Escriba 4 para consultar sus ultimos movimientos
 	Una vez escrita la opción, pulse la tecla Enter
 	
 	
  	Una vez el usuario ha elegido la opción, el programa le mostrará por pantalla el numero correspondiente a la opcion elegida
 */
public class Interfaz {
	public static void main(String[] args) {
		
		System.out.println("Por favor introduzca su número de identificación");
		Scanner scanner = new Scanner(System.in);
		String identificador = scanner.nextLine();
		System.out.println("por favor introduzca su contraseña");
		String contraseña = scanner.nextLine();
		CajeroAutomatico cajero = new CajeroAutomatico(identificador, contraseña);
		
		int  opcionSeleccionada;
		do {
			System.out.println("Elija una de las siguientes opciones:");
			System.out.println("	Escriba 1 para consultar su saldo");
			System.out.println("	Escriba 2 para ingresar dinero");
			System.out.println("	Escriba 3 para sacar dinero");
			System.out.println("	Escriba 4 para consultar sus últimos movimientos");
			System.out.println("	Para salir escriba cualquier otro numero");
			
			 opcionSeleccionada = scanner.nextInt();
			
			switch (opcionSeleccionada) {
			
			case 1:
				cajero.mostrarSaldo();
				break;
			case 2:
				cajero.ingresarDinero();
				break;
			case 3:
				cajero.sacarDinero();
				break;
			case 4:
				cajero.consultarUltimosMovimientos();
				break;
			default:
				cajero.salir();
			}
			
		} while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4);
		
		
		
	}
	

}
