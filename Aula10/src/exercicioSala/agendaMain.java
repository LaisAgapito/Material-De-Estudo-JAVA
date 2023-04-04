package exercicioSala;
	import java.util.Scanner;

	public class agendaMain {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        agenda g1 = new agenda();
	        String rcNome, rcTelefone, rcEmail;
	        contato c = new contato();
	        int opcao = 0 ;
	        while(opcao != 5) {
	        
	        System.out.println("Agenda: \nEscolha uma opção:\n1-adicionar contato \n2-remover contato \n3-buscar contato \n4-alterar contato \n5-sair");
	        opcao = input.nextInt();
	        input.nextLine();
	        
	        
	        switch (opcao) {
		        case 0:{
		        	g1.imprimir();
		        }
	            case 1:
	                
	                System.out.printf("\nDigite o nome do contato: \n");
	                rcNome = input.next();
	                System.out.printf("\nDigite o telefone do contato:\n ");
	                rcTelefone = input.next();
	                System.out.printf("\nDigite o email do contato: \n");
	                rcEmail = input.next();
	                c = new contato();
	                c.setNome(rcNome);
	                c.setTelefone(rcTelefone);
	                c.setEmail(rcEmail);
	                g1.Adicionar(c);
	                System.out.println(g1.getContatos()); 
	                break;

	            case 2:
	                System.out.println("Digite o nome completo do contato que deseja remover:  ");
	                rcNome = input.nextLine();
	                g1.Remover(rcNome);
	                break;

	            case 3:
	                
	                g1.Busca(); 
	                
	                break;

	            case 4:
	                System.out.println("Digite o nome do contato que deseja realisar as alterações: ");
	                rcNome = input.nextLine();
	                g1.AlterarCont(rcNome);
	                break;

	            case 5:
	               // System.exit(opcao);
	            	break;

	            default:
	                System.out.println("Opção inválida");

	        }
	        }
	    }}
