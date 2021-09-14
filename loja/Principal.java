package loja;

public class Principal {

	public static void main(String[] args) {
		Endereco end1 = new Endereco();
		end1.setRua("bananal");
		end1.setNumero("996395383");
		end1.setCep("000");
		end1.setBairro("arquipelago");
		end1.setCidade("porto alegre");
		end1.setEstado("rs");
		
		
		Cliente clt1 = new Cliente();
		clt1.endereco = end1;
		
		System.out.println("O clinte mora na rua "+clt1.getEndereco().getRua());
		System.out.println("O clinente tem o numero "+clt1.getEndereco().getNumero());
		System.out.println("O cliente tem o cep "+clt1.getEndereco().getCep());
		System.out.println("O cliente mora no bairro "+clt1.getEndereco().getBairro());
		System.out.println("O cliente mora na cidade "+clt1.getEndereco().getCidade());
		System.out.println("O clinte mora no estado "+clt1.getEndereco().getEstado());
		
		
		Produtos pdt2 = new Produtos();
		pdt2.sapato = "39,44";
		pdt2.roupa = "P adulto,G infantil";
		pdt2.decoracoes = "Festas,lazer";
		
		Stoque stq2 = new Stoque();
		stq2.produtos = pdt2; 
		
		System.out.println("Os produtos disponiveis são spatos "+stq2.produtos.sapato);
		System.out.println("Os produtos em andamento são roupas "+stq2.produtos.roupa);
		System.out.println("Os produtos em falta são decorações para "+stq2.produtos.decoracoes);
		
		
		
		
	
	
	

}
