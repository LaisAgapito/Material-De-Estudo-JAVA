package Parte2Aula6;

public class Pessoa {
private String nome;
private String sobrenome;
private String data_nasc;
private String genero;
private String telefone;
private String endereco;
public String getnome() {
	return nome;
}
public void setnome(String nome) {
	nome = nome;
}
public String getsobrenome() {
	return sobrenome;
}
public void setsobrenome(String sobrenome) {
	sobrenome = sobrenome;
}
public String getdata_nasc() {
	return data_nasc;
}
public void setdata_nasc(String data_Nasc) {
	data_nasc = data_nasc;
}
public String getgenero() {
	return genero;
}
public void setgenero(String genero) {
	genero = genero;
}
public String gettelefone() {
	return telefone;
}
public void settelefone(String telefone) {
	telefone = telefone;
}
public String getendereco() {
	return endereco;
}
public void setendereco(String endereco) {
	endereco = endereco;
}

public String toString(){
	System.out.println("Nome");
}

}
