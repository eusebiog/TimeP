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

	public static void borrarContacto(Contacto c,Usuario u) {
            Vector<Contacto> contactos=u.getContactos();
            Vector<Contacto> r=new Vector();
            for(Contacto vc:contactos ){
                if(!c.equals(vc)){
                    r.add(vc);
                }
            }
            u.setContactos(r);
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