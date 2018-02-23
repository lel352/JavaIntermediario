package training.cursojava.aula68;

import javax.swing.plaf.SliderUI;

public class MinhaThreadRunnable implements Runnable {

	private String nome;
	private int tempo;



	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		Thread thread = new Thread(this);
		thread.start();
	}



	@Override
	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome+" contator "+ i);
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nome+" teminou a execução ");
	}

}
