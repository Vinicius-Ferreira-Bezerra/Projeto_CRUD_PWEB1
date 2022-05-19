package br.com.ifce.controller;

import br.com.ifce.model.Filme;
import br.com.ifce.service.FilmeService;

public class FilmeController {

	private FilmeService filmeService = new FilmeService();
	
	public void cadastrarFilme(Filme filme){
		filmeService.cadastrarFilme(filme);
	}
	public void atualizarFilme(Filme filme){
		filmeService.atualizarFilme(filme);
	}
	public Filme buscarFilme(Long Id){
		Filme filme = filmeService.buscarFilme(Id);
		return filme;
	}
	public void excluirFilme(Long Id) {
		filmeService.excluir(Id);
	}
}
