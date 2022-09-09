import java.util.ArrayList;

public class Video extends ElementoAbstracto {
	
	
private int duracion,cantMegusta,cantNoMeGusta,cantVisualizaciones,a�o;
	
	private ArrayList<Comentario> comentarios;
		
	public Video(String titulo,int duracion,int a�o,Usuario autor) {
		super(titulo,autor);
		this.duracion=duracion;
		this.a�o=a�o;
		this.comentarios=new ArrayList<Comentario>();
		this.cantMegusta=0;
		this.cantNoMeGusta=0;
		this.cantVisualizaciones=0;
	}

	@Override
	public int cantVideos() {
		return 1;
	}
	
	public int getFecha() {
		return this.a�o;
	}

	public void a�adirComentario(Comentario c) {
		comentarios.add(c);
	}
	
	public void darMegusta() {
		this.cantMegusta++;
	}
	
	public void darNoMegusta() {
		this.cantNoMeGusta++;
	}
	
	public void visualizar() {
		this.cantVisualizaciones++;
	}

	@Override
	public int getCantVisualizaciones() {
		return this.cantVisualizaciones;
	}

	@Override
	public ArrayList<ElementoAbstracto> getCopia(Criterio c) {
		ArrayList<ElementoAbstracto> copia = new ArrayList<>();
		if(c.cumple(this)) {
			copia.add(this);
		}
		return copia;
	}

	@Override
	public int getCantidadMeGusta() {
		
		return this.cantMegusta;
	}

	@Override
	public int getCantidadNoMeGusta() {
		
		return this.cantNoMeGusta;
	}

	@Override
	public boolean contieneComentario(String texto) {
		for (Comentario c : comentarios) {
			if(c.getTexto().contains(texto)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean contieneVideoFecha(int a�o) {
		return this.getFecha()==a�o;
	}

	@Override
	public ArrayList<Comentario> getListaComentarios() {
		ArrayList<Comentario> copia = new ArrayList<Comentario>();
		for (Comentario comentario : comentarios) {
			copia.add(comentario);
		}
		return copia;
	}

	@Override
	public int getDuracion() {
		return this.duracion;
	}
	

}
