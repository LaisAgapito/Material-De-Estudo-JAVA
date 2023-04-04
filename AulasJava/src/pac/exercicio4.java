package pac;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double temp; 
		int conv;
		System.out.println("Digite a temperatura: ");
		temp = input.nextDouble();
		System.out.println("Escolha uma das opções de conversão a baixo: \n 1 - Kelvin(k) \n 2 - Réaumur(Re) \n 3 - Rankine (Ra) \n 4 - Fahrenheit (F)");
		conv = input.nextInt();
		
		switch(conv){
			case 1:
				temp = temp * 1.8 + 32;
				System.out.printf("%.2f K", temp);
				break;
			case 2:
				temp = temp + 273.15;
				System.out.printf("%.2f Re", temp);
				break;
			case 3:
				temp = temp * 1.8 + 0.8;
				System.out.printf("%.2f Ra",temp);
				break;
			case 4:
				temp = temp * 1.8 + 459;
				System.out.printf("%.2f F", temp);
				break;
			
				default: 
					System.out.println("Opção invalida");
		}
	}
}
