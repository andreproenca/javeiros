package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Herbalife;


public class MichelEx01 {

	public static void main(String[] args) {
		// Simular um EVS Herbalife
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int operacao;
		
		System.out.print("Quantos produtos você deseja cadastrar? ");
		int n = sc.nextInt();
		Herbalife[] vect = new Herbalife[n];
		List<Double> list = new ArrayList<>();
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Produto: ");
			String produto = sc.nextLine();
			System.out.print("Valor de Compra: R$ ");
			double vlCompra = sc.nextDouble();
			System.out.print("Valor de Venda: R$ ");
			double vlVenda = sc.nextDouble();
			vect[i] = new Herbalife(produto, vlVenda, vlCompra);
			System.out.print("Quantidade Estoque: ");
			int estoque = sc.nextInt();
			vect[i].addEstoque(estoque);
						
		}
		
		do {
			System.out.println("===========================================");
			System.out.println(" MENU ");
			System.out.println();
			System.out.println(" [1] - Vender Produtos");
			System.out.println(" [2] - Entrada Estoque");
			System.out.println(" [3] - Consultar Estoque");
			System.out.println(" [4] - SAIR");
			System.out.println("===========================================");
			System.out.print("Digite sua operação: ");
			operacao = sc.nextInt();
			
			if (operacao == 1) {
				System.out.print("Qual produto deseja comprar? ");
				int prodVenda = sc.nextInt();
				System.out.print("Quantidade: ");
				int quantidade = sc.nextInt();
				vect[prodVenda].removeEstoque(quantidade);
				list.add(quantidade * vect[prodVenda].getVlVenda());
				
			} else if(operacao == 2) {
				System.out.print("Informe o produto: ");
				int prodEstoque = sc.nextInt();
				System.out.println("Informe a quantidade: ");
				int quantidade = sc.nextInt();
				vect[prodEstoque].addEstoque(quantidade);
			} else if(operacao == 3) {
				
				for (int i=0; i<vect.length; i++) {
					System.out.println(vect[i]);
				}
				
			} else if (operacao == 4){
				System.out.println("");
				System.out.println("Resumo Final do Estoque");
			}			
			
		} while (operacao != 4);
		
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		for (Double x : list) {
			System.out.println(x);
		}
		
		sc.close();

	}

}
