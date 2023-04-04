package pac;
import java.util.Scanner;
public class exemplo3 {
public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("Informe um numero: ");	
	num = input.nextInt();
	if((num % 2 == 0) && (num % 5 == 0)) {
		System.out.println("O numero é divisivel por 2 e por 5");
	}else {
		System.out.println("O numero não é divisivel por 2 e/ou 5");
	}
}
}
