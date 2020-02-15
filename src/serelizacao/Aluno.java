package serelizacao;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Aluno implements Serializable{
	private long id;
	private String nome;
	private transient String password; //transient impedo do java serializar determinado atributo
	private static String nomeEscola="DevScholl";
	private transient Turma turma;
	
	public Aluno(long id, String nome, String password) {
		System.out.println("Dentro do construtor");
		this.id= id;
		this.nome=nome;
		this.password=password;
	
	}
	
	 private void writeObject(ObjectOutputStream oos){
	        try{
	            oos.defaultWriteObject();
	            oos.writeUTF(turma.getNome());
	        }catch (IOException e){
	            e.printStackTrace();
	        }
	    }

	    private void readObject(ObjectInputStream ois){
	        try{
	            ois.defaultReadObject();
	            turma = new Turma(ois.readUTF());
	        }catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	
	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

	public static String getNomeEscola() {
		return nomeEscola;
	}
	
	public static void setNomeEscola(String nomeEscola) {
		Aluno.nomeEscola = nomeEscola;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", password=" + password + ", turma=" + turma + "]";
	}
	

}
