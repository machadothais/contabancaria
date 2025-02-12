package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		do {
			
			System.out.println("***********************************************************************");
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
                System.out.println("Criar Conta");
                break;
                
            case 2:
                System.out.println("Listar todas as Contas");
                break;
                
            case 3:
                System.out.println("Consultar dados da Conta - por numero");
                break;
                
            case 4:
                System.out.println("Alizar dados da Conta");
                break;
                
            case 5:
                System.out.println("Apagar a Conta");
                break; 
                
            case 6:
                System.out.println("Saque");
                break;
                
            case 7:
                System.out.println("Deposito");
                break;
                
            case 8:
                System.out.println("Transferancia entre Contas");
                break;
                
            default:
                System.out.println("Saindo do programa...");
                break;
                
			}
			
		}while(opcao < 1 || opcao > 9);
		
		
		scanner.close();

	}

}
