package Entities;

public class ConnectCar {
	
	private String carro;
	private String placa;
	private double carga;
	public static double TAX = 0.10;
	
	public ConnectCar() {
				
	}
	
	public ConnectCar(String carro, String placa) {
		this.carro = carro;
		this.placa = placa;		
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getCarga() {
		return carga;
	}

	public void addCarga(double carga) {
		this.carga += carga - (carga * TAX);
	}
	public void removeCarga(double carga) {
		this.carga -= carga;
	}
	
	public String toString() {
		return "Carro: "
			 +	carro
			 + " Placa: "
			 + placa
			 + " Saldo: R$ "
			 + String.format("%.2f", this.carga);
	}
	
	

}
