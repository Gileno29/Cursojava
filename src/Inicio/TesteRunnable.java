package Inicio;

import ThreadsEmJava.MinhaThreadRunnable;

public class TesteRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MinhaThreadRunnable thread1= new MinhaThreadRunnable("Thread #1",1000);
		MinhaThreadRunnable thread2= new MinhaThreadRunnable("Thread #2",500);
		MinhaThreadRunnable thread3= new MinhaThreadRunnable("Thread #3",1500);
		
	
	}

}
