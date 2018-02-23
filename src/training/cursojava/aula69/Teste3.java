package training.cursojava.aula69;

public class Teste3 {
	
	public static void main(String[] args) {
		
		MinhaThreadRunnable minhaThreadRunnable1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable minhaThreadRunnable2 = new MinhaThreadRunnable("#2", 1000);
		MinhaThreadRunnable minhaThreadRunnable3 = new MinhaThreadRunnable("#3", 600);
		
		Thread thread1 = new Thread(minhaThreadRunnable1);
		Thread thread2 = new Thread(minhaThreadRunnable2);
		Thread thread3 = new Thread(minhaThreadRunnable3);
		
		thread1.start();
		
		/*	try {
			thread1.join(200);// após inicar a thread 1 o codigo fica dormindo por 200milisegundos antes de seguir para proxima interação thread 2 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		thread2.start();
		
		
		/*try {
			thread2.join(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		thread3.start();
		
		/*try {
			thread3.join(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {/// mais elegante
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Programa finalizado!!!");
	}

}
