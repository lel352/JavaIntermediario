package training.cursojava.aula60;

public class Teste {

	public static void main(String[] args) {
		EscopoVariaveis escopoVariaveis = new EscopoVariaveis();
		escopoVariaveis.setValor(10);
		
		System.out.println(escopoVariaveis.getValor());
		System.out.println();
		System.out.println(escopoVariaveis.calcularValor(20));
		System.out.println();
		System.out.println(escopoVariaveis.getValor());
		System.out.println();
		System.out.println(escopoVariaveis.teste());
		System.out.println();
		System.out.println(escopoVariaveis.getValor());
		System.out.println();
		escopoVariaveis.outroTeste();
		System.out.println();
		escopoVariaveis.maisUmTeste();
		System.out.println();
		escopoVariaveis.maisUmOutroTeste(10);
	}

}
