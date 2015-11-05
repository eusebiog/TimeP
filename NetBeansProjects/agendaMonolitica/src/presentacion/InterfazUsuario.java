package presentacion;

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
                        annadircontacto();
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
		// TODO - implement InterfazUsuario.annadircontacto
		throw new UnsupportedOperationException();
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