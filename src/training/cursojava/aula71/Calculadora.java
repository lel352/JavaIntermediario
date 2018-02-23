package training.cursojava.aula71;

public class Calculadora {
	
	private int soma;
	
	//Apenas uma Thread pode acessa esse metodo por vez
	public synchronized int somaArray(int[] array) {
		soma = 0;
		
		for (int i : array) {
			soma += i;
			
			System.out.println("Executando a soma"+Thread.currentThread().getName()
					+ " Somando o valor "+i+ " Com a soma atual de "+soma);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return soma;		
	}
}
