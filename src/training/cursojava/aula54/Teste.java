package training.cursojava.aula54;

public class Teste {

	public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;
        
        System.out.println(dia.toString());
        System.out.println(dia.getValor());
        
        
        Data data = new Data(1,4,2016,DiaSemana.SEXTA);
	}

}
