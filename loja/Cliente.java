package loja;

public class Cliente {
	private String nome;
	private String numero;
	private String email;
	private Endereco endereco;
	
	public Cliente(String numero, String email, Endereco endereco) {
		this.numero = numero;
		this.email = email;
		this.endereco = endereco;
	}
	public Cliente(String nome, String numero, String email,
			Endereco endereco) {
		this.nome = nome;
		this.numero = numero;
		this.email = email;
		this.endereco = endereco;
		
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	
	
	
	
	
}
