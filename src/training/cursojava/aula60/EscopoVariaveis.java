package training.cursojava.aula60;

public class EscopoVariaveis {
	
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int calcularValor(int valor) {
		valor = valor + 10;
		return valor;
	}
	

}
