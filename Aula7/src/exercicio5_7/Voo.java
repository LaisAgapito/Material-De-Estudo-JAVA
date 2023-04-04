package exercicio5_7;

public class Voo {
private int poltronas[];

public Voo() {
	poltronas = new int[100];
	inicializa();
}

public Voo(int [] poltronas) {
	this.poltronas = poltronas;
	inicializa();
}

private void inicializa() {
	for(int i = 0; i < 100; i++) {
		poltronas[i]= -1;
	}
}

public int[] getPoltronas() {
	return poltronas;
}

public void setPoltronas(int[] poltronas) {
	this.poltronas = poltronas;
}

public int proximoLivre() {
	int posicao = -1;
	for(int i = 0; i < 100; i++) {
		if(poltronas[i] == -1) {
			return i;
		}
	}
	return -1;
}

public void verificaPoltrona(int plivre) {
	if(poltronas[plivre] == -1) {
		System.out.println("Poltrona livre");
	}else {
		System.out.println("Poltrona ocupada");
	}
}

public int reservaPoltrona() {
	int plivre = proximoLivre();
	if(plivre != -1) {
		poltronas[plivre] = 0;
	}
	return plivre;
}

public int quantidadePoltronasVazias() {
	int cont = 0;
	for(int i = 0; i < 100; i++) {
		if(poltronas[i] == -1) {
			cont++;
		}
	} return cont;
}

public int qtdPoltronasOcupadas() {
	int cont = 0;
	for(int i = 0; i < 100; i++) {
		if(poltronas[i] == 0) {
			cont++;
		}
	} return cont;
}

}

