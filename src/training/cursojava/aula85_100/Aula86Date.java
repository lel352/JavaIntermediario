package training.cursojava.aula85_100;

import java.util.Date;

public class Aula86Date {

	public static void main(String[] args) {
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		System.out.println("Milisegundo desde 1 jan 1970"+hoje.getTime());
		
		//dia do mes - (risco) depreciado, quer dizer que tem forma melhor
		System.out.println(hoje.getDate());
		
		
		
		
		

	}

}
