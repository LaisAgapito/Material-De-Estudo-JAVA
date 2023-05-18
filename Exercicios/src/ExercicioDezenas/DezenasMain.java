package Ex2;
import java.util.Scanner;
/* Enunciado:
Qualquer número natural de quatro algarismos pode ser dividido em duas dezenas
formadas pelos seus dois primeiros e dois últimos dígitos. (1297 = 12 e 97; 5314 = 53
e 14). Escreva um algoritmo que lê um número inteiro n (de 4 algarismos) e verifica
se n é igual a raiz quadrada soma das suas dezenas. Ex.: n = 9801, dezenas de n = 98
+ 01, soma das dezenas 99, raiz quadrada de 99 é 9801. */
public class DezenasMain {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
		int num;
		int soma;
		int divi;
		int restoDivi;
		double result;
	System.out.println("Informe um numero de 4 digitos:");	
	num = input.nextInt();
	
	divi = num/100;
	restoDivi = num%100;
	soma = divi + restoDivi;
	result = Math.pow((soma), 2);
	
	if(result == num) {
		System.out.println("A numero informado é igual a raiz quadrada da soma das suas dezenas.");
	}else {
		System.out.println("A numero informado é diferente da raiz quadrada soma das suas dezenas.");
	}
	
	System.out.println("Dez 1:" + divi);
	System.out.println("Dez 2:" + num);
	System.out.println("Soma:" + soma);
	System.out.printf("Result:" + result);
	
	
	
	}
}
