package exemplo;
import java.util.ArrayList;
public class TestePessoa {
public static void main(String [] args){
	PessoaFisica p1 = new PessoaFisica("Maria", "Rua 10 nº 200", "(43)9855-7375", "157.175.221-75");
	PessoaJuridica p2 = new PessoaJuridica("Empresa T3", "Rua 12 nº 1", "11 3335-2121", "123.125.051/0001-08");

	ArrayList<PessoaAbstrata> pessoas = new ArrayList<PessoaAbstrata>();
	pessoas.add(p1);
	pessoas.add(p2);
	
	for(int i = 0; i < pessoas.size(); i++) {
		System.out.println(pessoas.get(i).toString());
	}
}
}
