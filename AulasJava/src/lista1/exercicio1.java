package lista1;
import java.util.Scanner;
import java.util.ArrayList;
public class exercicio1 {
public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	int num, maior = 0,cont = 0, menor = 9999;
	int acumulo = 0;
	double media = 0;
	System.out.println("Digite um numero: ");
    num = input.nextInt();
	 while(num >= 0){
		
        cont++;
        
        if(num < menor) {
        	menor = num;
        }if(num > maior) {
        	maior = num;
        }
        
        acumulo = acumulo + num;
        media = acumulo /cont;
    	System.out.printf("Maior: %d \n Menor: %d \n Média: %.2f \n ", maior, menor, media);
    	System.out.println("Digite um numero: ");
        num = input.nextInt();
	} 
	
}
}
