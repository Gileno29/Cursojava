package dataStructure;

public class Vetor {
	private String elementos[];
	private int tamanho;
	
	
	public Vetor(int capacidade) {
		elementos= new String[capacidade];//o construtor cria um vetor de Strings com uma capacidade X
		this.tamanho=0;
		
	}
	
	public void adiciona(String elemento)throws Exception {
		/*for(int i=0; i<this.elementos.length; i++) {
			if(this.elementos[i]==null) {//testa se o elemento é nulo
				this.elementos[i]=elemento;
				break;
			}
			
			
		}*/
		if(this.tamanho<this.elementos.length) {
			this.elementos[this.tamanho]= elemento;
			this.tamanho++;
		}else {
			throw new Exception("Vetor já está cheio");
		}
		
	}
	
	public boolean adiciona(int posicao, String elemento){
		if(this.tamanho<this.elementos.length) {
			this.elementos[this.tamanho]= elemento;
			this.tamanho++;
			return true;
		}
		return false;
		
	}
	
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
