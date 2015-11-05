package presentacion;

import dominio.Contacto;
import dominio.OperacionesUsuario;
import dominio.Usuario;

public class InterfazUsuario {
    
    
        Usuario u;

	public void mostrarMenu() throws Exception {
            boolean salir=false;
            String menu="===MENU===\n"
                    + "1. Annadir contacto"
                    + "2. Buscar contacto"
                    + "3. Borrar contacto";
            do{
                switch(Leer.entero(menu)){
                    case 1:
                        if(u!=null){
                            annadircontacto();
                            System.out.println("Annadido");
                        }
                        else{
                            System.out.println("No se ha logueado "
                                    + "en el sistema");
                        }
                        break;
                        
                    
                    case 2:
                        if(u!=null){
                           System.out.println(buscarcontacto());
                        }
                        else{
                            System.out.println("No se ha logueado "
                                    + "en el sistema");
                        }
                        break;
                    case 3:
                        if(u!=null){
                           borrarcontacto();
                            System.out.println("Contacto borrado ");
                        }
                        else{
                            System.out.println("No se ha logueado "
                                    + "en el sistema");
                        }
                        
                        break;
                    case 4:
                        salir=true;
                        break;
                    
                }
                
                
                
                
                
            }while(!salir);
            
            
            
            
            
            
            
            
            
	}
        
	public void registrarusuario() {
		// TODO - implement InterfazUsuario.registrarusuario
		throw new UnsupportedOperationException();
	}

	public void autenticarusuario() {
		// TODO - implement InterfazUsuario.autenticarusuario
		throw new UnsupportedOperationException();
	}

	public void annadircontacto() {
            System.out.println("Nombre del contacto nuevo");
            String nombre=Leer.cadena();
            System.out.println("Apellidos del contacto nuevo");
            String apellidos=Leer.cadena();
            System.out.println("Telefono del contacto nuevo");
            String telefono=Leer.cadena();
            System.out.println("Direccion del contacto nuevo");
            String direccion=Leer.cadena();
            
            Contacto nuevo=new Contacto( nombre,  apellidos,
                    telefono, direccion);
            OperacionesUsuario.annadirContacto(u, nuevo);
            
            
            
            
	}

	public void borrarcontacto() {
            Contacto c=buscarcontacto();
            OperacionesUsuario.borrarContacto(c, u);
	}

	public void modificarcontacto() {
		// TODO - implement InterfazUsuario.modificarcontacto
		throw new UnsupportedOperationException();
	}

	public Contacto buscarcontacto() {
            System.out.println("Nombre solicitado");
            String nombre=Leer.cadena();
            return OperacionesUsuario.buscarContacto(u, nombre);
	}


}