package dominio;

import java.io.Serializable;

public class Contacto implements Serializable{

	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;

        
        
    public Contacto(String nombre, String apellidos, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }

        
        
        
        
        
	public String getNombre() {
		return nombre;
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

	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
        
        
        public String toString(){
            
            String r="Nombre: "+nombre+"\n"
                    + "Apellidos: "+apellidos+"\n"
                    + "Telefono: "+telefono+"\n"
                    + "Direccion: "+direccion+"\n";
                    return r;
        }
        
        
        public boolean equals(Contacto c){
            return c.getNombre().equals(nombre);
        }

}