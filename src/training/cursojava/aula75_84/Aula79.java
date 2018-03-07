package training.cursojava.aula75_84;

public class Aula79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String banana = "banana";
		String ana = "ana";
		System.out.println(banana.indexOf('a'));// indice 1 - primeira vez que aparece
		System.out.println(banana.indexOf('x'));//-1 caso não encontre
		System.out.println(banana.indexOf('b'));// indice 0
		System.out.println(banana.indexOf(ana));
		
		System.out.println(banana.lastIndexOf('a'));//indice 5-ultima vez que aparece o 'a'
		System.out.println(banana.lastIndexOf(ana));//indice 3-ultima vez que aparece o 'ana'
		
		System.out.println(banana.contains(ana));// true ou false se existe 
		System.out.println(banana.contains("nac"));// true ou false se existe
	}

}
