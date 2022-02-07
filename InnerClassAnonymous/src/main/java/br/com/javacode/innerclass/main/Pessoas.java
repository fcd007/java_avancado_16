package br.com.javacode.innerclass.main;

public class Pessoas {

	private Long id;

	private String nome;

	private String CPF;

	public Pessoas() {

	}

	public Pessoas(Long id, String nome, String cPF) {
		this.id = id;
		this.nome = nome;
		CPF = cPF;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	@Override
	public String toString() {
		return "id: " + id + ", nome: " + nome;
	}

}
