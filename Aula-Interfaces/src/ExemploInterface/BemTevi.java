package ExemploInterface;

// Exemplo de classe com implementação de mais de uma interface
public class BemTevi implements Anda, Voa{
	private int posx, posy, altura;
	
	public BemTevi(){
		
	}
	
	public BemTevi(int posx, int posy, int altura) {
		this.posx = posx;
		this.posy = posy;
		this.altura = altura;
	}

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	
	public void subir(int altura) {
		this.altura += altura;
		
	}

	
	public void descer(int altura) {
		this.altura -= altura;
		
	}

	
	public void avancar(int x, int y) {
		posx += x;
		posy += y;
		
	}

	
	public void recuar(int x, int y) {
		posx -= x;
		posy -= y;
		
	}

}
