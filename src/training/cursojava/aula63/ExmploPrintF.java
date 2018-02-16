package training.cursojava.aula63;

public class ExmploPrintF {

	public static void main(String[] args) {
		
		// %s String
		System.out.printf("Hello %s ", "Ol�, Mundo!");
		System.out.println();
		// %S maiusculo Deixa tudo maiusculo
		System.out.printf("Hello %S ", "Ol�, Mundo!"); 
		System.out.println();
		//%c - caracter
		System.out.printf("%c ",'c');
		System.out.println();
		System.out.printf("%C ",'c');	
		System.out.printf("%n ",'c'); //Nova Linha
		
		int valor = 123456789;
		
		//%d para numero Inteiro
		System.out.printf("%d ",valor);
		System.out.println();
		
		double pontoFlutuante = 3.685477897;
		//%f ponto Flutuante
		System.out.printf("%f ",pontoFlutuante);
		System.out.println();
		
		String olaMUndo = "Ola Mundo";
		//Fazendo a String ocupar no 20 caracteres
		//por padr�o alinhamento a direita 
		System.out.printf("%20s ", olaMUndo);
		System.out.println();
		//alinhamento a Esquerda
		System.out.printf("%-20s ", olaMUndo);
		
		System.out.println();
		//+ na frente faz ele Imprimir se o numero � positivo ou negativo 
		System.out.printf("%+d ",valor);
		valor = -23;
		System.out.println();
		System.out.printf("%+d ",valor);
		
		valor = 3423343;
		System.out.println();
		// faz ele ter quinze posi��es onde pode ou n�o completar com zero
		System.out.printf("%015d ",valor);
		System.out.println();
		//Separa as milhagens
		System.out.printf("%,d ",valor);
		
		int valor2 = -123456789;
		//% d com espa�o antes do "d" se o numero for negativo imprimi o sinal
		System.out.printf("% d ",valor);
		System.out.println();
		
		//.3 dita quantos numeros tera depois da virgula, arredonda tamb�m 
		System.out.printf("%.3f ",pontoFlutuante);
		System.out.println();
		
		//10.3 dita quantos numeros tera antes e depois da virgula, arredonda tamb�m 
		System.out.printf("R$%10.3f ",pontoFlutuante);
		System.out.println();
		
		testeMaisCompleto();
				
	}
	
	private static void testeMaisCompleto() {
		double[] precos = {10000, 123.54, 455.00, 89.25};
		
		for (int i = 0; i < precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f %n","Item",i+1,precos[i]);
		}
		
	}

}
