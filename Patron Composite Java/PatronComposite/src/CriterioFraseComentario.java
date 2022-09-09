
public class CriterioFraseComentario extends Criterio {
	
	private String comentario;
	

	public CriterioFraseComentario(String comentario) {

		this.comentario = comentario;
	}


	@Override
	public boolean cumple(ElementoAbstracto e) {
		return e.contieneComentario(comentario);
		
	}

}
