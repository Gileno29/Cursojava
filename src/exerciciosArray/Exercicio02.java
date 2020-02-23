package exerciciosArray;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String [] args) {
		//criar um vetor A e atribuir os elementos ao vetor B o vetor deve possuir 15 elementos e B deve ser 4 vezes A
		Scanner s= new Scanner(System.in);
		int[] vetorA= new int[15];
		int[] vetorB= new int[vetorA.length];
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Digite um valor para o vetor"+ " ");
			vetorA[i]= s.nextInt();
			
			vetorB[i]= vetorA[i]* vetorA[i];
			
		}
		
		System.out.println("Vetor A = ");
		for(int i= 0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		
	}

}
