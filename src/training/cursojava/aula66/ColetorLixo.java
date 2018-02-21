package training.cursojava.aula66;

import training.cursojava.aula61.Contato;

public class ColetorLixo {
	
	public static void obterMemoriaUsada() {
		final int MB = 1024*1024;
		
		Runtime runtime = Runtime.getRuntime();//Singleton
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Contato[] contatos = new Contato[10000];
		Contato contato;
		
		for (int i = 0; i < contatos.length; i++) {
			contato = new Contato("Contato"+i, "123-"+i, "Contato"+i+"@email.com");
			contatos[i] = contato; 
		}
		
		System.out.println("Contatos Criados");
		obterMemoriaUsada();
		contatos = null;
		
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos Removidos");
		obterMemoriaUsada();

	}

}
