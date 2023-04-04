package pac;
import java.util.Scanner;
public class exercicio1 {
public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	double nota1, nota2, nota3, nota4, media;
	System.out.println("Digite a primeira nota:");
	nota1 = input.nextDouble();
	System.out.println("Digite a segunda nota:");
	nota2 = input.nextDouble();
	System.out.println("Digite a terceira nota:");
	nota3 = input.nextDouble();
	System.out.println("Digite a quarta nota:");
	nota4 = input.nextDouble();
	media = nota1 + nota2 + nota3 + nota4 / 4;
	if(media >= 6.0) {
		System.out.printf("APROVADO. O valor da média é: %.2f ", media);
	}else {
		System.out.printf("REPROVADO. O valor da média é: %.2f ", media);
	}
	
}
}
