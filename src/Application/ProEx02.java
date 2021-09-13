package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.ConnectCar;

public class ProEx02 {

	public static void main(String[] args) {
		// Proença Exercicio 02 - ConnectCar
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Carro: ");
		String carro = sc.nextLine();
		System.out.print("Placa: ");
		String placa = sc.nextLine();
		ConnectCar cc = new ConnectCar(carro, placa);
		
		System.out.print("Deseja fazer uma primeira carga (y/n)? ");
		char escolha = sc.next().charAt(0);
		double carga = 0.00;
		if (escolha == 'y') {
			System.out.print("Digite o valor da carga: ");
			carga = sc.nextDouble();
			cc.addCarga(carga);
			
		}
		
		System.out.println("ConnectCar");
		System.out.println(cc);
		
		System.out.print("Debitar Estacionamento: ");
		carga = sc.nextDouble();
		cc.removeCarga(carga);
		
		System.out.println("Updated Data:");
		System.out.println(cc);
		
		System.out.print("Digite o Valor da Recarga: ");
		carga = sc.nextDouble();
		cc.addCarga(carga);
		
		System.out.println("Updated Data:");
		System.out.println(cc);

		
		sc.close();

	}

}
