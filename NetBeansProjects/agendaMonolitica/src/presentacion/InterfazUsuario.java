package presentacion;

import dominio.Contacto;
import dominio.OperacionesUsuario;
import dominio.Usuario;

public class InterfazUsuario {
    
    
        Usuario u;

	public void mostrarMenu() throws Exception {
            boolean salir=false;
            String menu="===MENU===\n"
                    + "1. Autenticarse\n"
                    + "2. Annadir contacto\n"
                    + "3. Buscar contacto\n"
                    + "4. Borrar contacto\n"
                    + "5. Modificar contacto\n"
                    + "6. Registrar usuario\n"
                    + "7. Salir";
            do{
                switch(Leer.entero(menu)){
                    case 1:
                        u=autenticarusuario();
                        if(u==null){
                            System.out.println("Nombre de usuario o contrasenna "
                                    + "erroneos");
                        }
                        else{
                            System.out.println("Autenticado");
                        }
                        break;
                    case 2:
                        if(u!=null){
                            annadircontacto();
                            System.out.println("Annadido");
                        }
                        else{
                            System.out.println("No se ha logueado "
                                    + "en el sistema");
                        }
                        
                        break;
                        
                    
                    case 3:
                        if(u!=null){
                           System.out.println(buscarcontacto());
                        }
                        else{
                            System.out.println("No se ha logueado "
                                    + "en el sistema");
                        }
                        break;
                    case 4:
                        if(u!=null){
                           borrarcontacto();
                            System.out.println("Contacto borrado ");
                        }
                        else{
                            System.out.println("No se ha logueado "
                                    + "en el sistema");
                        }
                        
                        break;
                    case 5:
                        if(u!=null){
                            modificarcontacto();
                            
                        }
                        else{
                            System.out.println("No se ha logueado "
                                    + "en el sistema");
                        }
                        break;
                    case 6:
                        registrarusuario();
                        System.out.println("Usuario registrado con exito");
                        break;
                    case 7:
                        salir=true;
                        break;
                    
                }
                
                
                
                
                
            }while(!salir);
            
            
            
            
            
            
            
            
            
	}
        
	public void registrarusuario() {
            System.out.println("==Usuario nuevo==");
            System.out.println("Nombre de usuario");
            String nombre=Leer.cadena();
            System.out.println("Apellidos del usuario");
            String apellidos=Leer.cadena();
            System.out.println("contrasenna");
            String contrasenna=Leer.cadena();
            System.out.println(contrasenna);
            OperacionesUsuario.registrarUsuario(nombre,apellidos,contrasenna);
            
	}

	public Usuario autenticarusuario() {
            
             System.out.println("Nombre de usuario");
            String nombre=Leer.cadena();
            System.out.println("Contrasenna");
            String contrasenna=Leer.cadena();
            Usuario usuario=OperacionesUsuario.autenticarUsuario(nombre, contrasenna);
            return usuario;
            
            
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
            System.out.println("Nombre nuevo del contacto ");
            String nombre=Leer.cadena();
            System.out.println("Apellidos nuevo del contacto ");
            String apellidos=Leer.cadena();
            System.out.println("Telefono nuevo del contacto ");
            String telefono=Leer.cadena();
            System.out.println("Direccion nueva del contacto");
            String direccion=Leer.cadena();
            Contacto nuevo=new Contacto(nombre,apellidos,telefono,direccion);
            OperacionesUsuario.modificarContacto(u, nuevo);
	}

	public Contacto buscarcontacto() {
            System.out.println("Nombre solicitado");
            String nombre=Leer.cadena();
            return OperacionesUsuario.buscarContacto(u, nombre);
	}


}