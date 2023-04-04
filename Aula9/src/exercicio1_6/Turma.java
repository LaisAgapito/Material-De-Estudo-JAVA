package exercicio1_6;

public class Turma {
private String nome;
private String turno;
private String nomeCurso;
private int qtdAlunos;
private Disciplina disciplina;

public Turma() {
}

public Turma(String nome, String turno, String nomeCurso, int qtdAlunos, Disciplina disciplina) {
	this.nome = nome;
	this.turno = turno;
	this.nomeCurso = nomeCurso;
	this.qtdAlunos = qtdAlunos;
	this.disciplina = disciplina;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getTurno() {
	return turno;
}

public void setTurno(String turno) {
	this.turno = turno;
}

public String getNomeCurso() {
	return nomeCurso;
}

public void setNomeCurso(String nomeCurso) {
	this.nomeCurso = nomeCurso;
}

public int getQtdAlunos() {
	return qtdAlunos;
}

public void setQtdAlunos(int qtdAlunos) {
	this.qtdAlunos = qtdAlunos;
}

public Disciplina getDisciplina() {
	return disciplina;
}

public void setDisciplina(Disciplina disciplina) {
	this.disciplina = disciplina;
}

public void imprimir() {
	System.out.println ("Nome da turma: " + nome + "\nTurno: " + turno + "\nNome do curso: " + nomeCurso + "\nQuantidade de alunos: " + qtdAlunos );
	disciplina.imprimir();
}

}
