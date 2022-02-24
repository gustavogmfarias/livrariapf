package controle;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import modelo.Autor;
import service.AutorService;

@ManagedBean
public class AutorBean {
	private Autor autor = new Autor();
	private List<Autor> autores;

	@EJB
	private AutorService autorService;

	public void gravarAutor() {
		autorService.create(autor);
		autor = new Autor();
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

}
