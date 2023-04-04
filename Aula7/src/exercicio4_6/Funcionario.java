package exercicio4_6;

public class Funcionario {
private String nome;
private String sobrenome;
private double horasTrab;
private double valorHora;

public Funcionario() {
	
}

public Funcionario(String nome, String sobrenome, double horasTrab, double valorHora) {
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.horasTrab = horasTrab;
	this.valorHora = valorHora;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getSobrenome() {
	return sobrenome;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}

public double getHorasTrab() {
	return horasTrab;
}

public void setHorasTrab(double horasTrab) {
	this.horasTrab = horasTrab;
}

public double getValorHora() {
	return valorHora;
}

public void setValorHora(double valorHora) {
	this.valorHora = valorHora;
}

public String nomeCompleto() {
	return nome.concat(sobrenome);
}

public double calcularSalario() {
	double salario = horasTrab * valorHora;
	return salario;
}

public void incrementaHoras(double valor) {
	valorHora = valorHora + valor;
}

public void decrementaHoras(double valor) {
	valorHora = valorHora - valor;
}

public double aumentaValorHoras(double porcentagem) {
	double reajuste = (valorHora * porcentagem) / 100;
	valorHora = valorHora + reajuste;
	return valorHora;	
}


}
