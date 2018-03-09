package training.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z Z hh:mm:ss a dd/MMM/yyyy");

		Calendar data = new GregorianCalendar(2010,2,24,14,32,25);
		
		System.out.println(sdf.format(data.getTime()));
		
		Date hoje = new Date();
		
		System.out.println(sdf.format(hoje));
		String d = sdf.format(hoje);
		System.out.println(d);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "20/02/2000";
		
		try {
			Date minhaDataemDate = sdf1.parse(minhaData);
			System.out.println(minhaDataemDate);
			System.out.println(sdf.format(minhaDataemDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
						

	}

}
