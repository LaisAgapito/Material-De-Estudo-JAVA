package pac;
import java.util.Scanner;
public class exemplo2 {
public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("Informe um numero: ");	
	num = input.nextInt();
	if(num > 0) {
		System.out.println("O numero é positivo: ");
	}else if (num < 0){ 
		System.out.println("O numero é negativo: ");
	}else {
		System.out.println("O numero é nulo: ");
	}
}
}
