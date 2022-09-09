public class Usuario {

	private String nombre;
	private int añoRegistro;
	private String mail;

	public Usuario(String nombre, int año, String mail) {
		this.nombre = nombre;
		this.añoRegistro = año;
		this.mail = mail;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAñoRegistro() {
		return añoRegistro;
	}

	public String getMail() {
		return mail;
	}	

}
