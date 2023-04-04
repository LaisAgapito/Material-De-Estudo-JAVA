package exercicio1_6;

public class SistemaMain {
public static void main(String [] args) {
	Disciplina d1 = new Disciplina("Java", 7, "Introdução ao JAVA, Orientação a objeto");
	Turma T1 = new Turma("B", "Noturno", "ADS", 35, d1);
	
	T1.imprimir();
}
}
