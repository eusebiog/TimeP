package dominio;

import java.io.Serializable;
import java.util.Vector;
import persistencia.Acceso;

public class Usuario implements Serializable{

	private String nombre;
	private String apellidos;
	private String contrasenna;
	private Vector<Contacto> contactos;

    public Usuario(String nombre, String apellidos, String contrasenna) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contrasenna = contrasenna;
        contactos=new Vector();
    }

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
            Acceso.guardarUsuario(this);
	}

	public static Usuario leerUsuario(String nombre,String contrasenna) {
            Usuario u=Acceso.leerUsuario(nombre);
            return contrasenna.equals(u.getContrasenna())?u:null;
	}

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ","
                + " contrasenna=" + contrasenna + ", contactos=" + contactos + '}';
    }

}