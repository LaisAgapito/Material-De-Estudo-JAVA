package exercicio2;

public class RetanguloMain {
	public static void main(String [] args) {
		Retangulo R = new Retangulo(2.5, 5);
		
		System.out.println("Lado 1: " + R.getLado1());
		System.out.println("Lado 2: " + R.getLado2());
		System.out.println("Area: " + R.calculaArea());
		System.out.println("Perimetro: " + R.calculaPerimetro());
	}

}
