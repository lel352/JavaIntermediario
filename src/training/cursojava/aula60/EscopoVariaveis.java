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
	
	public int teste() {
		int valor = 5;
		
		if (true) {
			valor--;
		}
		return valor;
			
	}
	
	
	public void outroTeste() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}// não da par usar o i fora do for
			
		int j;
		for (j = 0; j < 10; j++) {
			System.out.println(j);
		}
		System.out.println(j);
	}
	
	public void maisUmTeste() {
		boolean flag = true;
		
		if (flag) {
			int umaVariavel = 10;
			umaVariavel++;
			System.out.println(umaVariavel);
		} //int umaVariavel ta dentro do if não da para acessar fora dele
		//System.out.println(umaVariavel);
	}
	
	public void maisUmOutroTeste(int numero) {
		int total = 0;
		try {
			int outroNumero = 0;
			
			total = numero/outroNumero;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			total++;
			//outroNumero++ não consegue acessar variavel de outro escopo o do try			
		}
		numero++;
		//outroNumero++ não consegue acessar variavel de outro escopo o do try
	}

}
