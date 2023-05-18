package ex1;

public class Carro implements EmissaoCarbono {
	private String combustivel;
	private double kmRodado;
	
	public Carro() {
		
	}
	public Carro(String combustivel,double kmRodado) {
		this.combustivel = combustivel;
		this.kmRodado = kmRodado;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public double getKmRodado() {
		return kmRodado;
	}
	public void setKmRodado(double kmRodado) {
		this.kmRodado = kmRodado;
	}
	
	public double quantidadeEmitida() {
		/*/ • O cálculo da emissão de carbono deve ser feito da seguinte forma:
			• Carro à gasolina ou álcool: 96 * km
			• Carro elétrico: 53 * km
			• Carro à diesel: 171 * km /*/
		
		switch(combustivel) {
		case "gasolina":
			return 96 * kmRodado;
			
		case "alcool":
			return 96 * kmRodado;
			
		case "eletrico":
			return 53 * kmRodado;
			
		case "disel":
			return 171 * kmRodado;
		default : 
			return 0;
			
		
		}
		
		
	}
	
	
}
