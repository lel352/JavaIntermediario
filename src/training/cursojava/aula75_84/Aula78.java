package training.cursojava.aula75_84;

public class Aula78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";
		String ola4 = new String(ola);
		
		System.out.println("ola equals ola2 = "+ola.equals(ola2)); //false
		System.out.println("ola equals ola3 = "+ola.equals(ola3)); //true
		
		
		System.out.println("ola equalsIgnoreCase ola2 = "+ola.equalsIgnoreCase(ola3)); //Tru
		
		System.out.println("ola == ola2 = "+(ola == ola2)); //false
		System.out.println("ola == ola3 = "+(ola == ola3)); //True //Conteudos iguais  - usa a mesma referencia de memoria
		System.out.println("ola == ola4 = "+(ola == ola4)); //false //new cria novo local na memoria 
		System.out.println("ola equals ola2 = "+ola.equals(ola4)); //True comparando conteudo da string
		
		String banana = "banana";
		String ana = "ana";
		String ban = "Ban";
		
		//começar do indicie - string que quer comparar - (da string a procurar do caracter inicial e final) - (da string a procurar do caracter inicial e final)  
		System.out.println(banana.regionMatches(1, ana, 0, 3));
		System.out.println(banana.regionMatches(1, ana, 1, 2));//(0-a 1-n 2-a) na = an  (0-b 1-a 2-n 3-a)
		System.out.println(banana.regionMatches(2, ana, 1, 2));//(0-a 1-n 2-a) na = na  (0-b 1-a 2-n 3-a)
		
		//ignore case- string que quer comparar - (da string a procurar do caracter inicial e final) - (da string a procurar do caracter inicial e final)
		System.out.println(banana.regionMatches(true,0, ban, 0, 3));
		System.out.println(banana.regionMatches(false,0, ban, 0, 3));//ban <> Ban
		
		System.out.println(banana.endsWith(ana)); // banana termina com ana  = true
		System.out.println(banana.startsWith(ban)); //  banana inicia com Ban  = FALSE é casesensitive
		System.out.println(banana.startsWith("ban")); // banana inicia com ban  = true
		
		
		String a = "a";
		String b = "b";
		String aMaisculo = "A";
		
		System.out.println(a.compareTo(b)); 
		//-1 quando a > b
		//0 quando a == b
		//1 ou >1 quando a < b
		
		
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareTo(aMaisculo));
		
		

	}

}
