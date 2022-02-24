package service;

import javax.ejb.Stateless;

import modelo.Autor;

@Stateless
public class AutorService extends GenericService<Autor>{

	public AutorService() {
		super(Autor.class);
		// TODO Auto-generated constructor stub
	}


	
}
