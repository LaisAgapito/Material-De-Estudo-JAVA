package aula4;
import java.util.Scanner;
public class exemplo2 {
	public static void main(String [] args) {
		int matriz [][] = new int [3][3];
		// Preenchendo a matriz
		for(int i = 0; i < 3; i++) {
		 for(int j = 0; j < 3; j++) {
		  matriz [i][j] = i + j;
		 }}
		//Imprimindo a matriz
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(matriz[i][j] );
			}
			
		}System.out.println();
	}	
}
