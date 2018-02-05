package training.cursojava.aula56Exercicio;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operacao[] operacoes = Operacao.values();
		double x  = 5;
		double y  = 2;
		
		for (Operacao operacao : operacoes) {
			System.out.println(x+operacao.toString()+y+" = "+operacao.executarOperacao(x,y));
		}

	}

}
