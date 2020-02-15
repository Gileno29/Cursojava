package testeSerelizacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serelizacao.Aluno;
import serelizacao.Turma;


public class Teste {
	public static void main(String[] args) {
	escreverObject();
	readObject();// O construtor não é chamado na Deserialização
		
		
	}
	
	public static void escreverObject() {
		Turma t= new Turma("Turma teste");
		Aluno aluno= new Aluno(1l,"Gileno","123456");
		aluno.setTurma(t);
	
		try {
			FileOutputStream fos= new FileOutputStream("aluno.ser");
			ObjectOutputStream obj= new ObjectOutputStream(fos);
			obj.writeObject(aluno);
			obj.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao serializar:"+ e);
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("Erro ao receber objeto serializado: "+ e);
			
			e.printStackTrace();
		}
		
	}
	   
	
	//deserialização de Objeto
	public static void readObject() {
		//Aluno aluno= new Aluno(1l,"Gileno","123456");
		try {
			FileInputStream ros= new FileInputStream("aluno.ser");
			ObjectInputStream obj= new ObjectInputStream(ros);
			Aluno aluno= (Aluno) obj.readObject();
			System.out.println(aluno);
			obj.close();
		} catch (FileNotFoundException serial) {
			System.out.println("Erro ao serializar:"+ serial);
			serial.printStackTrace();
			
		} catch (IOException send) {
			System.out.println("Erro ao receber objeto serializado: "+ send);
			
			send.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
