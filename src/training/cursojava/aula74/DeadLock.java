package training.cursojava.aula74;

public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final String RECURSO1 = "Recurso #1";
		final String RECURSO2 = "Recurso #2";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (RECURSO1) {
					System.out.println("Thread #1: bloqueou o recurso numero 1");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Thread #1: Tentando acesso no recurso numero 2");
					
					
					synchronized (RECURSO2) {
						System.out.println("Thread #2: bloqueou o recurso numero 2");
						
					}
				}
			}
		};
		
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (RECURSO2) {
					System.out.println("Thread #2: bloqueou o recurso numero 2");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Thread #2: Tentando acesso no recurso numero 1");
					
					
					synchronized (RECURSO1) {
						System.out.println("Thread #2: bloqueou o recurso numero 1");
						
					}
				}
			}
		};
		
		
		t1.start();
		t2.start();

	}

}
