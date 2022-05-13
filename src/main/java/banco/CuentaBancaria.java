package main.java.banco;

public abstract class CuentaBancaria {
	
	// Variables de instancia
	
		private String titular;
		private TipoDeCuenta tipoDeCuenta;
		protected double saldo;
		
		// Constantes - Se escribe public static para que las constantes sean publicas
			
		//	public static final String TIPO_AHORRO = "ahorro";
		//	public static final String TIPO_NOMINA = "nómina";
		
		protected final double COMISION = 1.2;
		
	// Constructores
		
		public CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo){
			this.titular = titular;
			this.tipoDeCuenta = tipo;
			this.saldo = saldo;
		}
		
		public CuentaBancaria(String titular, double saldo){
			this(titular, TipoDeCuenta.AHORRO, saldo);
		}
		
		 public CuentaBancaria(){
			this("", TipoDeCuenta.AHORRO, 0);
		}
		
	// Métodos / void significa que el método no devuelve ningún valor
	
		public void sacarDinero(double cantidad) {
			if (cantidad < 0) {
				return;
			}
			saldo-= cantidad;
		}
		
		public void ingresarDinero(double cantidad) {
			if (cantidad < 0) {
				return;
			}
			saldo += cantidad;	
		}
		
		 public void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo) {
			tipoDeCuenta = nuevoTipo;
		}
		
		public double obtenerSaldo() {
			return saldo; // la sentencia return es la ultima que se tiene que ejecutar
		}
		
		public abstract void informarSobreCondicionesLegales();
			
		}
 // CuentaBancaria

	
	
	
		

