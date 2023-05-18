package ex1;

public class Diretor extends Gerente implements Autenticavel{
 private String filial;
 
 
 public Diretor(){
	 
 }
 public Diretor(String nome,String cpf,double salario, String credencial, String setor, String filial, int senha) {
	 super(nome, cpf, salario, credencial, setor, senha);
	 this.filial = filial;
	 
 }
public String getFilial() {
	return filial;
}
public void setFilial(String filial) {
	this.filial = filial;
}
 
public double Bonoficacao() {
	return getSalario() * 0.18;
}
	
public String toString() {
	return super.toString() + "\nFilial: " + filial;
}
	
}
