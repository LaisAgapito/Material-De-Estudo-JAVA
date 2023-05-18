package ex1;

public class TestaControleFinanceiro {
public static void main(String [] args) {
	Gerente g = new Gerente("Maria das Neves", "304.861.941-91", 4500, "FAK90","RH", 12345);
	ControleFinanceiro cf = new ControleFinanceiro();
	cf.login(g);
	
	
}
}
