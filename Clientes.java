import java.util.Scanner;

public class Clientes {
	
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
		int qtdCli;
		if ((iniciar.equals("S")) || (iniciar.equals("s"))) {
			while (true) {
				System.out.println("INFORME O NUMERO DE CLIENTES QUE DESEJA ARMAZENAR NA LISTA?");
				qtdCli = scan.nextInt();
					
				if (qtdCli > 0) {
					break;
				} else {
					System.out.println("\r\nQUANTIDADE INVALIDADE!\r\n");
						
				}
			}
				
		String[] nomeCli;
		nomeCli = new String[qtdCli];
				
		int contador = 0;
				
		while (true) {
			System.out.printf("\tS PARA ARMAZENAR O NOME DO CLIENTE NÚMERO %d", contador + 1);
			System.out.println("");
			System.out.println("\tC PARA CANCELAR");
			String opcao = scan.next();
			
			if ((opcao.equals("S")) || (opcao.equals("s"))) {
				while (true){
					System.out.println("INFORME O NOME DO CLIENTE");
					String nome = scan.next();
					if (nome.length() >= 2) {		
						nomeCli[contador] = nome;
						break;				
					} else {			
						System.out.println("\r\n\tNOME INVALIDO!\r\n");
					}
				}
						
			contador++;
			}
					
			if ((opcao.equals("C")) || (opcao.equals("c"))) {
						
				System.out.println("\r\nPROGRAMA FINALIZADO!\r\n");
				break;
						
			}
			if (contador == qtdCli) {
				System.out.println("\r\nTODOS CLIENTES REGISTRADOS!\r\n");
				break;
			}
					
		}
				
		for (int i = 0; i < contador; i++) {
					 
			System.out.printf("Nome: %s\r\n",nomeCli[i]);
					
		} 
			
				
		} else if ((iniciar.equals("N")) || (iniciar.equals("n"))) {
				System.out.println("\r\nPrograma fechado!!!\r\n");
		}
			
			
			
	}
	
}