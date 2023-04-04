package pac;
import java.util.Scanner;
import java.util.Collections;
public class Aula3 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Informe um número: ");
		num =  input.nextInt();
		if (num > 0){
			System.out.println("O numero é positivo");
		}else {
			System.out.println("O numero é não-positivo");
		}
	}

}
