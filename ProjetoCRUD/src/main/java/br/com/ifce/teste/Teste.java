package br.com.ifce.teste;

import br.com.ifce.controller.FilmeController;
import br.com.ifce.model.Filme;

public class Teste {

	public static void main(String[] args) {

		FilmeController filmeController = new FilmeController();
		Filme filme = new Filme();

		filme.setTitulo("Os Incriveis");
		filme.setCategoria("Ação");
		filme.setPreco(15);
		filme.setDuracaoDoFilme(120);
		
		filmeController.cadastrarFilme(filme);
		
		filme.setTitulo("Vingadores");
		filme.setCategoria("Ação");
		filme.setPreco(20);
		filme.setDuracaoDoFilme(180);

		filmeController.cadastrarFilme(filme);
		
		filme.setTitulo("Senhor_dos_Aneis");
		filme.setCategoria("Ação");
		filme.setPreco(50);
		filme.setDuracaoDoFilme(300);

		filmeController.cadastrarFilme(filme);
		
		Filme filmeR = new Filme();
		filmeR = filmeController.buscarFilme(2L);
		System.out.println(filmeR.getTitulo());
		
		Filme filmeAtualizar = filmeController.buscarFilme(2L);
		filmeAtualizar.setTitulo("Guerra Infinita");
		filmeAtualizar.setCategoria("Herois");
		filmeAtualizar.setPreco(21);
		filmeAtualizar.setDuracaoDoFilme(185);
		
		filmeController.atualizarFilme(filmeAtualizar);
		
		//filmeController.excluirFilme(3L);
		//filmeR = filmeController.buscarFilme(2L);
		//System.out.println(filmeR.getTitulo());
	}

}
