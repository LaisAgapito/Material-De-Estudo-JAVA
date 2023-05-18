package exemplo;

public class PessoaJuridica extends PessoaAbstrata{
private String cnpj;

public PessoaJuridica(){
	
}

public PessoaJuridica(String nome, String endereco, String telefone, String cnpj){
	super(nome, endereco, telefone);
	this.cnpj = cnpj;
}

public String getCnpj() {
	return cnpj;
}

public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}

public String toString(){
	return "Nome: " + nome + "Endereço: " + endereco + "Telefone: "+ telefone + "CNPJ: "+ cnpj;
}

}
