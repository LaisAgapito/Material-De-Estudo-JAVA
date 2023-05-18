package ex1;
import java.util.ArrayList;
class TesteCarbono {
public static void main(String [] args) {
	Predio P = new Predio(100, true, 410, 100);
	Carro C = new Carro("gasolina", 50);
	Bicicleta B = new Bicicleta("Adulto-passeio");
	Cidade cidade = new Cidade();
	cidade.adicionar(P);
	cidade.adicionar(C);
	cidade.adicionar(B);    
	
	System.out.println(cidade.calculaEmissaoMensal());
	
}
}
