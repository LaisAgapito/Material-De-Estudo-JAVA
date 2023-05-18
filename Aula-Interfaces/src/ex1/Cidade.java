package ex1;
import java.util.ArrayList;
public class Cidade {
private ArrayList<EmissaoCarbono> elementos;

public Cidade() {
	elementos = new ArrayList<EmissaoCarbono>();
}

public Cidade(ArrayList<EmissaoCarbono> elementos) {
	this.elementos = elementos;
}

public ArrayList<EmissaoCarbono> getElementos() {
	return elementos;
}

public void setElementos(ArrayList<EmissaoCarbono> elementos) {
	this.elementos = elementos;
}
 public void adicionar(EmissaoCarbono elemento) {
	 elementos.add(elemento);
	 
 }
 
 public boolean remover(EmissaoCarbono elemento) {
	 for(int i = 0; i < elementos.size(); i++ ) {
		 if(elementos.get(i).equals(elemento)) {
			 elementos.remove(i);
			 return true;
		 }
	 }
	 return false;
 }
 
 public double calculaEmissaoMensal() {
	 double CarbonoMensal = 0;
	 for(int i = 0; i < elementos.size(); i++ ) {
		 CarbonoMensal += elementos.get(i).quantidadeEmitida();
	 } return CarbonoMensal;
 }
 
 


}
