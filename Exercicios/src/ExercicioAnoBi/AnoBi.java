package Ex1;
import java.util.Scanner;
/* Escrever se um ano informado pelo usuário é bissexto ou não. Um ano é bissexto
quando é (divisível por 400) ou é (divisível por 4 e não por 100); */

public class AnoBi {
public static void main(String [] args) {
Scanner input = new Scanner(System.in);
	int ano;
	
System.out.println("Informe o ano:");	
ano = input.nextInt();

if(ano % 4 == 0 && ano % 100 != 0) {
	System.out.println("O ano infomado, é um ano bissexto.");
}else {
	System.out.println("O ano informado, NÃO é um ano bissexto.");
}

}
}
