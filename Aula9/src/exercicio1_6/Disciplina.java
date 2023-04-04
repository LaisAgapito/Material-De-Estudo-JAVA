package exercicio1_6;

public class Disciplina {
private String nome;
private int numeroCreditos;
private String ementa;

public Disciplina() {
}

public Disciplina(String nome, int numeroCreditos, String ementa) {
	this.nome = nome;
	this.numeroCreditos = numeroCreditos;
	this.ementa = ementa;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getNumeroCreditos() {
	return numeroCreditos;
}

public void setNumeroCreditos(int numeroCreditos) {
	this.numeroCreditos = numeroCreditos;
}

public String getEmenta() {
	return ementa;
}

public void setEmenta(String ementa) {
	this.ementa = ementa;
}

public void imprimir() {
	System.out.println("Nome: " + nome + "\nNúmero de Créditos: " + numeroCreditos + "\nEmenta: " + ementa);
 }

}
