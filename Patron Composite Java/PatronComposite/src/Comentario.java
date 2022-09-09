import java.time.LocalDate;

public class Comentario implements Comparable<Comentario> {

	private String texto;
	private Usuario usuario;
	private LocalDate fechaDada;

	public Comentario(String texto, Usuario user, LocalDate fecha) {
		this.texto = texto;
		this.usuario = user;
		this.fechaDada = fecha;
	}

	public LocalDate getFechaDada() {
		return this.fechaDada;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public String getTexto() {
		return this.texto;
	}

	@Override
	public int compareTo(Comentario o) {

		if (this.getUsuario().getNombre().compareTo(o.getUsuario().getNombre()) == 0) {
			return this.getUsuario().getMail().compareTo(o.getUsuario().getMail());
		}

		return this.getUsuario().getNombre().compareTo(o.getUsuario().getNombre());

	}

}
