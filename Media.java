import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] p = {"1ª", "2ª", "3ª", "4ª", "5ª", "6ª"};
		
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
			
			int qtdAluno;
			while (true) {
				System.out.println("Informe a quantidade de alunos:");
				qtdAluno = scan.nextInt();
				if (qtdAluno > 0) {
					break;
				} else {
					System.out.println("\r\nQUANTIDADE INVALIDADE!\r\n");
						
				}
			}
			
			float[][] notaAluno;
			float[] mediaAluno;
			
			notaAluno = new float[qtdAluno][6];
			mediaAluno = new float[qtdAluno];
			
			int contador = 0;
			
			while (true) {
				
				System.out.printf("\tS para calcular média do aluno número %d", contador + 1);
				System.out.println("");
				System.out.println("\tC para cancelar");
				String opcao = scan.next();
				
				if ((opcao.equals("S")) || (opcao.equals("s"))) {
					
					boolean opcao1 = true;
					int e = 0;
					
					while (opcao1) {
						System.out.printf("Informe a %s nota do Aluno número: %d\r\n", p[e], contador + 1);
						float nota = scan.nextFloat();
						
						if ((nota >= 0) && (nota <= 10)) {
							notaAluno[contador][e] = nota;
							mediaAluno[contador] += nota;
							e++;
						} else {
							System.out.println("\r\n\tNota inválida.\r\n\tDigite novamente.\r\n");
						}
						if (e == 6) {
							opcao1 = false;
						}
					}
					contador++;
				}
				
				if ((opcao.equals("C")) || (opcao.equals("c"))) {
					System.out.println("\r\nPrograma Finalizado\r\n");
					break;
				}
				if (contador == qtdAluno) {
					System.out.println("\r\nTodos os contatos registrados.\r\n");
					break;
				} 
			}
			for (int i = 0; i < contador; i++) {
				System.out.printf("O aluno %d teve a média de %.2f.\r\n", i + 1, (mediaAluno[i] / 6));
			}
		}else if ((iniciar.equals("N")) || (iniciar.equals("n"))) {
				System.out.println("\r\nPrograma fechado!!!\r\n");
		}
		
	}
	
}