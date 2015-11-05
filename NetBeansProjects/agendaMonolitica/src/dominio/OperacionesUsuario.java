package dominio;

import java.util.Vector;

public class OperacionesUsuario {

	public void registrarUsuario() {
		// TODO - implement OperacionesUsuario.registrarUsuario
		throw new UnsupportedOperationException();
	}

	public Usuario autenticarUsuario() {
		// TODO - implement OperacionesUsuario.autenticarUsuario
		throw new UnsupportedOperationException();
	}

	public static void annadirContacto(Usuario u,Contacto c) {
            u.annadirContacto(c);
            
	}

	public void borrarContacto() {
		// TODO - implement OperacionesUsuario.borrarContacto
		throw new UnsupportedOperationException();
	}

	public void modificarContacto() {
		// TODO - implement OperacionesUsuario.modificarContacto
		throw new UnsupportedOperationException();
	}

	public static Contacto buscarContacto(Usuario u,String nombre) {
            Vector<Contacto> contactos=u.getContactos();
            Contacto r=null;
            for(Contacto c:contactos ){
                if(c.getNombre().equals(nombre)){
                    r=c;
                }
            }
            return r;
	}

}