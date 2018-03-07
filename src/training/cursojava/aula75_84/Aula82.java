package training.cursojava.aula75_84;

public class Aula82 {

	public static void main(String[] args) {
		String alfabeto = String.join(", ", "A","B","C","D");
		System.out.println(alfabeto);
		
		
		//", " mesmo expresão para os dois, pegar o que tiver diferente de ", " 
		String[] letras = alfabeto.split(", ");
		
		for (String letra : letras) {
			System.out.println(letra);
		}
		
		String doArquivo = "1:Antonio:30";
		String[] infos = doArquivo.split(":");
		for (String info : infos) {
			System.out.println(info);
		}
		Pessoa pessoa = new Pessoa(Integer.parseInt(infos[0]),infos[1],Integer.parseInt(infos[2]));
		System.out.println(pessoa);
		
	}

}
