package codicionais;

import java.util.Scanner;

public class BreakAndContinue {
	public static void main(String [] args) {
		Scanner s= new Scanner(System.in);
		
		/*System.out.println("Entre com um numero");
		int num= s.nextInt();
		System.out.println("Entre com um Limite");
		int max= s.nextInt();
		//descobrir qula o primeiro numero dividido por 7 no intervalo digitado
		
		for(int i= num; i<=max; i++) {
			System.out.println(i);
			
			
			if(i%7==0) {
				System.out.println("O valor de i é: " +i);
				break;
			}
			
		}*/
		
		System.out.println("Entre com um numero");
		int num= s.nextInt();
		System.out.println("Entre com um Limite");
		int max= s.nextInt();
		//pula a impressão de todos os numero multiplos de 7
		
		for(int i= num; i<=max; i++) {
			
			
			if(i%7==0) {
				
				continue;
			}
			System.out.println("O valor de i é: " +i);
			
		}
	}

}
