package codicionais;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Entre co o dia da semana");
		int diaDaSemana= s.nextInt();
		
		switch(diaDaSemana){
		
			case 1: System.out.println("é domingo");
			break;
			case 2: System.out.println("é segunda");
			break;
			case 3: System.out.println("é terça");
			break;
			case 4: System.out.println("é quarta");
			break;
			case 5: System.out.println("é quinta");
			break;
			case 6: System.out.println("é sexta");
			break;
			case 7: System.out.println("é sabado");
			break;
		
			
		
		}
		
	}
}