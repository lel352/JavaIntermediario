package training.cursojava.aula68;
public class Teste {

	public static void main(String[] args) {
	
		MinhaThreadRunnable minhaThreadRunnable1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable minhaThreadRunnable2 = new MinhaThreadRunnable("#2", 1000);
		MinhaThreadRunnable minhaThreadRunnable3 = new MinhaThreadRunnable("#3", 600);
	}

}
