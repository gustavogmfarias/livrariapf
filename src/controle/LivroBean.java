package controle;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import modelo.Autor;
import modelo.Livro;
import service.AutorService;
import service.LivroService;

@ViewScoped
@ManagedBean
public class LivroBean {

	@EJB
	private AutorService autorService;

	@EJB
	private LivroService livroService;

	private Livro livro = new Livro();
	private List<Livro> livros;
	private List<Autor> autores;
	private Long idAutor = 0L;

	@PostConstruct
	public void init() {
		carregarLivros();
		autores = autorService.listAll();
	}
	
	public void carregarLivros() {
		livros = livroService.listAll();
	}
	
	public void addAutor() {
		Autor a = autorService.obtemPorId(idAutor);
		livro.adicionarAutor(a);
		idAutor=0L;

	}
	
	public void gravarLivro(Livro livro) {
		livroService.create(livro);
		livro = new Livro();
		carregarLivros();
		idAutor=0L;

	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public Long getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}

}
