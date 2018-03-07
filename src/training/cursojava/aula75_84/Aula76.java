package training.cursojava.aula75_84;

public class Aula76 {

	public static void main(String[] args) {
		String curso = "Curso ";
		String java = "Java";

		String cursoJava = curso + java;
		System.out.println(cursoJava);

		String resultado2com2 = "Resultado de 2+2 = "+(2+2);
		System.out.println(resultado2com2);

		String resultado2com2_ = "Resultado de 2+2 = "+2 + 2;//sem parentes ele transforma o 2 em uma string
		System.out.println(resultado2com2_);

		String um = String.valueOf(1);
		System.out.println(um);

		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus porta cursus ligula et eleifend. "
				+"Nullam a ex ultricies, dignissim purus vel, lacinia lorem. Curabitur quis blandit arcu. "
				+"Pellentesque imperdiet ante eget dui rutrum, malesuada consectetur odio sollicitudin. "
				+ "Maecenas mollis lobortis tellus, a placerat sapien lacinia a. Sed id facilisis ipsum. "
				+ "Curabitur a dui risus. Praesent ullamcorper sem vitae lectus tristique elementum. ";

		System.out.println(concatenacao);

		String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus porta cursus ligula et eleifend. ";
		concatenacao2 += "Nullam a ex ultricies, dignissim purus vel, lacinia lorem. Curabitur quis blandit arcu. ";
		concatenacao2 += "Pellentesque imperdiet ante eget dui rutrum, malesuada consectetur odio sollicitudin. ";
		concatenacao2 += "Maecenas mollis lobortis tellus, a placerat sapien lacinia a. Sed id facilisis ipsum. ";
		concatenacao2 += "Curabitur a dui risus. Praesent ullamcorper sem vitae lectus tristique elementum. ";
		
		//é ruim fazer isso, cada interação anterior é uma string nova criada e a antiga fica livre para ser pega pelo coletor de lixo do java 

		System.out.println(concatenacao2);


	}

}
