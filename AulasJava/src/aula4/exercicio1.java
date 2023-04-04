package aula4;
import java.util.Scanner;
import java.util.ArrayList;
public class exercicio1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); 
		int [] vetor = new int[10];
		int num, i;
		int pos = 0;
		System.out.println("Informe 10 numeros:");
		for(i = 0; i < 10; i++) {
			vetor[i] = input.nextInt();
		}for(i = 0; i < 10; i++) {
			if(vetor[i] % 2 == 0) {
				pos = i;
				System.out.println("O numero " + vetor[i] + " da posição " + i + " é par.");
			}
			
		}
	}	
}
