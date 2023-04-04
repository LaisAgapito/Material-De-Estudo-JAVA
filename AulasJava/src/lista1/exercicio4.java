package lista1;
import java.util.Scanner;
public class exercicio4 {
public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	double gramas, gramasDiv;
	int cont = 0;
	int tempo, horas, min, seg;
	
	System.out.println("Digi o peso da massa em gramas");
	gramas = input.nextDouble();
	gramasDiv = gramas;
	
	while(gramasDiv > 0.5) {
		gramasDiv = gramasDiv / 2;
		cont++; 
	} tempo = cont * 50;
	
}
}
