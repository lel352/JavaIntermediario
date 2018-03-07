package training.cursojava.aula75_84;

public class Aula83 {

	public static void main(String[] args) {
		String[] letras = {"A","B","C","D","F"};
		
		String alfabeto = "";
		
		System.out.println(alfabeto);
		
		for (String letra : letras) {
			alfabeto  += letra;
		}
		System.out.println(alfabeto);
		
		//thread-safe
		StringBuffer sb = new StringBuffer();
		for (String letra : letras) {
			 sb.append(letra);
		} 
		
		alfabeto = sb.toString();
		
		System.out.println(alfabeto);
		
		alfabeto = new String(sb);
		
		System.out.println(alfabeto);
		
		System.out.println(sb.reverse());

		//Não thread-safe
		StringBuilder sBuilder = new StringBuilder();
		for (String letra : letras) {
			 sBuilder.append(letra);
		} 
		
		alfabeto = sBuilder.toString();
		
		System.out.println(alfabeto);
		
	}

}
