package aula4;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); 
		int [] vetor = new int[10];
		int num, i;
		int cont = 0;
		System.out.println("Informe 10 numeros:");
		for(i = 0; i < 10; i++) {
			vetor[i] = input.nextInt();
		}
		System.out.println("Informe um número a ser buscado:");
		num = input.nextInt();
		for(i = 0; i < 10; i++) {
			if(vetor[i] == num) {
				cont ++;
			}
		}
		System.out.println("O numero " + num + " foi repitido " + cont + " vezes.");
	}
}
