package Ex2;
import java.util.ArrayList;
public class TestaForma {
	public static void main(String [] args) {
	ArrayList<Forma> formas = new ArrayList<Forma>();
	Retangulo r1 = new Retangulo(2,2);
	Retangulo r2 = new Retangulo(10,5);
	formas.add(r1);
	formas.add(r2);
	Circulo c1 = new Circulo(15);
	Circulo c2 = new Circulo(8);
	formas.add(c1);
	formas.add(c2);
	
	for(int i = 0; i < formas.size(); i++) {
		System.out.println("\nForma["+i+"]");
		System.out.printf("\nArea: %.2f", formas.get(i).calcularArea());
		System.out.printf("\nPerímetro %.2f: \n", formas.get(i).calcularPerimetro());
		
	}
	
	
	}

}
