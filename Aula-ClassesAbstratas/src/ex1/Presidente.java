package ex1;

public class Presidente extends Funcionario{

	private String acoes;

	
public Presidente(){
	
}

public Presidente(String nome,String cpf,double salario, String acoes){
	super(nome, cpf, salario);
	this.acoes = acoes;
	
}


	public String getAcoes() {
	return acoes;
}

public void setAcoes(String acoes) {
	this.acoes = acoes;
}

	public double Bonoficacao() {
		return getSalario() * 0.20;
	}

	public String toString() {
		return super.toString() + "\nAções: " + acoes;
	}

	
}
