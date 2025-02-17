package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// Teste da Classe Conta
				Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
				c1.visualizar();
				c1.sacar(12000.0f);
				c1.visualizar();
				c1.depositar(5000.0f);
				c1.visualizar();
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		do {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND +
					           "***********************************************************************");
			System.out.println("                                                                       ");
			System.out.println("						 BANCO DO BRAZIL COM Z                         ");
			System.out.println("																	   ");
			System.out.println("***********************************************************************");
			System.out.println("																	   ");
			System.out.println("					 1 - Criar Conta								   ");
			System.out.println("					 2 - Listar todas as Contas						   ");
			System.out.println("					 3 - Buscar Conta por Número					   ");
			System.out.println("					 4 - Atualizar Dados da Conta					   ");
			System.out.println("					 5 - Apagar Conta								   ");
			System.out.println("					 6 - Sacar									       ");
			System.out.println("					 7 - Depositar									   ");
			System.out.println("					 8 - Transferir valores entre Contas			   ");
			System.out.println("					 9 - Sair								           ");
			System.out.println("					 								                   ");
			System.out.println("***********************************************************************");
			System.out.print("Entre com a opção desejada:                                              ");
			System.out.println("                                                                       ");
			
			opcao = scanner.nextInt();
			if(opcao < 1 || opcao > 9)
				System.out.print("Opcao Inválida! Informe a opcao novamente: ");
			
			switch(opcao){
			
			case 1:
                System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Criar Conta\n\n");
                break;
                
            case 2:
                System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Listar todas as Contas\n\n");
                break;
                
            case 3:
                System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Consultar dados da Conta - por numero\n\n");
                break;
                
            case 4:
                System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Atualizar dados da Conta\n\n");
                break;
                
            case 5:
                System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Apagar a Conta\n\n");
                break; 
                
            case 6:
                System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Saque\n\n");
                break;
                
            case 7:
                System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Deposito\n\n");
                break;
                
            case 8:
                System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Transferancia entre Contas\n\n");
                break;
                
            default:
                System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nSaindo do programa...\n");
                break;
                
			}
			
		}while(opcao < 1 || opcao > 9);
		
		
		scanner.close();

	}
	
	public static void sobre() {
		System.out.print("\n*****************************************************************");
		System.out.print("Projeto Desenvolvido por: ");
		System.out.print("Generatin Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.print("*******************************************************************");
		
	}

}
