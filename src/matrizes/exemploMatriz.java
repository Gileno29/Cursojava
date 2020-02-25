package matrizes;

import java.util.Scanner;

public class exemploMatriz {
	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Entre com o numero de pessoas que serão entrevistadas");
		int numEntrevistados= scan.nextInt();
		
		
		String[][] nomesFilhos= new String[numEntrevistados][];
			
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos ");
			int qtdFilhos= scan.nextInt();
			
			nomesFilhos[i]= new String[qtdFilhos];
			
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println("Digte o nome do filho "+(j+1));
				
				nomesFilhos[i][j]= scan.next();
				
			}
		}
	}
}
