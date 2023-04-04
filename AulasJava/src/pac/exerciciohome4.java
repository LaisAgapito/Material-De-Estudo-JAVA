package pac;
import java.util.Scanner;

public class exerciciohome4 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int num, i; 
		int result = 0;
		System.out.println("Digite um numero positivo:");
		num = input.nextInt();
		if(num < 0) {
			System.out.println("Opção invalida. Você não digitou um numero positivo.");
		}else {
		for(i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				result = result + i;
			}
		} System.out.printf("A soma do numeros pares é: %d",result);
		}
	}
}
