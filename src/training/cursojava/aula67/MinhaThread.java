
package training.cursojava.aula67;

public class MinhaThread  extends Thread{

	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome+" contado "+i);
				Thread.sleep(tempo);
			}	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(nome+" Fim de Execu��o");
	}

}
