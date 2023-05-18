package exemplo;

public class PessoaFisica extends PessoaAbstrata{
	private String cpf;
	
	public PessoaFisica(){
		
	}
	
	public PessoaFisica(String nome, String endereco, String telefone, String cpf){
		super(nome, endereco, telefone);
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString(){
		return "Nome: " + nome + "Endereço: " + endereco + "Telefone: "+ telefone + "CPF: "+ cpf;
	}

}
