package training.cursojava.aula73;

public class Teste {

	public static void main(String[] args) {
		MinhaThread minhaThread = new MinhaThread("#1");
		MinhaThread minhaThread2 = new MinhaThread("#2");
		
		System.out.println("Pausando a Thread #1");
		
		minhaThread.suspend();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Pausando a Thread #2");
		
		minhaThread2.suspend();
		
		
		System.out.println("Resumindo a Thread #2");
		minhaThread.resume();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Resumindo a Thread #2");
		
		minhaThread2.resume();
		
		System.out.println("Terminando a Thread #2");
		
		minhaThread2.stop();

	}

}
