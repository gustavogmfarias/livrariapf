package service;

import javax.ejb.Stateless;

import modelo.Livro;

@Stateless
public class LivroService extends GenericService<Livro>{

	public LivroService(Class<Livro> classe) {
		super(classe);
		// TODO Auto-generated constructor stub
	}

	
	
}
