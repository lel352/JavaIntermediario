package training.cursojava.aula85_100;

import java.util.Calendar;
import java.util.GregorianCalendar; 

public class Aula88GregorianCalendar {

	public static void main(String[] args) {
		
		//GregorianCalendar extends Calendar
		GregorianCalendar hoje = new GregorianCalendar();
		
		Imprimidar(hoje);
		
		System.out.println(hoje.isLeapYear(2017));//não é bissesto
		System.out.println(hoje.isLeapYear(2020));//é bissesto
		
	//System.out.println(hoje);
		//mes começão com zero
		GregorianCalendar hoje2 = new GregorianCalendar(2017,0,1);
				
				Imprimidar(hoje2);

	}
	
	private static void Imprimidar(Calendar hoje) {
		System.out.println();
		System.out.println(hoje);		
		System.out.println(hoje.getTime());
		
		int ano =  hoje.get(Calendar.YEAR);
	    System.out.println(ano);
	    
		int mes =  hoje.get(Calendar.MONTH);
		System.out.println(mes);//0 -janeiro - 1 -fevereiro
		System.out.println(Calendar.JANUARY);
		
		int dia =  hoje.get(Calendar.DAY_OF_MONTH);
		System.out.println(dia);
		
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);
		int minutos = hoje.get(Calendar.MINUTE);
		System.out.println(minutos);
		int segundos = hoje.get(Calendar.SECOND);
		System.out.println(segundos);
		
		
		System.out.printf("hoje é: %02d/%02d/%d %02d:%02d:%02d", dia,(mes+1), ano, hora, minutos, segundos);
		System.out.println();
		hoje.add(Calendar.DAY_OF_MONTH, 5);//somou 5 dias ao dia atual 
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		hoje.add(Calendar.DAY_OF_MONTH, -10);//diminuiu 10 dias ao dia atual 
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		System.out.println();
	}

}
