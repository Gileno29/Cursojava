package ThreadsEmJava;

public class MinhaThreadRunnable implements Runnable{
	private String nome;
	private int tempo;
	
	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome=nome;
		this.tempo= tempo;
		//Thread t= new Thread(this);//passa a instância de MinhaThreadRunnable para a instancia de Thred
		//t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
			try {
				for(int i=0; i<6;i++) {
					System.out.println(this.nome+"contador"+this.tempo);
					Thread.sleep(this.tempo);
				}	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(this.nome+" Terminou a Execução");
		
	}

}
