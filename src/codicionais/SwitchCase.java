package codicionais;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Entre co o dia da semana");
		int diaDaSemana= s.nextInt();
		
		switch(diaDaSemana){
		
			case 1: System.out.println("� domingo");
			break;
			case 2: System.out.println("� segunda");
			break;
			case 3: System.out.println("� ter�a");
			break;
			case 4: System.out.println("� quarta");
			break;
			case 5: System.out.println("� quinta");
			break;
			case 6: System.out.println("� sexta");
			break;
			case 7: System.out.println("� sabado");
			break;
		
			
		
		}
		
	}
}