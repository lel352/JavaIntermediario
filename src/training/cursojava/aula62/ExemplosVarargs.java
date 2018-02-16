package training.cursojava.aula62;

public class ExemplosVarargs {

	public static void main(String[] args) {
		
		System.out.println(soma(1,2));
		System.out.println(soma(1,2,3));
		
		int[] vetor = {1,2,3,4,5};
		System.out.println(soma(vetor));
		
		
		//Varargs
		System.out.println(soma(1,2,3,4,5,6,7,8,9,10));

	}
	
	static int soma(int a, int b) {
		return a + b; 
	}
	
	static int soma(int a, int b, int c) {
		return a + b + c; 
	}
	
	static int soma(int[] vetor) {
		int total = 0;
		for (int i : vetor) {
			total += i;
		}
		
		return total;
	}
	
	//Varargs o tipo do parametro tem que uma Classe
	//Sempre Tipo como Classe e depois "..." e nome do parametro
	static int soma(Integer... vetor) {
		int total = 0;
		for (int i : vetor) {
			total += i;
		}
		
		return total;
	}
	
	//Varargs é o ultimo paramentro colocado na função, nunca antes da erro e o sistema 
/*	static int soma(int a, int b,Integer... vetor) {
		int total = 0;
		for (int i : vetor) {
			total += i;
		}
		
		return total;
	}*/

}
