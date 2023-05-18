package exHeranca;

public class Professor extends Pessoa {
	private String depart;
	private String anoAdimissao;
	
public Professor() {
}

public Professor(String nome, String cpf, char sexo, String depart, String anoAdimissao) {
	super(nome, cpf, sexo);
	this.depart = depart;
	this.anoAdimissao = anoAdimissao;
}

public String getDepart() {
	return depart;
}

public void setDepart(String depart) {
	this.depart = depart;
}

public String getAnoAdimissao() {
	return anoAdimissao;
}

public void setAnoAdimissao(String anoAdimissao) {
	this.anoAdimissao = anoAdimissao;
}

public String dadosProfessor() {
	String str = dadosPessoa() + "Departamento: " + depart + "\nAno da";
	
	
}

}
