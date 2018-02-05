package training.cursojava.aula55;

import training.cursojava.aula54.DiaSemana;

public class TesteNum {
	
	public static void main(String[] args) {
		
		DiaSemana[] dias = DiaSemana.values(); //Obter todos os valores dentro de um enumerador 
		                                       //em uma array
		
		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		System.out.println();
		for (DiaSemana diaSemana : dias) {
			System.out.println(diaSemana);
		}
		System.out.println();
		for (DiaSemana diaa : DiaSemana.values()) {
			System.out.println(diaa);
		}
	}

}
