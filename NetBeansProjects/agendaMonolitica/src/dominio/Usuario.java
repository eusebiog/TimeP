package dominio;

import java.util.Vector;

public class Usuario {

	private String nombre;
	private String apellidos;
	private String contrasenna;
	private Vector<Contacto> contactos;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	/**
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getContrasenna() {
		return this.contrasenna;
	}

	/**
	 * 
	 * @param contrasenna
	 */
	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}

	public Vector<Contacto> getContactos() {
		return this.contactos;
	}

	/**
	 * 
	 * @param contactos
	 */
	public void setContactos(Vector<Contacto> contactos) {
		this.contactos = contactos;
	}
        
        public void annadirContacto(Contacto c){
            contactos.add(c);
        }
        
        

	public void guardarUsuario() {
		// TODO - implement Usuario.guardarUsuario
		throw new UnsupportedOperationException();
	}

	public static Usuario leerUsuario() {
            return null;
	}

}