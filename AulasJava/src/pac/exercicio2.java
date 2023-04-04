package pac;
import java.util.Scanner;
public class exercicio2 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double salario, reajuste;
		System.out.println("Informe o valor do salário" );
		salario = input.nextDouble();
		reajuste = salario * 0.05;
		salario = salario + reajuste;
		if(reajuste <= 750) {
			salario = salario + 100;	
		}
		System.out.printf("O valor do salario reajustado é de: %.2f", salario);
		
	}
}
