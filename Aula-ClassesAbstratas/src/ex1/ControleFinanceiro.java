package ex1;
import java.util.Scanner;
public class ControleFinanceiro {
	public void login(Autenticavel at){
		Scanner in = new Scanner(System.in);
		System.out.println("Informe a senha: ");
		int senha = in.nextInt();
		if(at.autentica(senha) == true) {
			System.out.println("Usuário logado!");
		}else {
			System.out.println("Não foi possível logar!");
		}
	}

}
