

@Applicationpath("/rest")
public class LibraryResource extends MyApplicationLibrary{
	
	@Path("/LivroList")
	public class AlunoResource {
		
		public AlunoResource() {
		}
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Livro> getNomeLivro{
			List<Livro> lista = new ArrayList<Livro>();
			lista.add(new Livro("LivroTeste"));
			return lista;
		}

	}
	

}
