package main.java.banco;

public class CuentaNomina extends CuentaBancaria {
	
	public CuentaNomina(String titular, TipoDeCuenta tipo, double saldo){
		super(titular, tipo, saldo);
	}
	
	public CuentaNomina(String titular, double saldo){
		super(titular, saldo);
	}
	
	 public CuentaNomina(){
		super();
	}
	 
	@Override
	public void sacarDinero(double cantidad) {
		if(cantidad < 0) {
			return;
		}
		saldo -= cantidad;
		saldo -= COMISION;
	}
	
	@Override
	public void informarSobreCondicionesLegales() {
		System.out.println("Condiciones legales de la cuenta Ahorro del banco ***");
		System.out.println("Según el acuerdo firmado por usted ...");
		System.out.println("Las condiciones por retirar dinero de su cuenta serán de " + COMISION + " ");
	}


}
