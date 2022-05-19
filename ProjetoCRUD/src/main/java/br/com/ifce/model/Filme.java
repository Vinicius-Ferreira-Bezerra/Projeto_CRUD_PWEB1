package br.com.ifce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; 
	
	private String titulo;
	private String categoria;
	private double preco;
	private int duracaoMinutos;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getDuracaoDoFilme() {
		return duracaoMinutos;
	}
	public void setDuracaoDoFilme(int duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}
	@Override
	public String toString() {
		return "Filme [id=" + id + ", titulo=" + titulo + ", categoria=" + categoria + ", preco=" + preco
				+ ", duracaoMinutos=" + duracaoMinutos + "]";
	}
}
