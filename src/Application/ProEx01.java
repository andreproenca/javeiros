package Application;

import java.util.Locale;
import java.util.Scanner;

public class ProEx01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		int menor = number;
		int maior = number;
		
		System.out.println("Would you like to type another number (y/n)? ");
		char repeat = sc.next().charAt(0);
		
		while (repeat == 'y') {
			System.out.print("Type a number: ");
			number = sc.nextInt();
			if (number > maior) {
				maior = number;
			}
			if (number < menor) {
				menor = number;
			}
			
			System.out.println("Would you like to type another number (y/n)? ");
			repeat = sc.next().charAt(0);
		}
		
		System.out.println("Last number: " + number);
		System.out.println("Greater number: " + maior);
		System.out.println("Lower number: " + menor);
		
		sc.close();
		
	}

}
