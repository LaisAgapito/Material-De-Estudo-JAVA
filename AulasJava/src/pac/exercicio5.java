package pac;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int num = 1;
		System.out.println("While");
		while(num <= 10) {
			System.out.println(num);
			num += 1;
		}
		num = 1;
		System.out.println("DO While");
		do {
			System.out.println(num);
		    num += 1;
		}while(num <= 10);
		
		System.out.println("FOR");
		for(num = 1; num <= 10; num++) {
			System.out.println(num);
		}
	}
}
