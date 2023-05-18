package exemplo;

public abstract class PessoaAbstrata {
protected String nome;
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

protected String endereco;
protected String telefone;

public PessoaAbstrata(){
	
}

public PessoaAbstrata(String nome, String endereco, String telefone) {
	this.nome = nome;
	this.endereco = endereco;
	this.telefone = telefone;
	
}

}
