package training.cursojava.aula74Exercicio;

public enum CorSemafaro {
	
	VERDE(1000),AMARELO(300),VERMELHO(2000);
	
	private int tempoEspera;
	
	private CorSemafaro(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	}

	public int getTempoEspera() {
		return tempoEspera;
	}

	public void setTempoEspera(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	}
	
	
}
