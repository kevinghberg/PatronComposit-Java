import java.util.ArrayList;
import java.util.Collections;

public class Playlist extends ElementoAbstracto {

	private ArrayList<ElementoAbstracto> elementos;
	private int tiempoCarga;

	public Playlist(String titulo,Usuario autor,int tiempoCarga) {
		super(titulo,autor);
		this.tiempoCarga=tiempoCarga;
		this.elementos = new ArrayList<>();
	}

	public ArrayList<ElementoAbstracto> getListaElementos() {
		return new ArrayList<ElementoAbstracto>(elementos);
	}

	public void addElemento(ElementoAbstracto e) {
		if (!elementos.contains(e)) {
			elementos.add(e);
		}
	}

	@Override
	public int cantVideos() {
		int suma = 0;
		for (ElementoAbstracto elementoAbstracto : elementos) {
			suma = suma + elementoAbstracto.cantVideos();
		}
		return suma;
	}

	@Override
	public ArrayList<ElementoAbstracto> getCopia(Criterio c) {
		ArrayList<ElementoAbstracto> copia=new ArrayList<ElementoAbstracto>();
		if(c.cumple(this)) {
			copia.add(this);
		}
		else {
			for (ElementoAbstracto elementoAbstracto : copia) {
				copia.addAll(elementoAbstracto.getCopia(c));
			}
		}
		return copia;
	}

	@Override
	public int getCantVisualizaciones() {
		int suma=0;
		for (ElementoAbstracto elementoAbstracto : elementos) {
			suma=suma+elementoAbstracto.getCantVisualizaciones();
		}
		return suma;
	}

	@Override
	public boolean contieneVideoFecha(int año) {
		for (ElementoAbstracto e : elementos) {
			if(e.contieneVideoFecha(año)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int getCantidadMeGusta() {
		int suma=0;
		for (ElementoAbstracto elementoAbstracto : elementos) {
			suma=suma+elementoAbstracto.getCantidadMeGusta();
		}
		return suma;
	}

	@Override
	public int getCantidadNoMeGusta() {
		int suma=0;
		for (ElementoAbstracto elementoAbstracto : elementos) {
			suma=suma+elementoAbstracto.getCantidadNoMeGusta();
		}
		return suma;
	}

	@Override
	public boolean contieneComentario(String texto) {
		for (ElementoAbstracto e : elementos) {
			if(e.contieneComentario(texto)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Comentario> getListaComentarios() {
		ArrayList<Comentario> copia=new ArrayList<Comentario>();
		
		for (ElementoAbstracto e : elementos) {
			copia.addAll(e.getListaComentarios());
		}
		
		Collections.sort(copia);
		return copia;
	}

	@Override
	public int getDuracion() {
		int suma=0;
		for (ElementoAbstracto e : elementos) {
			suma=suma+e.getDuracion();
		}
		return suma+this.tiempoCarga;
	}
	
	

}
