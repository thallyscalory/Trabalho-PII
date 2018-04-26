import java.util.Scanner;

public class Contatos {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String iniciar;
		while (true) {
			System.out.println("DESEJA INICIAR?");
			System.out.println("\tS para SIM");
			System.out.println("\tN para NAO");
			iniciar = scan.next();
			if((iniciar.equals("S")) || (iniciar.equals("s")) || (iniciar.equals("N")) || (iniciar.equals("n"))) {
				break;
			} else {
				System.out.println("\r\nOPÇÃO INVALIDA!\r\n");
				System.out.println("\r\nDIGITE NOVAMENTE:\r\n");
			}
		}
		
		if ((iniciar.equals("S")) || (iniciar.equals("s"))) {
			
			int qtdContato;
			
			while (true) {
				System.out.println("Informe a quantidade de contatos que deseja armazenar:");
				qtdContato = scan.nextInt();
				if(qtdContato > 0) {
					break;
				} else {
					System.out.println("\r\nQUANTIDADE INVALIDADE!\r\n");
				}
			}
			
			String[] nomeContato;
			String[] emailContato;
			nomeContato = new String[qtdContato];
			emailContato = new String[qtdContato];
			
			int contador = 0;
			
			while (true) {
				
				System.out.printf("\tS para armazenar o contato número %d", contador + 1);
				System.out.println("");
				System.out.println("\tC para cancelar");
				String opcao = scan.next();
			
				if ((iniciar.equals("S")) || (iniciar.equals("s"))) {
					while (true){
						System.out.println("Informe o Nome do Cliente");
						String nome = scan.next();
						if (nome.length() >= 2){
							nomeContato[contador] = nome;
							break;
						} else {
							System.out.println("\r\n\tNome Inválido!\r\n");
						}
					}
					while(true){
						System.out.println("Informe o E-mail do Cliente");
						String email = scan.next();
						if (email.matches("^[a-z0-9\\-_\\.]+@[a-z0-9]+\\..+$")) { 
							emailContato[contador] = email;
							break;
						} else {
							System.out.println("\r\n\tE-mail Inválido!\r\n");
						}
					}
					
				contador++;
				}
				if ((iniciar.equals("C")) || (iniciar.equals("c"))) {
					System.out.println("\r\nPrograma Finalizado!\r\n");
					break;
				}
				if (contador == qtdContato) {
					System.out.println("\r\nTodos os Contatos Registrados!\r\n");
					break;
				}
				
			}

			for (int i = 0; i < contador; i++) {
				System.out.printf("Nome: %s\r\nE-mail: %s\r\n\r\n", nomeContato[i], emailContato[i]);
			}
			
		} else if ((iniciar.equals("N")) || (iniciar.equals("n"))) {
			System.out.println("\r\nPrograma Fechado!\r\n");	
		}
	}
}