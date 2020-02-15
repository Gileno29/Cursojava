package leitura_escrita_arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {

	public static String read(String caminho) {
		String conteudo="";
		
		
		try {
			FileReader arq= new FileReader(caminho);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha="";
			
			try {
				linha= lerArq.readLine();
				while(linha!=null) {
					conteudo+=linha+"\n";
					linha= lerArq.readLine();
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				conteudo="Erro não foi possivel ler o arquivo"+ e;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			conteudo="Erro não foi possivel abrir aqrquivo"+ e;
		}
		if(conteudo.contains("Erro")) {
			return "";
			
		}else {
			return conteudo;
		}
	}
	
	public static boolean write(String caminho, String texto) {//passa caminho e texto do arquivo
		try {
			FileWriter arq= new FileWriter(caminho);
			PrintWriter escreveArq= new PrintWriter(arq);
			escreveArq.println(texto);
			escreveArq.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return false;
		
	}
}
