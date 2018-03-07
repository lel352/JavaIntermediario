package training.cursojava.aula74Exercicio;

public class SimuladorSemafaroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSemafaro threadSemafaro = new ThreadSemafaro();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(threadSemafaro.getCor());
			threadSemafaro.esperaCorMudar();					
		}
		
		threadSemafaro.desligarSemafaro();
	}
}
