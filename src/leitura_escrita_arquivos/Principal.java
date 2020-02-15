package leitura_escrita_arquivos;

public class Principal {
	public static void main(String[] args) {
		String arq= "arquivo.txt";
		
		String conteudo= "dakdjajdkajdasjdkljakjlkjklasdla \n"+
		"jdkajdakdjkakldadadjajkdsnv s n \n"+
		"ajdhadhjabdhadhgjh \n";
		
		if(Arquivo.write(arq, conteudo)) {
			System.out.println("Arquivo salvo com sucesso!");
			
		}else {
			System.out.println("Deu ruim parceiro");
			
		}
		//leitura
		
		String texto= Arquivo.read(arq);
		
		if(texto.isEmpty()) {
			System.out.println("Erro arquivo está vazio");
		}else {
			System.out.println(texto);
		}
		
	}
	
	

}
