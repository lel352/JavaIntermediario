package training.cursojava.aula71;

public class MinhaThreadSoma implements Runnable {
	
	private String nome;
	private int[] numeros;
	private static Calculadora calculadora = new Calculadora();

	public MinhaThreadSoma(String nome, int[] numeros) {
		this.nome = nome;
		this.numeros = numeros;
		new Thread(this,nome).start();
		//Thread t = new Thread(this, nome);
		//t.start();
	}

	@Override
	public void run() {
		System.out.println(this.nome+ " Iniciando");
		int soma = calculadora.somaArray(this.numeros);
		System.out.println("Resultado da soma da Thread "+this.nome+" � "+soma);
		System.out.println(this.nome+ " Terminado");
	}
}
