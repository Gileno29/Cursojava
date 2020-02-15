package ThreadsEmJava;

public class TesteRunnable {
	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1",900);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2",900);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3",900);
		
		Thread t1= new Thread(thread1);
		Thread t2= new Thread(thread2);
		Thread t3= new Thread(thread3);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		while(t1.isAlive()|| t2.isAlive() || t3.isAlive()) {
			try {
				Thread.sleep(200);
				
				
			}catch(InterruptedException e){
				e.printStackTrace();
				
			}
			
			
			
		}
		System.out.println("Programa Finalizado");
		
		
	}

}
