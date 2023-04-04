package exercicio1;

public class Contador {
private int cont;

public Contador() {
	
}

public Contador(int cont) {
	this.cont = cont;
}

public int getCont() {
	return cont;
}

public void setCont(int cont) {
	this.cont = cont;
}

public int Zerar() {
	cont = 0;
	return cont;
}

public int Incrementar() {
	return ++cont;
}

public int Decrementar() {
	return --cont;
}

public int Somar(int valor) {
	return cont + valor;
}
public int Subtrair(int valor) {
	return cont - valor;
}

}
