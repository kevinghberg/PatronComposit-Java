
public class CriterioAutor extends Criterio {
	
	private String autor;
	
	

	public CriterioAutor(String autor) {

		this.autor = autor;
	}



	@Override
	public boolean cumple(ElementoAbstracto e) {
		return e.getAutor().getNombre().equalsIgnoreCase(autor);
		
	}

}
