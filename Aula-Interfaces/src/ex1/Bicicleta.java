package ex1;

public class Bicicleta implements EmissaoCarbono {
public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
private String tipo;

public Bicicleta() {
	
}
public Bicicleta(String tipo) {
	this.tipo = tipo;
}

public double quantidadeEmitida() {
	return 0;
}

}
