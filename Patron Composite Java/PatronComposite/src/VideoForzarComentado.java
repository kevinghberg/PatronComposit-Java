
public class VideoForzarComentado extends Video {

	public VideoForzarComentado(String titulo, int duracion, int año, Usuario autor) {
		
		super(titulo, duracion, año, autor);
	
	}
	
	@Override
	public boolean contieneComentario(String texto) {
		return true;
	}

}
