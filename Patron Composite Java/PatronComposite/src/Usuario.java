public class Usuario {

	private String nombre;
	private int a�oRegistro;
	private String mail;

	public Usuario(String nombre, int a�o, String mail) {
		this.nombre = nombre;
		this.a�oRegistro = a�o;
		this.mail = mail;
	}

	public String getNombre() {
		return nombre;
	}

	public int getA�oRegistro() {
		return a�oRegistro;
	}

	public String getMail() {
		return mail;
	}	

}
