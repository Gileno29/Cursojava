package Execicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		int first= s.nextInt();
		
		System.out.println("Digite o Segundo numero");
		
		int second= s.nextInt();
		
		int soma= first+second;
		
		System.out.println("A soma dos números é :" + soma);
		
	}

}
