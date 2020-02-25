package dataStructure;

public class Vetor {
	private String elementos[];
	
	
	public Vetor(int capacidade) {
		elementos= new String[capacidade];//o construtor cria um vetor de Strings com uma capacidade X
		
	}
	
	public void adiciona(String elemento) {
		for(int i=0; i<this.elementos.length; i++) {
			if(this.elementos[i]==null) {//testa se o elemento é nulo
				this.elementos[i]=elemento;
				break;
			}
			
			
		}
		
	}
	
	public void adiciona(int posicao, String elemento) {}
	
	public void remove(int posicao) {}
	
	public String busca(int posicao) {
		return null;}
	
	public int busca(String elemento) {
		return 0;}
	
	public int tamanho() {
		return 0;}
	
	
	public String toString() {
		return null;
	}

}
