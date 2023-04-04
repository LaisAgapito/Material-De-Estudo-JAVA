package pac;
import java.util.Scanner;
public class emeplo1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); 
		int [] vetor = new int[10];
		int num, i;
		int pos = 0;
		boolean achou = false;
		System.out.println("Informe 10 numeros:");
		for(i = 0; i < 10; i++) {
			vetor[i] = input.nextInt();
		}
		System.out.println("Informe um número a ser buscado:");
		num = input.nextInt();
		for(i = 0; i < 10; i++) {
			if(vetor[i] == num) {
				achou = true;
				pos = i ;
				break;
			}
		}
		if(achou){
			System.out.println("Achou na posição: " + pos);
		}else {System.out.println("Não achou ");
		}
	}	
	}

