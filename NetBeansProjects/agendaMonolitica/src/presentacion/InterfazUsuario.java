package presentacion;

import dominio.Contacto;
import dominio.OperacionesUsuario;
import dominio.Usuario;

public class InterfazUsuario {
    
    
        Usuario u;

	public void mostrarMenu() throws Exception {
            boolean salir=false;
            String menu="===MENU===\n"
                    + "1. Annadir contacto";
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
		// TODO - implement InterfazUsuario.borrarcontacto
		throw new UnsupportedOperationException();
	}

	public void modificarcontacto() {
		// TODO - implement InterfazUsuario.modificarcontacto
		throw new UnsupportedOperationException();
	}

	public void buscarcontacto() {
		// TODO - implement InterfazUsuario.buscarcontacto
		throw new UnsupportedOperationException();
	}

	public void operation() {
		// TODO - implement InterfazUsuario.operation
		throw new UnsupportedOperationException();
	}

}