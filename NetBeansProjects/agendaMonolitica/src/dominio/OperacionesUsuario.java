package dominio;

import java.util.Vector;

public class OperacionesUsuario {

	public static void registrarUsuario(Usuario u) {
            u.guardarUsuario();
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

	public static void modificarContacto(Usuario u,Contacto nuevo) {
            Contacto c=OperacionesUsuario.buscarContacto(u, nuevo.getNombre());
            c=nuevo;
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