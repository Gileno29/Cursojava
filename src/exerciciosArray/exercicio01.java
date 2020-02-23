package exerciciosArray;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String [] args) {
		//criar um vetor A e atribuir os elementos ao vetor B
		Scanner s= new Scanner(System.in);
		int[] vetorA= new int[5];
		int[] vetorB= new int[vetorA.length];
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Digite um valor para o vetor"+ " ");
			vetorA[i]= s.nextInt();
			
			vetorB[i]= vetorA[i];
			
		}
		
		System.out.println("Vetor A = ");
		for(int i= 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		
	}

}
