package exercicio2;

public class Retangulo {
	private double Lado1;
	private double Lado2;
	
	public Retangulo() {
	}

	public Retangulo(double Lado1,double Lado2) {
		this.Lado1 = Lado1;
		this.Lado2 = Lado2;
	}

	public double getLado1() {
		return Lado1;
	}

	public void setLado1(double lado1) {
		Lado1 = lado1;
	}

	public double getLado2() {
		return Lado2;
	}

	public void setLado2(double lado2) {
		Lado2 = lado2;
	}
	
	public double calculaArea() {
		double area;
		area = Lado1 * Lado2;
		return area;
	}
	
	public double calculaPerimetro() {
		double perimetro ;
		perimetro = (Lado1 * 2) + (Lado2 * 2);
		return perimetro;
	}
}
