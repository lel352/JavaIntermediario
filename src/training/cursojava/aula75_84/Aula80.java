package training.cursojava.aula75_84;

public class Aula80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String teste = "isso � um texte.";
		System.out.println(teste);
		System.out.println(teste.substring(10)); //indice de inicio
		System.out.println(teste.substring(10,15)); //indice de inicio e fim(n�o sendo inclusivo)
		
		
		String ola = "ol�";
		String mundo = " mundo";
	    String olaMundo = ola.concat(mundo); //ola + mundo
	    System.out.println(olaMundo);
	    
	    
	    String espacos = "i s p a � o";
	    System.out.println(espacos);
	    String semEspacos = espacos.replace('i', 'e');
	    System.out.println(semEspacos);
	    semEspacos = semEspacos.replaceAll(" ", "");
	    System.out.println(semEspacos);
	    
	    String nome = " meu nome �: ";
	    System.out.println(nome);
	    System.out.println(nome.trim());
	    System.out.println(nome);
	    
	    

	}

}
