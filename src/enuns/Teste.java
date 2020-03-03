package enuns;

public class Teste {
	
	public static void main(String[]args) {
		
		
	}
		
	
	
	public static void usandoConstantes(int dia) {
		int segunda=DiasDaSemana.SEGUNDA;
		int terca=DiasDaSemana.TERCA;
		int quarta= DiasDaSemana.QUARTA;
		int quinta = DiasDaSemana.QUINTA;
		int sexta = DiasDaSemana.SEXTA;
		int sabado = DiasDaSemana.SABADO;
		int domingo = DiasDaSemana.DOMINGO;
	}

	private static void imprimeDiaSemana(int dia) {
		switch(dia) {
			
		case 1:
			System.out.println("segunda-Feira");
			break;

		case 2:
			System.out.println("terca-Feira");
			break;

		case 3:
			System.out.println("quarta-Feira");
			break;

		case 4:
			System.out.println("quinta-Feira");
			break;
		case 5:
			System.out.println("sexta-Feira");
			break;
			
		case 6:
			System.out.println("Sabado");
			break;
			
		case 7:
			System.out.println("Domingo");
			break;
		}
		

		
		
	}

	public static void usandoEnum() {
		DiaDaSemana segunda= DiaDaSemana.SEGUNDA;
		DiaDaSemana terca= DiaDaSemana.TERCA;
		DiaDaSemana quarta= DiaDaSemana.QUARTA;
		DiaDaSemana quinta= DiaDaSemana.QUINTA;
		DiaDaSemana sexta= DiaDaSemana.SEXTA;
		DiaDaSemana sabado= DiaDaSemana.SABADO;
		DiaDaSemana domingo= DiaDaSemana.DOMINGO;
		
		
	}
	
	private static void imprimeDiaSemanaEnum(DiaDaSemana dia) {
		switch(dia) {
			
		case SEGUNDA:
			System.out.println("segunda-Feira");
			break;

		case TERCA:
			System.out.println("terca-Feira");
			break;

		case QUARTA:
			System.out.println("quarta-Feira");
			break;

		case QUINTA:
			System.out.println("quinta-Feira");
			break;
		case SEXTA:
			System.out.println("sexta-Feira");
			break;
			
		case SABADO:
			System.out.println("Sabado");
			break;
			
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
}

}