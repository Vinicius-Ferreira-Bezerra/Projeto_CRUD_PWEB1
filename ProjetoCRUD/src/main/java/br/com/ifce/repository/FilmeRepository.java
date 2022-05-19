package br.com.ifce.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.ifce.config.HibernateConfig;
import br.com.ifce.model.Filme;

public class FilmeRepository {

	public void salvar(Filme filme) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();

		transacao = session.beginTransaction();

		session.save(filme);

		transacao.commit();
		System.out.println("Filme Cadastrado Com Sucesso!");
	}

	public void atualizar(Filme filme) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();

		transacao = session.beginTransaction();
		
		session.saveOrUpdate(filme);
		
		transacao.commit();
		
		System.out.println("Filme Atualizado para:"+ filme.getTitulo());
	}

	public Filme buscar(Long id) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();

		transacao = session.beginTransaction();
		
		Filme filme = session.get(Filme.class, id);
		
		transacao.commit();
		
		return filme;
	}

	public void excluir(Long id) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();

		transacao = session.beginTransaction();
		
		Filme filme = session.get(Filme.class, id);
		
		session.remove(filme);
		
		transacao.commit();
		System.out.println("Filme excluido com sucesso!");
	}
}