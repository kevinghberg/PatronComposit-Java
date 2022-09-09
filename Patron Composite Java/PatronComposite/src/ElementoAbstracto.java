import java.util.ArrayList;

public abstract class ElementoAbstracto {
	
	private String titulo;
	private Usuario autor;
		
	public ElementoAbstracto(String titulo,Usuario autor) {
		this.titulo = titulo;
		this.autor=autor;
	}

	public String getTitulo(){
		return this.titulo;
	}
	
	public Usuario getAutor() {
		return this.autor;
	}
	
	
	public abstract boolean contieneVideoFecha(int año);
	public abstract ArrayList<Comentario> getListaComentarios();
	public abstract int getDuracion();
	public abstract boolean contieneComentario(String comentario);
	public abstract int getCantidadMeGusta();
	public abstract int getCantidadNoMeGusta();
	public abstract int cantVideos();
	public abstract int getCantVisualizaciones();
	public abstract ArrayList<ElementoAbstracto> getCopia(Criterio c);
	
}
