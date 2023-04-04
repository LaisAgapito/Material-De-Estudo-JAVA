package exercicioSala;
import java.util.ArrayList;

import java.util.Scanner;
public class agenda {
	private ArrayList<contato> contatos;

	public agenda() {
		contatos = new ArrayList<>();
	}

	public agenda(ArrayList<contato> contatos) {
		this.contatos = contatos;
	}

	public ArrayList<contato> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<contato> contatos) {
		this.contatos = contatos;
	}

	public void Adicionar(contato contato1) {
		if (!contatos.contains(contato1)) {
			contatos.add(contato1);
			System.out.println("Contato adicionado");
			//System.out.println(contato1.toString());
		} else {
			System.out.println("Esse contato já exite");
			
		}
	}

	public void Remover(String nome) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getNome().equals(nome)) {
				contatos.remove(i);
				System.out.println("Contato removido");
				break;
			}
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i).toString());
		}
	}

	public void Busca() {
		//ArrayList<contato> resultBusca = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome do contato que deseja buscar:  ");
        String nome = input.next();
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getNome().contains(nome)){
				//resultBusca.add(contatos.get(i));
				System.out.println(contatos.get(i).toString());
			}
		}
		
	}

	public void AlterarCont(String nome) {
		Scanner input = new Scanner(System.in);
		int num;
		String nomeUp, telefoneUp, emailUp;

		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getNome().contains(nome)) {
				System.out.println(contatos.get(i).toString());
				System.out.println("\nO que deseja alterar?" +
						"\n1 para alterar nome" + "\n2 para alterar o telefone" +
						"\n3 para alterar e-mamil" + "\n4 para alterar tudo");
				num = input.nextInt();
				switch (num) {
					case 1:
						System.out.println("Digite o nome para alteração: ");
						nomeUp = input.nextLine();
						contatos.get(i).setNome(nomeUp);
						break;
					case 2:
						System.out.println("Digite o telefone para alteração: ");
						telefoneUp = input.nextLine();
						contatos.get(i).setTelefone(telefoneUp);
						break;
					case 3:
						System.out.println("Digite o email para alteração: ");
						emailUp = input.nextLine();
						contatos.get(i).setEmail(emailUp);
						break;
					case 4:
						System.out.println("\nDigite o nome para alteração: ");
						nomeUp = input.nextLine();
						contatos.get(i).setNome(nomeUp);
						System.out.println("\nDigite o telefone para alteração: ");
						telefoneUp = input.nextLine();
						contatos.get(i).setTelefone(telefoneUp);
						System.out.println("\nDigite o email para alteração: ");
						emailUp = input.nextLine();
						contatos.get(i).setEmail(emailUp);
						break;
					default:
						System.out.println("Essa opção não existe");
						break;
				}
				if (num < 5 && num > 0) {
					System.out.println("Contato alterado com sucesso");
					System.out.println(contatos.get(i).toString());
				}
			}
		}
	}

}
