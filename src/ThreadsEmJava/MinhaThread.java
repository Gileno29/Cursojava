package ThreadsEmJava;

public class MinhaThread extends Thread{
	private String nome;
	private int tempo;
	
	public MinhaThread(String nome, int tempo) {
		this.nome= nome;
		start();
		this.tempo=tempo;
	}
	
	public void run() {
		try {
			for(int i=0; i<5;i++) {	
				System.out.println(this.nome+"Executando a thread");
				Thread.sleep(this.tempo);
			}
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
