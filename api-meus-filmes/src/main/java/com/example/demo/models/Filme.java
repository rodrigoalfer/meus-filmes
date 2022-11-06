package com.example.demo.models;

@Entity
public class Filme {
	private int id;
	private String titulo;
	private int ano;
	private int duracao;
	private String genero;
	private String pais;
	private String diretor;
	private String atores;
	
	public Filme() {
		
	}
	
	public Filme(int id, String titulo, int ano, int duracao, String genero, String pais, String diretor, String atores) {
		this.id=id;
		this.titulo=titulo;
		this.ano=ano;
		this.duracao=duracao;
		this.genero=genero;
		this.pais=pais;
		this.diretor=diretor;
		this.atores=atores;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId(){
		return id;
	}
	
	/*public int getId() {
		return id;
	}*/
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getAtores() {
		return atores;
	}
	public void setAtores(String atores) {
		this.atores = atores;
	}
	
}
