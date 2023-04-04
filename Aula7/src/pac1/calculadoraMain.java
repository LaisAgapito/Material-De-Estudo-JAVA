package pac1;
import java.util.Scanner;
public class calculadoraMain {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		pseudoCalculadora calculadora = new pseudoCalculadora();
		int num1, num2;
		System.out.println("Informe o primero número:");
		num1 = input.nextInt();
		calculadora.setX(num1);
		System.out.println("Informe o segundo número:");
		num2 = input.nextInt();
		calculadora.setY(num2);
		System.out.println("Soma: " + calculadora.soma());
		System.out.println("Subtração: " + calculadora.subtracao());
		System.out.println("Multiplicação : " + calculadora.multiplicacao());
		System.out.println("Divisão: " + calculadora.divisao());
	}
}
