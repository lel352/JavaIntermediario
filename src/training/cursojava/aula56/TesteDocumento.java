package training.cursojava.aula56;

public class TesteDocumento {

	public static void main(String[] args) {
       
		for (TipoDocumento doc : TipoDocumento.values()) {
			System.out.println(doc+ " "+doc.geraNumeroTeste());
		}
		
		Pessoa pessoaF = new Pessoa();
		
		pessoaF.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pessoaF.setNumeroDocumento(pessoaF.getTipoDocumento().geraNumeroTeste());
		
		
		System.out.println(pessoaF.toString());
		
		
		Pessoa pessoaJ = new Pessoa();
		
		pessoaJ.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pessoaJ.setNumeroDocumento(pessoaJ.getTipoDocumento().geraNumeroTeste());
		
		
		System.out.println(pessoaJ.toString());
		
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setTipoDocumento(TipoDocumento.CNPJ);
		pessoa.setNumeroDocumento(pessoa.getTipoDocumento().geraNumeroTeste());
		
		
		System.out.println(pessoa.toString());

	}

}
