package aula5;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class exercicio1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int rece;
		
		System.out.println("Digite um numero:");
		rece = input.nextInt();
		
		while(rece != -1) {
			if(!numeros.contains(rece)) {
				numeros.add(rece);
			}else {
				System.out.println("O numero já existe no conjunto");
				
			}
			System.out.println("Digite um numero:");
			rece = input.nextInt();
		}
		System.out.println("Conjunto ordenado:");
		Collections.sort(numeros);
		System.out.println(numeros.toString());
	}

}
