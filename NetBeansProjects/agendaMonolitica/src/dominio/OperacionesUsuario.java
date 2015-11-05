package dominio;

import java.util.Vector;

public class OperacionesUsuario {

	public static void registrarUsuario(String nombre,
                String apellidos,String contrasenna) {
            Usuario u=new Usuario(nombre, apellidos,contrasenna);
            u.guardarUsuario();
	}

	public static Usuario autenticarUsuario(String nombre,String contrasenna) {
            Usuario r= Usuario.leerUsuario(nombre,contrasenna);
            return r;
            
            
	}

	public static void annadirContacto(Usuario u,Contacto c) {
            u.annadirContacto(c);
            u.guardarUsuario();
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
            u.guardarUsuario();
	}

	public static void modificarContacto(Usuario u,Contacto nuevo) {
            Contacto c=OperacionesUsuario.buscarContacto(u, nuevo.getNombre());
            c=nuevo;
            u.guardarUsuario();
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