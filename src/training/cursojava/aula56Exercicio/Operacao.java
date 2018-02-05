package training.cursojava.aula56Exercicio;

public enum Operacao {

	SOMA('+'){
		@Override
		public double executarOperacao(double x, double y) {
			return x+y;
		}
	}, 
	SUBTRAIR('-'){
		@Override
		public double executarOperacao(double x, double y) {
			return x-y;
		}
	}, 
	MULTIPLICAR('*'){
		@Override
		public double executarOperacao(double x, double y) {
			return x*y;
		}
	}, 
	DIVIDIR('/'){
		@Override
		public double executarOperacao(double x, double y) {
			return x/y;
		}
	};
	
	private char simbolo; 
	
	Operacao(char simbolo) {
		this.simbolo = simbolo;
	}
	
	public char getSimbolo() {
		return this.simbolo;
	}
	
	public abstract double executarOperacao(double x, double y);
 
	@Override
	public String toString() {
		return String.valueOf(this.simbolo);
	}

}
