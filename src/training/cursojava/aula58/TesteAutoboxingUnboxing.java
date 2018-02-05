package training.cursojava.aula58;

public class TesteAutoboxingUnboxing {

	public static void main(String[] args) {

		//Autoboxing - objeto pegar um tipo primitivo java 5 para cima
		//assim não precisa usar um construtor
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 100l;
		Float num11 = 3.5f;
		Double num12 = 3.5555;
		Boolean flag2 = true;
		Character b = 'b';
		
		//Auto Unboxing tipo primitivo = pegar um objeto
		int num13 = num9; //num9.intValue();

		//Autoboxing em expressoes;		
		num9++;
		
		System.out.println(num9);
		
		//Auto Unboxing num9 -> Autoboxing num13/num9
		Integer num14 = num13/num9;
		
		//mau uso
		Double a, b2, c;
		a = 10.0; //Autoboxing 
		b2 = 12.2; //Autoboxing 
		c = 4.7;  //Autoboxing 
		
		Double media = (a+b2+c)/3;//Auto Unboxing
		System.out.println(media);

	}

}
