package ex1;

public class Predio implements EmissaoCarbono{
	private int numPessoas;
	private boolean energRenovavel;
	private int numlampadas;
	private int numArCondicionado;
	
	public Predio() {
		
	}
	
	public Predio(int numPessoas,boolean energRenovavel,int numlampadas,int numArCondicionado) {
		this.numPessoas = numPessoas;
		this.energRenovavel = energRenovavel;
		this.numlampadas = numlampadas;
		this.numArCondicionado = numArCondicionado;
	}
	
	public int getNumPessoas() {
		return numPessoas;
	}

	public void setNumPessoas(int numPessoas) {
		this.numPessoas = numPessoas;
	}

	public boolean isEnergRenovavel() {
		return energRenovavel;
	}

	public void setEnergRenovavel(boolean energRenovavel) {
		this.energRenovavel = energRenovavel;
	}

	public int getNumlampadas() {
		return numlampadas;
	}

	public void setNumlampadas(int numlampadas) {
		this.numlampadas = numlampadas;
	}

	public int getNumArCondicionado() {
		return numArCondicionado;
	}

	public void setNumArCondicionado(int numArCondicionado) {
		this.numArCondicionado = numArCondicionado;
	}

	public double quantidadeEmitida() {
	// • O cálculo da emissão de carbono 
	//deve ser feito da seguinte forma:
	//14.4 * lâmpadas + 10 *pessoas + 100 * ar-condicionados.
	//Caso o prédio faça uso de energia renovável, 
	//divida o gato por 2;
		double calc = (14.4 * numlampadas)+(10 * numPessoas)+(100 * numArCondicionado);
		
		if(energRenovavel = true) {
			calc = calc / 2;
		}
		
		return calc;
	}

}
