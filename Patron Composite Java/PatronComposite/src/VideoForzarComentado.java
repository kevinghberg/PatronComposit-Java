
public class VideoForzarComentado extends Video {

	public VideoForzarComentado(String titulo, int duracion, int a�o, Usuario autor) {
		
		super(titulo, duracion, a�o, autor);
	
	}
	
	@Override
	public boolean contieneComentario(String texto) {
		return true;
	}

}
