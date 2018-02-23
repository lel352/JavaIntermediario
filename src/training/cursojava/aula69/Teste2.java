package training.cursojava.aula69;

public class Teste2 {
	
	public static void main(String[] args) {
		
		MinhaThreadRunnable minhaThreadRunnable1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable minhaThreadRunnable2 = new MinhaThreadRunnable("#2", 1000);
		MinhaThreadRunnable minhaThreadRunnable3 = new MinhaThreadRunnable("#3", 600);
		
		Thread thread1 = new Thread(minhaThreadRunnable1);
		Thread thread2 = new Thread(minhaThreadRunnable2);
		Thread thread3 = new Thread(minhaThreadRunnable3);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		while(thread1.isAlive() || thread2.isAlive() || thread3.isAlive()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Programa finalizado!!!");
	}

}
