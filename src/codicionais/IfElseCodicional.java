package codicionais;

import java.util.Scanner;

public class IfElseCodicional {
	public static void main(String [] args) {
		Scanner s=  new Scanner(System.in);
		
		System.out.println("Digite a sua idade");
		
		int idade= s.nextInt();
		
		
		if(idade>=18) {
			System.out.println("� maior de idade");
		}else {
			System.out.println("N�o � Maior de idade");
		}
	}

}
