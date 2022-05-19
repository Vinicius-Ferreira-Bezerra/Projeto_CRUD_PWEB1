package br.com.ifce.service;

import br.com.ifce.model.Filme;
import br.com.ifce.repository.FilmeRepository;

public class FilmeService {
	FilmeRepository filmeRepo = new FilmeRepository();

	public void cadastrarFilme(Filme filme){
		filmeRepo.salvar(filme);
	}
	public void atualizarFilme(Filme filme){
		filmeRepo.atualizar(filme);
	}
	public Filme buscarFilme(Long id){
		Filme filme = filmeRepo.buscar(id);
		return filme;
	}
	public void excluir(Long id) {
		filmeRepo.excluir(id);
	}
}
