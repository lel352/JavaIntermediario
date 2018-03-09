package training.cursojava.aula85_100;

public class Aula85 {

	public static void main(String[] args) {
		System.out.println(Math.pow(2, 3));//eleveado;
		
		System.out.println(Math.round(4.7));//Arredonda;
		System.out.println(Math.round(4.4));//Arredonda;

		System.out.println(Math.ceil(4.7));//Arredonda para cima;
		System.out.println(Math.ceil(4.4));//Arredonda para cima;
		
		System.out.println(Math.floor(4.7));//Arredonda para baixo;
		System.out.println(Math.floor(4.4));//Arredonda para baixo;
		
		System.out.println(Math.random()); //Aleatorio sempre com varias casa decimais
		System.out.println(Math.round(Math.random()*10)); //Aleatorio de 0 a 10
		
		System.out.println(Math.sin(Math.toRadians(30))); //Seno 30º
		
		System.out.println(Math.cos(Math.toRadians(1))); //coseno 1º
		
		System.out.println(Math.tan(Math.toRadians(45))); //tangente 45º

	}

}
