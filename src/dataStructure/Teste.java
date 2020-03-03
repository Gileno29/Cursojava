package dataStructure;

public class Teste {
	public static void main(String[] args) {
		Vetor vetor= new Vetor(1);
		
		try {
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		vetor.adiciona("elemento 4");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}
